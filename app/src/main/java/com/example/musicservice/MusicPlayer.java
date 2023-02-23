package com.example.musicservice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.util.Log;

import androidx.annotation.Nullable;

public class MusicPlayer extends Service {
    MediaPlayer mplayer;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        mplayer = MediaPlayer.create(this, Settings.System.DEFAULT_ALARM_ALERT_URI);
        mplayer.setLooping(true);
        Log.e("tag","--------start it----------");
        mplayer.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        mplayer.stop();
        super.onDestroy();
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
