package land.sungbin.systemuicontroller

import android.app.Activity
import androidx.annotation.ColorInt
import androidx.fragment.app.Fragment

fun Fragment.setStatusBarColor(
    @ColorInt color: Int,
    darkIcons: Boolean = false
) {
    SystemUiController(requireActivity().window).setStatusBarColor(
        color = color,
        darkIcons = darkIcons
    )
}

fun Activity.setStatusBarColor(
    @ColorInt color: Int,
    darkIcons: Boolean = false
) {
    SystemUiController(window).setStatusBarColor(color = color, darkIcons = darkIcons)
}

fun Fragment.setNavigationBarColor(
    @ColorInt color: Int,
    darkIcons: Boolean = false
) {
    SystemUiController(requireActivity().window).setNavigationBarColor(
        color = color,
        darkIcons = darkIcons
    )
}

fun Activity.setNavigationBarColor(
    @ColorInt color: Int,
    darkIcons: Boolean = false
) {
    SystemUiController(window).setNavigationBarColor(color = color, darkIcons = darkIcons)
}

fun Fragment.setSystemBarsColor(
    @ColorInt color: Int,
    darkIcons: Boolean = false
) {
    SystemUiController(requireActivity().window).setSystemBarsColor(
        color = color,
        darkIcons = darkIcons
    )
}

fun Activity.setSystemBarsColor(
    @ColorInt color: Int,
    darkIcons: Boolean = false
) {
    SystemUiController(window).setSystemBarsColor(color = color, darkIcons = darkIcons)
}
