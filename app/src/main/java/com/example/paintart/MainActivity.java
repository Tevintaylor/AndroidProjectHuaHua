package com.example.paintart;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.paintart.views.ArtistView;
import com.example.paintart.views.CalculatorClass;
import com.example.paintart.views.CalculatorSecond;
import com.example.paintart.views.FlowTextView;
import com.example.paintart.views.MainFragment;
import com.example.paintart.views.SearchView;
import com.example.paintart.views.WebViewClass;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    String st;

    TextView nameId;
    TextView emailId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        st = getIntent().getExtras().getString("username");

        NavigationView navigationViewer = (NavigationView) findViewById(R.id.nav_view);
        View headerView = navigationViewer.getHeaderView(0);
        nameId = (TextView) headerView.findViewById(R.id.nameId);
        nameId.setText(st);

        NavigationView navigationViewer2 = (NavigationView) findViewById(R.id.nav_view);
        View headerView2 = navigationViewer2.getHeaderView(0);
        emailId = (TextView) headerView2.findViewById(R.id.emailId);
        int ranNumber = generateRandomIntIntRange();
        emailId.setText(st + String.valueOf(ranNumber) + "@yahoo.com");


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MainFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_default);

        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.nav_bar_menu, menu);
//        return true;
//    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    public static int generateRandomIntIntRange() {
        double n = Math.random();
        long n3 = Math.round(Math.random() * 1000);
        return (int) n3;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        // Handle navigation view item clicks here.
        int id = menuItem.getItemId();

        Fragment fragment;
        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        if (id == R.id.nav_default) {
//          go back to Main Fragment

            fragment = new Fragment();
            transaction.replace(R.id.fragment_container, fragment);
            transaction.addToBackStack(null);
            transaction.commit();

        } else if (id == R.id.nav_grid_view) {
            Intent intent = new Intent(this, GridClass.class);
            intent.putExtra("username", st);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

        } else if (id == R.id.nav_draw_shape) {
            Intent intent = new Intent(this, DrawShapesClass.class);
            intent.putExtra("username", st);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

        } else if (id == R.id.nav_canvas_view) {
            Intent intent = new Intent(this, CanvasClass.class);
            intent.putExtra("username", st);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

        } else if (id == R.id.nav_web_view) {
            Intent intent = new Intent(this, WebViewClass.class);
            intent.putExtra("username", st);
            String value = "https://www.bing.com/search?FORM=U528DF&PC=U528&q=famous+artists";
            intent.putExtra("url", value);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

        } else if (id == R.id.nav_album_view) {
            Intent intent = new Intent(this, ArtistView.class);
            intent.putExtra("username", st);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

        } else if (id == R.id.nav_card_view) {
            Intent intent = new Intent(this, SearchView.class);
            intent.putExtra("username", st);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

        } else if (id == R.id.nav_flowtext_view) {
            Intent intent = new Intent(this, FlowTextView.class);
            intent.putExtra("username", st);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

        } else if (id == R.id.nav_settings) {
            Intent intent = new Intent(this, SettingsActivity.class);
            intent.putExtra("username", st);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

        } else if (id == R.id.nav_calculator_view) {
            Intent intent = new Intent(this, CalculatorClass.class);
            intent.putExtra("username", st);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

        } else if (id == R.id.nav_calculator2_view) {
            Intent intent = new Intent(this, CalculatorSecond.class);
            intent.putExtra("username", st);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

        } else if (id == R.id.nav_logout) {
            Intent intent = new Intent(this, LoginnClass.class);
            startActivity(intent);
            finish();
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_in_right);
    }
}