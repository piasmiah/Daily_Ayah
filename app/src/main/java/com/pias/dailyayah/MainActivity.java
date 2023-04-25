package com.pias.dailyayah;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Window;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        imageView= findViewById(R.id.image_view);
        String url= "https://i.ibb.co/c2tXtyr/d1.jpg";
        Glide.with(MainActivity.this)
                .load(url)
                .centerCrop()
                .into(imageView);
    }

    public void nextImage(View view){

    }

    public void previousImage(View view){

    }
}