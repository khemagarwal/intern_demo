package com.example.pixaflip.ui.home;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.os.Environment;
import android.view.Menu;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.pixaflip.R;

public class playvideo extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playvideo);

        VideoView vv=(VideoView)findViewById(R.id.videoView1);
        vv.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(vv);
        vv.setMediaController(mediaController);
        vv.start();

    }



}