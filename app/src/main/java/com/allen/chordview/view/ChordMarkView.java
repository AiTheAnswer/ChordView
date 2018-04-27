package com.allen.chordview.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.allen.chordview.R;


public class ChordMarkView extends RelativeLayout {
    private Context mContext;
    private TextView textView;
    private String markText = "";

    public ChordMarkView(Context context) {
        super(context);
        this.mContext = context;
        setupLayoutResource();

    }

    private void setupLayoutResource() {
        View inflated = LayoutInflater.from(mContext).inflate(R.layout.marker_view, this);
        textView = findViewById(R.id.tv_marker_time);
        textView.setText(markText);
        inflated.setLayoutParams(new LayoutParams(-2, -2));
        inflated.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
        inflated.layout(0, 0, inflated.getMeasuredWidth(), inflated.getMeasuredHeight());
    }

    /**
     * 设置markView的文本
     *
     * @param markText mark显示的文本
     */
    public void setMarkText(String markText) {
        this.markText = markText;
        if (null != textView) {
            textView.setText(markText);
        }
    }

}
