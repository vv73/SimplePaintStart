package study.android.simplepaint

import android.app.Activity
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import study.android.simplepaint.Palette.setColor
import study.android.simplepaint.Palette.setSize

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Обработка нажатий кнопок Палитры
    fun onColorChange(view: View) {
        val color =
            ((view as ImageView).drawable as ColorDrawable).color
        setColor(color)
    }

    fun onSizeChange(view: View) {
        val size = (view as ImageView).drawable.intrinsicWidth
        setSize(size)
    }
}