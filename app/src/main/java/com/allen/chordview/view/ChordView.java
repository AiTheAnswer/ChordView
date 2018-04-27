package com.allen.chordview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Region;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.allen.chordview.entity.ChordEntity;
import com.allen.chordview.entity.ChordGroup;
import com.allen.chordview.utils.DensityUtil;

import java.util.ArrayList;
import java.util.List;

import static android.graphics.Path.FillType.EVEN_ODD;

public class ChordView extends View {
    private Context mContext;
    private String[] colors = {"#FBB367", "#80B1D2", "#FB8070", "#CC99FF", "#B0D961",
            "#99CCCC", "#BEBBD8", "#FFCC99", "#8DD3C8", "#FF9999",
            "#CCEAC4", "#BB81BC", "#FBCCEC", "#CCFF66", "#99CC66",
            "#66CC66", "#FF6666", "#FFED6F", "#ff7f50", "#87cefa"};
    //View的宽度
    private int mWidth;
    //View的高度
    private int mHeight;
    //圆环的圆心坐标
    private Point mCenterPoint;
    //图例和圆环之间的间隔
    private int legendPadding;
    //图例名称的最大长度
    private float mLegendMaxTextLength;
    //图例文字大小
    private float mLegendTextSize;
    //圆环宽度和外圆半径的比例
    private float mRingWidthProportion;
    //圆环的宽度
    private float mRingWidth;
    //连接线边界的宽度
    private float mLinkLineWidth;
    //圆环外圆的半径
    private float mOuterRingRadius;
    //圆环内圆的半径
    private float mInnerRingRadius;
    //圆环的半径
    private float mRingRadius;
    //圆环外切矩形
    private RectF mOuterRect;
    //圆环内圆的外切矩形
    private RectF mInnerRect;
    //圆环路径集合
    private List<Path> mRingPaths;
    //圆环的画笔
    private Paint mRingPaint;
    //连接线的画笔
    private Paint mLinkLinePaint;
    //和弦图的数据集合
    private List<ChordGroup> mChordGroups;
    //数据组和个体数据的个数
    private int number = 0;
    //比重之和
    private int weightSum = 0;
    /**
     * 绘制图例文字的画笔
     */
    private Paint mLegendPaint;
    /**
     * 将用户实体数据转换为绘制的实体数据
     */
    private List<ChordEntity> mEntityList;
    /**
     * 圆环选中的实体
     */
    private List<ChordEntity> mRingSelectEntities;
    /**
     * 连接线选中的实体
     */
    private List<ChordEntity> mLineSelectEntities;

    private ChordLayout chordLayout;

    public ChordView(Context context) {
        this(context, null);
    }

    public ChordView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ChordView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        init();
        initPaint();
    }

    /**
     * 基本数据初始化
     */
    private void init() {
        //圆心坐标点
        mCenterPoint = new Point();
        //图例文字大小
        mLegendTextSize = DensityUtil.sp2px(mContext, 12);
        //圆环比例
        mRingWidthProportion = 0.15f;
        //图例的宽度
        mLegendMaxTextLength = DensityUtil.dip2px(mContext, 50);
        //数据集合
        mEntityList = new ArrayList<>();
        //图例和圆环之间的间隔
        legendPadding = DensityUtil.dip2px(mContext, 3);
        //连接线边界的宽度
        mLinkLineWidth = DensityUtil.dip2px(mContext, 1.5f);
        //圆环路径集合
        mRingPaths = new ArrayList<>();
        //选中圆环的实体集合
        mRingSelectEntities = new ArrayList<>();
        //选中连接线实体集合
        mLineSelectEntities = new ArrayList<>();
    }

    /**
     * 初始化画笔
     */
    private void initPaint() {
        //画圆环的画笔
        mRingPaint = new Paint();
        mRingPaint.setAntiAlias(true);
        mRingPaint.setStyle(Paint.Style.STROKE);
        //画图例的画笔
        mLegendPaint = new Paint();
        mLegendPaint.setAntiAlias(true);
        mLegendPaint.setStyle(Paint.Style.FILL);
        mLegendPaint.setColor(Color.BLACK);
        mLegendPaint.setTextSize(mLegendTextSize);
        //画连接线
        mLinkLinePaint = new Paint();
        mLinkLinePaint.setAntiAlias(true);
        mLinkLinePaint.setStyle(Paint.Style.FILL);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mHeight = MeasureSpec.getSize(heightMeasureSpec);
        mWidth = MeasureSpec.getSize(widthMeasureSpec);
        mCenterPoint.x = mWidth / 2;
        mCenterPoint.y = mHeight / 2;
        initData();

    }

    /**
     * 设置数据
     *
     * @param chordGroups 和弦图组数据
     */
    public void setData(List<ChordGroup> chordGroups) {
        if (null == chordGroups) {
            return;
        }
        if (!(chordGroups.size() > 0)) {
            return;
        }
        this.mChordGroups = chordGroups;
        calculateData();
        invalidate();
    }

    /**
     * 计算数据，将使用者设置的数据计算转换为绘制数据
     */
    private void calculateData() {
        //计算权重和数据个数
        calculateWeightAndNumber();
        float unitWeightAngle = (360.0f - 3 * number) / weightSum;
        float startAngle = 0;
        //添加组数据
        for (int i = 0; i < mChordGroups.size(); i++) {
            ChordGroup chordGroup = mChordGroups.get(i);
            if (null == chordGroup) {
                continue;
            } else if (null == chordGroup.getChordGroup()) {
                continue;
            }
            chordGroup.setGroupId(i);
            ChordEntity groupEntity = new ChordEntity(chordGroup.getGroupName(), chordGroup.getWeight());
            groupEntity.setParams(startAngle, unitWeightAngle * groupEntity.getWeight(), 1, i);
            mEntityList.add(groupEntity);
            startAngle = startAngle + unitWeightAngle * groupEntity.getWeight() + 3;
            chordGroup.setGroupEndAngle(startAngle - 3);
        }

        //添加个体数据
        for (int i = 0; i < mChordGroups.size(); i++) {
            ChordGroup chordGroup;
            if (i == 0) {
                chordGroup = mChordGroups.get(mChordGroups.size() - 1);
            } else {
                chordGroup = mChordGroups.get(i - 1);
            }

            if (null == chordGroup) {
                continue;
            } else if (null == chordGroup.getChordGroup()) {
                continue;
            }
            int groupId = chordGroup.getGroupId();
            float groupEndAngle = chordGroup.getGroupEndAngle();
            List<ChordEntity> chordEntities = chordGroup.getChordGroup();
            for (ChordEntity chordEntity : chordEntities) {
                chordEntity.setParams(startAngle, unitWeightAngle * chordEntity.getWeight(), 0, groupId);
                chordEntity.setGroupParams(groupEndAngle);
                mEntityList.add(chordEntity);
                startAngle += unitWeightAngle * chordEntity.getWeight() + 3;
                groupEndAngle -= unitWeightAngle * chordEntity.getWeight();
            }
        }
    }

    /**
     * 计算权重和数据个数
     */
    private void calculateWeightAndNumber() {
        weightSum = 0;
        for (ChordGroup chordGroup : mChordGroups) {
            if (null == chordGroup) {
                continue;
            } else if (null == chordGroup.getChordGroup()) {
                continue;
            }
            weightSum += chordGroup.getWeight();
            number++;
            number += chordGroup.getChordGroup().size();
        }
        weightSum *= 2;
    }

    /**
     * 测量完成之和回调
     */
    private void initData() {
        chordLayout = (ChordLayout) getParent();
        //圆环外圆的半径
        mOuterRingRadius = Math.min(mWidth, mHeight) / 2 - mLegendMaxTextLength;
        //圆环宽度
        mRingWidth = mOuterRingRadius * mRingWidthProportion;
        //圆环的半径
        mRingRadius = mOuterRingRadius - mRingWidth / 2;
        //圆环内圆的半径
        mInnerRingRadius = mOuterRingRadius - mRingWidth;
        //设置绘制圆环画笔的宽度
        mRingPaint.setStrokeWidth(mRingWidth);
        float contentLeft = mWidth / 2 - mRingRadius;
        float contentTop = mHeight / 2 - mRingRadius;
        float contentRight = contentLeft + mRingRadius * 2;
        float contentBottom = contentTop + mRingRadius * 2;
        mOuterRect = new RectF(contentLeft, contentTop, contentRight, contentBottom);
        mInnerRect = new RectF(contentLeft + mRingWidth / 2, contentTop + mRingWidth / 2, contentRight - mRingWidth / 2, contentBottom - mRingWidth / 2);
        //根据实体数据计算绘制圆环路径
        calculateRingPath();
        //根据实体数据计算连接线路径集合
        calculateLinkLinePath();
    }

    /**
     * 计算圆环数据
     */
    private void calculateRingPath() {
        mRingPaths.clear();
        for (ChordEntity chordEntity : mEntityList) {
            Path ringPath = new Path();
            /*float outerStartX = (float) (mOuterRingRadius * Math.cos(Math.toRadians(chordEntity.getStartAngle() - 2)));
            float outerStartY = (float) (mOuterRingRadius * Math.sin(Math.toRadians(chordEntity.getStartAngle() - 2)));
            ringPath.moveTo(outerStartX, outerStartY);*/
            ringPath.addArc(mOuterRect, chordEntity.getStartAngle(), chordEntity.getSweepAngle());
            /*float innerStartX = (float) (mInnerRingRadius * Math.cos(Math.toRadians(chordEntity.getEndAngle() - 2)));
            float innerStartY = (float) (mInnerRingRadius * Math.sin(Math.toRadians(chordEntity.getEndAngle() - 2)));
            ringPath.lineTo(innerStartX, innerStartY);
            ringPath.addArc(mInnerRect, chordEntity.getEndAngle() - 2, chordEntity.getStartAngle() - 2);
            ringPath.close();*/
            chordEntity.setRingPath(ringPath);
            //mRingPaths.add(ringPath);
        }
    }

    /**
     * 计算连接线路径之和
     */
    private void calculateLinkLinePath() {
        for (ChordEntity chordEntity : mEntityList) {
            if (chordEntity.getType() == 1) {
                continue;
            }
            Path linePath = new Path();
            Point point1 = reTransform(angleTransformPoint(chordEntity.getGroupEndAngle()));
            Point point2 = reTransform(angleTransformPoint(chordEntity.getStartAngle()));
            Point point3 = reTransform(angleTransformPoint(chordEntity.getGroupStartAngle()));
            Point point4 = reTransform(angleTransformPoint(chordEntity.getEndAngle()));
            linePath.moveTo(point3.x, point3.y);
            linePath.addArc(mInnerRect, chordEntity.getGroupStartAngle(), chordEntity.getSweepAngle());
            // linePath.lineTo(point1.x, point1.y);
            linePath.quadTo(mCenterPoint.x, mCenterPoint.y, point2.x, point2.y);
            // linePath.lineTo(point2.x, point2.y);
            linePath.addArc(mInnerRect, chordEntity.getStartAngle(), chordEntity.getSweepAngle());
            //linePath.lineTo(point4.x, point4.y);
            linePath.quadTo(mCenterPoint.x, mCenterPoint.y, point3.x, point3.y);
            //linePath.lineTo(point3.x, point3.y);
            chordEntity.setLinkLinePath(linePath);

        }
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (null != mChordGroups && mChordGroups.size() > 0) {
            //暂无数据
        }
        drawRing(canvas);
        drawLinkLine(canvas);
        drawLegendText(canvas);
        /*mRingPaint.setStrokeWidth(2);
        canvas.drawRect(mOuterRect, mRingPaint);
        Point startPoint = reTransform(new Point(0, (int) mOuterRingRadius));
        Point endPoint = reTransform(new Point(0, (int) -mOuterRingRadius));
        Point startPointX = reTransform(new Point(((int) -mOuterRingRadius), 0));
        Point endPointX = reTransform(new Point((int) mOuterRingRadius, 0));
        canvas.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y, mRingPaint);
        canvas.drawLine(startPointX.x, startPointX.y, endPointX.x, endPointX.y, mRingPaint);*/

    }

    /**
     * 绘制圆环
     *
     * @param canvas 画布
     */
    private void drawRing(Canvas canvas) {
        for (int i = 0; i < mEntityList.size(); i++) {
            mRingPaint.setColor(Color.parseColor(colors[i % colors.length]));
            ChordEntity chordEntity = mEntityList.get(i);
            Path path = chordEntity.getRingPath();
            if (mRingSelectEntities.size() == 0 && mLineSelectEntities.size() == 0) {//没有选中的
                mRingPaint.setAlpha(255);
            } else if (mRingSelectEntities.contains(chordEntity) || mLineSelectEntities.contains(chordEntity)) {
                mRingPaint.setAlpha(255);
            } else {
                mRingPaint.setAlpha(80);
            }

            canvas.drawPath(path, mRingPaint);
        }
    }

    /**
     * 绘制连接线
     *
     * @param canvas 画布
     */
    private void drawLinkLine(Canvas canvas) {
        for (int i = mEntityList.size() - 1; i >= 0; i--) {
            ChordEntity chordEntity = mEntityList.get(i);
            if (chordEntity.getType() != 0) {
                continue;
            }
            mLinkLinePaint.setColor(Color.parseColor(colors[chordEntity.getGroupId() % colors.length]));
            if (mRingSelectEntities.size() == 0 && mLineSelectEntities.size() == 0) {//没有选中的
                mLinkLinePaint.setAlpha(180);
            } else if (mRingSelectEntities.contains(chordEntity) || mLineSelectEntities.contains(chordEntity)) {
                mLinkLinePaint.setAlpha(255);
            } else {
                mLinkLinePaint.setAlpha(80);
            }

            Path path = chordEntity.getLinkLinePath();
            mLinkLinePaint.setStyle(Paint.Style.FILL_AND_STROKE);
            canvas.drawPath(path, mLinkLinePaint);
            mLinkLinePaint.setStyle(Paint.Style.STROKE);
            mLinkLinePaint.setStrokeWidth(2);
            mLinkLinePaint.setColor(Color.GRAY);
            canvas.drawPath(path, mLinkLinePaint);
        }
    }

    /**
     * 绘制图例文字
     *
     * @param canvas 画布
     */
    private void drawLegendText(Canvas canvas) {
        for (int i = 0; i < mEntityList.size(); i++) {
            ChordEntity chordEntity = mEntityList.get(i);
            if (i == 0) {
                canvas.rotate(chordEntity.getSweepAngle() / 2 + 1.5f, mCenterPoint.x, mCenterPoint.y);
            } else {
                canvas.rotate(chordEntity.getSweepAngle() / 2 + mEntityList.get(i - 1).getSweepAngle() / 2 + 3, mCenterPoint.x, mCenterPoint.y);
            }
            Point point = reTransform(new Point((int) mOuterRingRadius + legendPadding, 0));
            mRingPaint.setColor(Color.BLACK);
            if (mRingSelectEntities.size() == 0 && mLineSelectEntities.size() == 0) {//没有选中的
                mLegendPaint.setAlpha(180);
            } else if (mRingSelectEntities.contains(chordEntity) || mLineSelectEntities.contains(chordEntity)) {
                mLegendPaint.setAlpha(255);
            } else {
                mLegendPaint.setAlpha(80);
            }
            canvas.drawText(chordEntity.getLegendName(), point.x, point.y, mLegendPaint);

        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                Point point = new Point();
                point.x = (int) event.getX();
                point.y = (int) event.getY();
                onActionDown(point);
                break;
            default:
                break;
        }

        return super.onTouchEvent(event);
    }

    /**
     * 点击的时候
     *
     * @param point 点击的点
     */
    private void onActionDown(Point point) {
        chordLayout.setMarkViewGone();
        //先清空选中的数据
        mRingSelectEntities.clear();
        mLineSelectEntities.clear();
        Point transform = transform(point);
        if (isArc(transform)) {
            int rotation = getRotationBetweenLines(0, 0, transform.x, transform.y);
            for (ChordEntity chordEntity : mEntityList) {
                if (chordEntity.contains(rotation)) {
                    //Toast.makeText(mContext,chordEntity.getLegendName(),Toast.LENGTH_SHORT).show();
                    chordLayout.showMark(point, chordEntity.getLegendName());
                    mRingSelectEntities.add(chordEntity);
                    if (chordEntity.getType() == 0) {//个体
                        for (ChordEntity chordEntity1 : mEntityList) {
                            if (chordEntity1.getType() == 1) {
                                if (chordEntity1.getGroupId() == chordEntity.getGroupId()) {
                                    mRingSelectEntities.add(chordEntity1);
                                    break;
                                }
                            }
                        }
                    } else {//组
                        for (ChordEntity chordEntity1 : mEntityList) {
                            if (chordEntity1.getType() == 0) {
                                if (chordEntity1.getGroupId() == chordEntity.getGroupId()) {
                                    mRingSelectEntities.add(chordEntity1);
                                }
                            }
                        }
                    }
                    invalidate();
                    return;
                }
            }
        } else {
            isOnLinkLine(point);
        }
        invalidate();
    }

    /**
     * 判断点击的点是否在连接线上
     */
    private void isOnLinkLine(Point point) {
        for (int i = 0; i < mEntityList.size(); i++) {
            ChordEntity chordEntity = mEntityList.get(i);
            if (chordEntity.getType() != 0) {
                continue;
            }
            if (pointInPath(chordEntity.getLinkLinePath(), point)) {
                mLineSelectEntities.add(chordEntity);
                chordLayout.showMark(point, chordEntity.getLegendName());
                for (ChordEntity chordEntity1 : mEntityList) {
                    if (chordEntity1.getType() == 1 && chordEntity1.getGroupId() == chordEntity.getGroupId()) {
                        mLineSelectEntities.add(chordEntity1);
                        break;
                    }
                }
                break;
            }
        }
    }


    /**
     * 判断点击的点是否在圆弧上
     *
     * @param point 点击的点
     */
    private boolean isArc(Point point) {
        if (Math.pow(point.x, 2) + Math.pow(point.y, 2) > Math.pow(mInnerRingRadius, 2) &&
                Math.pow(point.x, 2) + Math.pow(point.y, 2) < Math.pow(mOuterRingRadius + mLegendMaxTextLength, 2)) {//外圆内，内圆外
            return true;
        } else {
            return false;
        }
    }

    /**
     * 获取点击点和x轴的夹角（顺时针为正角）
     *
     * @param centerX 交点x轴坐标
     * @param centerY 交点y轴坐标
     * @param xInView 点击点x轴坐标
     * @param yInView 点击点y轴坐标
     * @return 点击点和x轴的夹角（顺时针为正角）
     */
    public int getRotationBetweenLines(float centerX, float centerY, float xInView, float yInView) {
        double rotation = 0;
        double k1 = 0;
        double k2;
        if (xInView == centerX) {
            k2 = 1;
        } else {
            k2 = (double) (yInView - centerY) / (xInView - centerX);
        }
        double tmpDegree = Math.atan((Math.abs(k1 - k2)) / (1 + k1 * k2)) / Math.PI * 180;

        if (xInView > centerX && yInView < centerY) {  //第四象限
            rotation = tmpDegree;
        } else if (xInView > centerX && yInView > centerY) //第一象限
        {
            rotation = 360 - tmpDegree;
        } else if (xInView < centerX && yInView > centerY) { //第二象限
            rotation = 180 + tmpDegree;
        } else if (xInView < centerX && yInView < centerY) { //第三象限
            rotation = 180 - tmpDegree;
        } else if (xInView == centerX && yInView < centerY) {
            rotation = 90;
        } else if (xInView == centerX && yInView > centerY) {
            rotation = 270;
        }

        return (int) rotation;
    }


    /**
     * 将屏幕点击的点转化为相对于圆心坐标系的点
     *
     * @param point 要转换的点
     * @return 转化后点的坐标
     */
    private Point transform(Point point) {
        Point transformPoint = new Point();
        transformPoint.x = point.x - mCenterPoint.x;
        transformPoint.y = mCenterPoint.y - point.y;
        return transformPoint;
    }

    /**
     * 将基于圆心坐标的点转化为屏幕坐标点
     *
     * @param point 要转换的点
     * @return 转化后点的坐标
     */
    private Point reTransform(Point point) {
        Point transformPoint = new Point();
        transformPoint.x += point.x + mCenterPoint.x;
        transformPoint.y = mCenterPoint.y - point.y;
        return transformPoint;
    }

    /**
     * 根据角度获取圆环内圆上的点
     *
     * @return 内圆上的点
     */
    private Point angleTransformPoint(float angle) {
        Point point = new Point();
        point.x = (int) (mInnerRingRadius * Math.cos(angle * Math.PI / 180));
        point.y = (int) (-mInnerRingRadius * Math.sin(angle * Math.PI / 180));
        return point;
    }

    /**
     * 判断某个点是否在某个路径内
     *
     * @param path  路径
     * @param point 所要判断的点
     * @return true 在路径内 false 不在路径内
     */
    private boolean pointInPath(Path path, Point point) {
        RectF bounds = new RectF();
        path.computeBounds(bounds, true);
        Region region = new Region();
        region.setPath(path, new Region((int) bounds.left, (int) bounds.top, (int) bounds.right, (int) bounds.bottom));
        return region.contains(point.x, point.y);
    }
}
