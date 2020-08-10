package com.example.progressbarproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dinuscxj.progressbar.CircleProgressBar;

public class MainActivity extends AppCompatActivity {

    CircleProgressBar cpb_circlebar;
    int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cpb_circlebar = findViewById(R.id.cpb_circlebar);
        Thread thread = new Thread()
        {
            @Override
            public void run() {

                while (true)
                {
                    i += 20;
                    try {

                        sleep(1000);
                        cpb_circlebar.setProgress(i);
                        if (i == 100)
                        {
                            i = 0;
                        }

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();

    }
}