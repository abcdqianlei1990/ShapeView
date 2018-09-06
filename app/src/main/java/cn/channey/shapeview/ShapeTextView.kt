package cn.channey.shapeview

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import android.widget.TextView

/**
 * 可设置shape的TextView
 */
class ShapeTextView :TextView {
    private var mSolidColor:Int = 0
    private var mRadius = 0
    private var mTopLeftRadius = 0
    private var mTopRightRadius = 0
    private var mBottomLeftRadius = 0
    private var mBottomRightRadius = 0
    private var mStrokeWidth = 0
    private var mStrokeColor:Int = 0
    constructor(context: Context):super(context){

    }

    constructor(context: Context, attrs: AttributeSet):super(context, attrs){
        initAttrs(attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr:Int):super(context, attrs, defStyleAttr){
        initAttrs(attrs)
    }

    private fun initAttrs(attrs: AttributeSet) {
        val array = context.obtainStyledAttributes(attrs, R.styleable.ShapeTextView)
        mSolidColor = array.getColor(R.styleable.ShapeTextView_shape_solid, resources.getColor(R.color.white))
        mRadius = array.getDimensionPixelSize(R.styleable.ShapeTextView_shape_radius,0)
        mTopLeftRadius = array.getDimensionPixelSize(R.styleable.ShapeTextView_shape_topLeftRadius,0)
        mTopRightRadius = array.getDimensionPixelSize(R.styleable.ShapeTextView_shape_topRightRadius,0)
        mBottomLeftRadius = array.getDimensionPixelSize(R.styleable.ShapeTextView_shape_bottomLeftRadius,0)
        mBottomRightRadius = array.getDimensionPixelSize(R.styleable.ShapeTextView_shape_bottomRightRadius,0)
        mStrokeWidth = array.getDimensionPixelSize(R.styleable.ShapeTextView_shape_strokeWidth,0)
        mStrokeColor = array.getColor(R.styleable.ShapeTextView_shape_strokeColor, resources.getColor(R.color.white))
        invalidateView()
    }

    private fun invalidateView(){
        var drawable = GradientDrawable()
        drawable.setColor(mSolidColor)
        //corner radius优先级大于radius
        drawable.cornerRadius = mRadius.toFloat()
        if (mTopLeftRadius > 0 || mTopRightRadius > 0 || mBottomRightRadius > 0 || mBottomLeftRadius > 0){
            var topLeftRadius = mTopLeftRadius.toFloat()
            var topRightRadius = mTopRightRadius.toFloat()
            var bottomRightRadius = mBottomRightRadius.toFloat()
            var bottomLeftRadius = mBottomLeftRadius.toFloat()
            drawable.cornerRadii = floatArrayOf(topLeftRadius,topLeftRadius,topRightRadius,topRightRadius,bottomRightRadius,bottomRightRadius,bottomLeftRadius,bottomLeftRadius)
        }
        drawable.setStroke(mStrokeWidth,mStrokeColor)
        background = drawable
    }
}