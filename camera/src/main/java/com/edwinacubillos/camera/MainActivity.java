package com.edwinacubillos.camera;


import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    Button Capture;
    ImageView image;
    static final int CAM_REQUEST = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Capture = (Button) findViewById(R.id.bCargar);
        image = (ImageView) findViewById(R.id.Iview);

        Capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ci = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(ci, CAM_REQUEST);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == CAM_REQUEST){
            Bitmap Imagen = (Bitmap) data.getExtras().get("data");
            image.setImageBitmap(Imagen);
        }
    }
}
