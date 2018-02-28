package com.javacodegeeks.androidBluetoothExample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.javacodegeeks.R;

public class Splash extends AppCompatActivity {


    private ImageView iv;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        iv=(ImageView) findViewById(R.id.imageView);
        tv=(TextView) findViewById(R.id.tvtxt);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        tv.startAnimation(myanim);
        iv.startAnimation(myanim);
        final Intent intent=new Intent(this,SelectActivity.class);
        Thread timer=new Thread(){
            @Override
            public void run() {
                super.run();
                try{sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(intent);
                    finish();
                }
            }
        };timer.start();


    }

}
