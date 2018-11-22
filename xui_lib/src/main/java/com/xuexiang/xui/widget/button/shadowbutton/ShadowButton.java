package com.xuexiang.xui.widget.button.shadowbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.xuexiang.xui.R;

/**
 * 可设置阴影效果的Button
 *
 * @author XUE
 * @date 2017/9/13 14:21
 */
public class ShadowButton extends BaseShadowButton {

    private int COVER_ALPHA = 48;
    private Paint mPressedPaint;
    private int mPressedColor;


    public ShadowButton(Context context) {
        super(context);
    }


    public ShadowButton(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }


    public ShadowButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void init(Context context, AttributeSet attrs) {
        super.init(context, attrs);
        final TypedArray typedArray = context.obtainStyledAttributes(attrs,
                R.styleable.ShadowButton);
        COVER_ALPHA = typedArray.getInteger(R.styleable.ShadowButton_sb_alpha_pressed,
                COVER_ALPHA);
        mPressedColor = typedArray.getColor(R.styleable.ShadowButton_sb_color_pressed,
                getResources().getColor(R.color.default_shadow_button_color_pressed));
        typedArray.recycle();

        mPressedPaint = new Paint();
        mPressedPaint.setStyle(Paint.Style.FILL);
        mPressedPaint.setColor(mPressedColor);
        mPressedPaint.setAlpha(0);
        mPressedPaint.setAntiAlias(true);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mShapeType == 0) {
            canvas.drawCircle(mWidth / 2, mHeight / 2, mWidth / 2.1038f,
                    mPressedPaint);
        } else {
            RectF rectF = new RectF();
            rectF.set(0, 0, mWidth, mHeight);
            canvas.drawRoundRect(rectF, mRadius, mRadius, mPressedPaint);
        }
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                mPressedPaint.setAlpha(COVER_ALPHA);
                invalidate();
                break;
            case MotionEvent.ACTION_CANCEL:
            case MotionEvent.ACTION_UP:
                mPressedPaint.setAlpha(0);
                invalidate();
                break;
        }
        return super.onTouchEvent(event);
    }


    public int getPressedColor() {
        return mPressedColor;
    }


    /**
     * Set the pressed color.
     *
     * @param pressedColor pressed color
     */
    public void setPressedColor(int pressedColor) {
        mPressedPaint.setColor(mPressedColor);
        invalidate();
    }
}
