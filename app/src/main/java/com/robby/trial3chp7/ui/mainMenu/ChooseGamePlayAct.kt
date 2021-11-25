package com.robby.trial3chp7.ui.mainMenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.robby.trial3chp7.R
import com.robby.trial3chp7.databinding.ActivityChooseGamePlayBinding
import com.robby.trial3chp7.ui.pilihlawan.PilihLawan
import com.robby.trial3chp7.ui.playgamevscomputer.PlayGameVsComputer
import com.robby.trial3chp7.utils.GameMusic

class ChooseGamePlayAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startService(Intent(this, GameMusic::class.java))
        val binding =
            DataBindingUtil.setContentView<ActivityChooseGamePlayBinding>(
                this,
                R.layout.activity_choose_game_play
            )
        binding.btPlayOther.setOnClickListener {
            stopMusic()
            startActivity(Intent(this, PilihLawan::class.java))
            finish()
        }
        binding.btPlayComputer.setOnClickListener {
            stopMusic()
            startActivity(Intent(this, PlayGameVsComputer::class.java))
            finish()
        }
        binding.btBackMenu.setOnClickListener {
            finish()
            startActivity(Intent(this, MainMenuAct::class.java))

        }
    }

    private fun stopMusic() {
        stopService(Intent(this, GameMusic::class.java))
    }

    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, MainMenuAct::class.java))
        finish()
    }

}