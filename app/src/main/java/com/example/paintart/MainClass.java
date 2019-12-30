package com.example.paintart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.paintart.views.ArtistView;
import com.example.paintart.views.WebViewClass;

public class MainClass extends AppCompatActivity {

    private String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_class);

        Button canvasView = findViewById(R.id.Canvas);
        Button gridView = findViewById(R.id.grid);
        Button drawShaes = findViewById(R.id.DrawShapes);
        Button logout = findViewById(R.id.logout);
        Button appdraw = findViewById(R.id.appdraw);
        Button albumView = findViewById(R.id.AlbumView);
        Button webView = findViewById(R.id.Webview);
        TextView textView4 = findViewById(R.id.textView4);

        st = getIntent().getExtras().getString("username");
        textView4.setText("Select an option "+st.toLowerCase());

        canvasView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Canvas View",Toast.LENGTH_SHORT).show();
                goToCanvas();
            }
        });

        gridView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Grid View",Toast.LENGTH_SHORT).show();
                goToGrid();
            }
        });

        drawShaes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Draw Shape",Toast.LENGTH_SHORT).show();
                goToDrawShape();
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Successfully logged out!!",Toast.LENGTH_SHORT).show();
                goToLogin();
            }
        });

        appdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"App draw!!",Toast.LENGTH_SHORT).show();
                goToAppDraw();
            }
        });

        albumView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Album View!!",Toast.LENGTH_SHORT).show();
                goToAlbumView();
            }
        });

        webView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Web View!!",Toast.LENGTH_SHORT).show();
                goToWebView();
            }
        });
    }

    public void  goToCanvas(){
        Intent intent = new Intent(this,CanvasClass.class);
        startActivity(intent);
    }

    public void  goToGrid(){
        Intent intent = new Intent(this,GridClass.class);
        startActivity(intent);
    }

    public void  goToDrawShape(){
        Intent intent = new Intent(this, DrawShapesClass.class);
        startActivity(intent);
    }

    public void  goToLogin(){
        Intent intent = new Intent(this, LoginnClass.class);
        startActivity(intent);
    }

    public void  goToAppDraw(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void  goToAlbumView(){
        Intent intent = new Intent(this, ArtistView.class);
        intent.putExtra("username", st);
        startActivity(intent);
    }

    public void  goToWebView(){
        Intent intent = new Intent(this, WebViewClass.class);
        startActivity(intent);
    }

}
