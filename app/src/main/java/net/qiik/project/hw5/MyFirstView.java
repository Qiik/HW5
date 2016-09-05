package net.qiik.project.hw5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by NotePad1 on 05.09.2016.
 */

public class MyFirstView extends View {
    private final Paint mPaint;
    private final RectF mRect;
    private final int mRadius;

    public MyFirstView(Context context) {
        this(context, null);
    }

    public MyFirstView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyFirstView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.MyFirstView);
        mRadius = typedArray.getDimensionPixelSize(R.styleable.MyFirstView_radius, 90);

        typedArray.recycle();

        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(ContextCompat.getColor(getContext(), R.color.colorPrimary));

        mRect = new RectF();
    }

    // основные методы
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(getRight() / 2, getBottom() / 2, mRadius, mPaint);
    }
}
