package com.edwinacubillos.video;



import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url="https://archive.org/download/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";

        MediaController mediaController = new MediaController(this);

        VideoView videoView = (VideoView) findViewById(R.id.Vvideo);

        Uri uri = Uri.parse(url);
        videoView.setVideoURI(uri);
        videoView.start();

        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);




    }


}
