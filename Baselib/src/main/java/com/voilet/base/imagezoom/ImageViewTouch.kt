package com.voilet.base.imagezoom

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Matrix
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.widget.ImageView
import com.voilet.base.imagezoom.inter.IDisposable

class ImageViewTouch : ImageView, IDisposable {

    constructor(context: Context) : this(context,null)

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs,0)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    override fun dispose() {
        this.clear()
    }

    private fun clear() {
        this.setImageBitmap(null)
    }

    override fun setImageBitmap(bm: Bitmap?) {
        super.setImageBitmap(bm)
    }

    fun setImageBitmap(bitmap: Bitmap?, matrix: Matrix, minZoom: Float, maxZoom: Float) {
//        if (bitmap != null) {
//            this.setImageDrawable(FastBitmapDrawable(bitmap), matrix, minZoom, maxZoom)
//        } else {
//            this.setImageDrawable(null as Drawable?, matrix, minZoom, maxZoom)
//        }
    }
}