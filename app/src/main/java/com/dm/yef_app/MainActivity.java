package com.dm.yef_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button login;
    private TextView heading_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heading_name=findViewById(R.id.heading_name);
        String text ="Youth Empowerment Foundation";
        String green="#258702";
        String grey ="#959493";
        String orange ="#ff7f50";

        SpannableString spannableString = new SpannableString(text);

        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor(String.valueOf(orange)));
        ForegroundColorSpan foregroundColorSpan1 =new ForegroundColorSpan(Color.parseColor(String.valueOf(grey)));
        ForegroundColorSpan foregroundColorSpan2 =new ForegroundColorSpan(Color.parseColor(String.valueOf(green)));

        spannableString.setSpan(foregroundColorSpan,0,5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(foregroundColorSpan1,6,17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(foregroundColorSpan2,18,28, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        heading_name.setText(spannableString);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);

        heading_name.setAnimation(animation);

        new Thread() {
            public void run() {
                try {
                    sleep(2100);
                    Intent intent =new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);

                    finish();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }



        }.start();



    }
}