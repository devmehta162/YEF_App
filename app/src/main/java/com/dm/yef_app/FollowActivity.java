package com.dm.yef_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FollowActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView facebook,instagram,linkedin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow);
        facebook=findViewById(R.id.img_facebook);
        instagram=findViewById(R.id.img_instagram);
        linkedin=findViewById(R.id.img_linkedin);


        facebook.setOnClickListener(this);
        instagram.setOnClickListener(this);
        linkedin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.img_facebook:
                goToUrl("https://www.facebook.com/yefindia.in");
                break;

            case R.id.img_instagram:
                goToUrl("https://www.instagram.com/yef_india/");
                break;
            case R.id.img_linkedin:
                goToUrl("https://www.linkedin.com/company/yefindiango/");
                break;

        }
    }

    private void goToUrl(String s) {

        Uri uri =Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}