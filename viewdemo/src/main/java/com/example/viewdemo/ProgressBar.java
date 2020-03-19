package com.example.viewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ProgressBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        final android.widget.ProgressBar pgb = findViewById(R.id.progess);
        pgb.setProgress(80);
        new Thread(){
            public void run(){
                for (int i = 0; i <= 100; i++){
                    pgb.setProgress(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}
