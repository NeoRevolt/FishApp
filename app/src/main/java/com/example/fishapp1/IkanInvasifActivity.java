package com.example.fishapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class IkanInvasifActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikan_invasif);
        setTitle(" ");

        TextView textInvasif = (TextView) findViewById(R.id.linkInvasif);
        textInvasif.setMovementMethod(LinkMovementMethod.getInstance());

        VideoView videoView = (VideoView) findViewById(R.id.idVideo1);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName()+"/"+R.raw.videoinvansif));

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();

    }
}