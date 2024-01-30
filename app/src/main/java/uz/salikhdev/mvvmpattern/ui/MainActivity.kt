package uz.salikhdev.mvvmpattern.ui

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.AppCompatButton
import uz.salikhdev.mvvmpattern.R

class MainActivity : AppCompatActivity() {

    private val mainVM: MainVM by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainVM.getNewsData()
        observer()

        setListener()


    }

    private fun setListener() {

        val buttonDay = findViewById<AppCompatButton>(R.id.buttonDay)
        val buttonNight = findViewById<AppCompatButton>(R.id.buttonNight)
        val buttonAuto = findViewById<AppCompatButton>(R.id.buttonAuto)

        buttonDay.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }

        buttonNight.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }

        buttonAuto.setOnClickListener {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_AUTO_BATTERY)

        }


    }

    private fun observer() {


        mainVM.newsLiveData.observe(this) {
            Log.d("TAGaaaa", "observer: ${it.toString()}")
            Toast.makeText(this, "keldi", Toast.LENGTH_SHORT).show()
        }

        mainVM.errorLiveData.observe(this) {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }


    }


}