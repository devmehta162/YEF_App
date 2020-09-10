package com.dm.yef_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity2 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(MainActivity2.this);
        navigationView.bringToFront();
        navigationView.setCheckedItem(R.id.nav_home);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                break;
            case R.id.about_us:
                Intent intent = new Intent(MainActivity2.this,About_Us.class);
                startActivity(intent);
                break;
            case R.id.about_the_founder:
                Intent intent1 = new Intent(MainActivity2.this,About_Founder.class);
                startActivity(intent1);
                break;
            case R.id.nav_intern:

                break;
            case R.id.nav_Login:
                Intent intent3 = new Intent(MainActivity2.this,LoginActivity.class);
                startActivity(intent3);


                break;
            case R.id.nav_Logout:

            case R.id.more_yef:
                Intent intent4= new Intent(MainActivity2.this,MoreActivity.class);
                startActivity(intent4);

        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;

    }
}