package com.dm.yef_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MoreActivity extends AppCompatActivity {
    private TextView followUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        followUs=findViewById(R.id.Follow_us_text);

        followUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MoreActivity.this,FollowActivity.class);
                startActivity(intent);
            }
        });
    }
}