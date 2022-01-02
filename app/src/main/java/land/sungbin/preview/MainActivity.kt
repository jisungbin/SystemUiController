package land.sungbin.preview

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import land.sungbin.systemuicontroller.setSystemBarsColor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun colorPurple(view: View) {
        supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.purple_200)))
        setSystemBarsColor(getColor(R.color.purple_200))
    }

    fun colorTeal(view: View) {
        supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.teal_200)))
        setSystemBarsColor(getColor(R.color.teal_200))
    }

    fun colorWhite(view: View) {
        supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.white)))
        setSystemBarsColor(getColor(R.color.white), true)
    }
}
