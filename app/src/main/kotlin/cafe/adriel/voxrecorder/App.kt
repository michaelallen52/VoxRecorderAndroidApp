package cafe.adriel.voxrecorder

import android.app.Application
import com.tsengvn.typekit.Typekit

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Typekit.getInstance()
                .addNormal(Typekit.createFromAsset(this, "fonts/MerriweatherSans-Regular.ttf"))
                .addItalic(Typekit.createFromAsset(this, "fonts/MerriweatherSans-Italic.ttf"))
                .addBold(Typekit.createFromAsset(this, "fonts/MerriweatherSans-Bold.ttf"))
                .addBoldItalic(Typekit.createFromAsset(this, "fonts/MerriweatherSans-BoldItalic.ttf"))
    }

}