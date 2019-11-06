package com.voilet.base.imagezoom

import android.content.res.Resources
import android.graphics.*
import android.graphics.drawable.Drawable
import com.voilet.base.imagezoom.inter.IBitmapDrawable
import java.io.InputStream

class FastBitmapDrawable(b: Bitmap?) : Drawable(), IBitmapDrawable {

    private var bitmap = b
    private var mIntrinsicWidth = b?.width ?: 0
    private var mIntrinsicHeight = b?.height ?: 0
    private var mPaint = Paint().apply {
        isDither = true
        isFilterBitmap = true
    }

    constructor(res:Resources, input :InputStream) : this(BitmapFactory.decodeStream(input))


    override fun getBitmap(): Bitmap?{
        return bitmap
    }

    override fun draw(canvas: Canvas) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setAlpha(alpha: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getOpacity(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}