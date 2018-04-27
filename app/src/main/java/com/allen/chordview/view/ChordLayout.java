package com.allen.chordview.view;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

import com.allen.chordview.entity.ChordGroup;
import com.allen.chordview.utils.DensityUtil;

import java.util.List;

public class ChordLayout extends RelativeLayout {
    private Context mContext;
    private int mWidth;
    private int mHeight;
    private ChordView chordView;
    private ChordMarkView chordMarkView;
    private Point markViewPoint;


    public ChordLayout(Context context) {
        this(context, null);
    }

    public ChordLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ChordLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        init();
    }

    private void init() {
        chordView = new ChordView(mContext);
        RelativeLayout.LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        chordView.setLayoutParams(params);
        chordMarkView = new ChordMarkView(mContext);
        chordMarkView.setVisibility(View.GONE);
        addView(chordView);
        addView(chordMarkView);
    }

    public void showMark(Point point, String markText) {
        chordMarkView.setVisibility(VISIBLE);
        chordMarkView.setMarkText(markText);
        if (point.x + chordMarkView.getWidth() + DensityUtil.dip2px(mContext, 10) > mWidth) {
            point.x = mWidth - chordMarkView.getWidth() - DensityUtil.dip2px(mContext, 10);
        }
        if (point.y < (chordMarkView.getHeight()) / 2) {
            point.y = (chordMarkView.getHeight()) / 2;
        } else if (point.y + (chordMarkView.getHeight()) / 2 > mHeight) {
            point.y = mHeight - (chordMarkView.getHeight()) / 2;
        }
        markViewPoint = point;
        invalidate();
    }

    public void setMarkViewGone() {
        chordMarkView.setVisibility(GONE);
    }

    public void setData(List<ChordGroup> chordGroups) {
        chordView.setData(chordGroups);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mWidth = MeasureSpec.getSize(widthMeasureSpec);
        mHeight = MeasureSpec.getSize(heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        View childView = getChildAt(1);
        if(null != markViewPoint){
            childView.layout(markViewPoint.x, markViewPoint.y, markViewPoint.x + childView.getWidth(), markViewPoint.y + childView.getHeight());
        }

    }
}
