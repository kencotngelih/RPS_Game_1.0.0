package com.robby.trial3chp7.utils

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import com.robby.trial3chp7.R

class GamePlayMusic: Service() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onBind(intent: Intent): IBinder? {
        return null
    }
    override fun onCreate() {
        super.onCreate()
        mediaPlayer = MediaPlayer.create(this, R.raw.game_playsound)
        mediaPlayer.isLooping = true
        mediaPlayer.setVolume(50f, 50f)
    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {
        mediaPlayer.start()
        return START_STICKY
    }

    override fun onStart(intent: Intent, startId: Int) {}
    override fun onDestroy() {
        mediaPlayer.stop()
        mediaPlayer.reset()
        mediaPlayer.release()
    }

    override fun onLowMemory() {}
}