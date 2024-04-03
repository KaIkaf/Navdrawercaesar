package com.example.navdrawercae;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.navdrawercae.Favoritmakanan.FavoriteFragment;
import com.example.navdrawercae.makanan.MakananFragment;
import com.example.navdrawercae.minuman.MinumanFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerlayout;

    private ActionBarDrawerToggle toggle;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        showhome();


        drawerlayout = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawerlayout, toolbar, R.string.open_drawer, R.string.close_drawer);

        drawerlayout.addDrawerListener(toggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {


            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.menu_Makanan) {
                    showmakananPage();
                } else if (itemId == R.id.menu_Home) {
                    showhome();

                } else if ( itemId == R.id.menu_Minuman) {
                    showminumanpage();
                }

                else  {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content_frame, new FavoriteFragment())
                            .commit();
                    getSupportActionBar().setTitle("Makanan Favorit");
                }

                drawerlayout.closeDrawers();
                return true;
            }
        });
        }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }


    private void showmakananPage() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new MakananFragment())
                .commit();

        getSupportActionBar().setTitle("Makanan ");
    }

    private void showminumanpage(){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new MinumanFragment())
                .commit();

        getSupportActionBar().setTitle("Minuman");

    }

    private void showhome(){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new home())
                .commit();

        getSupportActionBar().setTitle("Home");
    }
}