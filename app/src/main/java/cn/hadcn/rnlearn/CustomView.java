package cn.hadcn.rnlearn;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author dq
 */
public class CustomView extends View {
    private Paint mPaint = new Paint();
    private String mText;

    public CustomView(final Context context) {
        super(context);
    }

    public CustomView(final Context context, @Nullable final AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(final Context context, @Nullable final AttributeSet attrs, final int
            defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CustomView(final Context context, @Nullable final AttributeSet attrs, final int
            defStyleAttr, final int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void setColor(int color) {
        mPaint.setColor(color);
        mPaint.setTextSize(100);
        invalidate();
    }

    public void setText(String text) {
        mText = text;
        invalidate();
    }

    @Override
    protected void onDraw(final Canvas canvas) {
        canvas.drawText(mText, 200, 200, mPaint);
    }
}
