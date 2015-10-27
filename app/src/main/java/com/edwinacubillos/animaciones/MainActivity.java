package com.edwinacubillos.animaciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button Girar, Transp, Mover, Ampliar;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Girar = (Button) findViewById(R.id.bGirar);
        Transp = (Button) findViewById(R.id.bTransparente);
        Mover = (Button) findViewById(R.id.bMover);
        Ampliar = (Button) findViewById(R.id.bAmpliar);
        imageView = (ImageView) findViewById(R.id.ImageV);

        Girar.setOnClickListener(this);
        Transp.setOnClickListener(this);
        Mover.setOnClickListener(this);
        Ampliar.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int id=v.getId();

        Animation animation = null;

        switch (id){
            case R.id.bAmpliar:
                animation = AnimationUtils.loadAnimation(this, R.anim.ampliar);
                break;
            case R.id.bGirar:
                animation = AnimationUtils.loadAnimation(this, R.anim.rotar);
                break;
            case R.id.bMover:
                animation = AnimationUtils.loadAnimation(this, R.anim.translate);
                break;
            case R.id.bTransparente:
                animation = AnimationUtils.loadAnimation(this, R.anim.transparence);
                break;
            default:
                break;
        }
        animation.reset();
        imageView.startAnimation(animation);


    }
}
