package com.example.week5_sec2_activitylifecycle

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle


class MainActivity : AppCompatActivity() {
    var sTV=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         sTV =text.text.toString()

    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onPause() {
        super.onPause()
          var date_time =LocalDateTime.now()
          var dt=date_time.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT))

        sTV +="\n last seen at $dt "
        text.setText(sTV)

    }


    override fun onResume() {
        super.onResume()
        sTV +="\n Iam Online "
        text.setText(sTV)

    }
    //---------------------------------------------------------

}