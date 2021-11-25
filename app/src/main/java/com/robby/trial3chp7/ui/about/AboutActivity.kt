package com.robby.trial3chp7.ui.about

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.robby.trial3chp7.R
import com.robby.trial3chp7.databinding.ActivityAboutBinding
import com.robby.trial3chp7.ui.profileplayer.ProfilePlayer

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ivBack.setOnClickListener {
            startActivity(Intent(this, ProfilePlayer::class.java))
            finish()
        }
    }
}