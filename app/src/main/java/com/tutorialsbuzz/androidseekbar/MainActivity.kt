package com.tutorialsbuzz.androidseekbar

import android.os.Bundle
import android.util.Log
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                result.setText(String.format("Progress:  %d", progress))
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                Log.d("SeekBar", "onStartTrackingTouch: " + String.format("Start %d", seekBar?.progress))
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                Log.d("SeekBar", "onStopTrackingTouch: " + String.format("Start %d", seekBar?.progress))
            }
        })
    }
}
