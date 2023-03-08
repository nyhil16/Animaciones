package com.example.animaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable curseAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = findViewById(R.id.imgAnim);
        img.setBackgroundResource(R.drawable.animacion);
        curseAnim = (AnimationDrawable) img.getBackground();

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curseAnim.start();
            }
        });
    }
}