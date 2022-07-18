<img src="https://github.com/jisungbin/SystemUiController/blob/master/art/system-ui-controller-demo.gif?raw=true" width="200" align="right"/>

# SystemUiController 

Android system ui color controller (status bar, navigation bar)

# Download [![](https://img.shields.io/maven-central/v/land.sungbin/systemuicontroller)](https://search.maven.org/artifact/land.sungbin/systemuicontroller)

```groovy
implementation "land.sungbin:systemuicontroller:${version}"
```

---

# Usage

## extensions

```kotlin
Activity.setStatusBarColor(@ColorInt color: Int, darkIcons: Boolean = false) // set color only status bar
Activity.setNavigationBarColor(@ColorInt color: Int, darkIcons: Boolean = false) // set color only navigation bar
Activity.setSystemBarsColor(@ColorInt color: Int, darkIcons: Boolean = false) // set color both statur bar and navigation bar
```

> this extentions can be used for `Fragment` as well as `Activity`.

## instance

Or, you can use an instance of SystemUiController directly.

```kotlin
class SystemUiController(private val window: Window) {
   setStatusBarColor(@ColorInt color: Int, darkIcons: Boolean = false)
   setNavigationBarColor(@ColorInt color: Int, darkIcons: Boolean = false)
   setSystemBarsColor(@ColorInt color: Int, darkIcons: Boolean = false)
}
```

---

# Happy Coding :)
