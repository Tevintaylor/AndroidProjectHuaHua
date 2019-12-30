package com.example.paintart;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.paintart.views.ShapesView;


public class DrawShapesClass extends AppCompatActivity{
    private ShapesView shapesView;


    private Button mButton;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_shapes);

//      import custom view via id
        final ShapesView shapesView = findViewById(R.id.customView);

//      import button via id
        ImageView Arc = findViewById(R.id.Arc);
        ImageView Circle = findViewById(R.id.Circle);
        ImageView Line = findViewById(R.id.Line);
        ImageView Rectangle = findViewById(R.id.Rectangle);
        ImageView Trinagle = findViewById(R.id.Trinagle);
        ImageView Sqaure = findViewById(R.id.Sqaure);


        Arc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shapesView.DrawArc();
                Toast.makeText(getApplicationContext(), "Arc Drawn", Toast.LENGTH_LONG).show();
            }
        });

        Circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shapesView.DrawCircle();
                Toast.makeText(getApplicationContext(), "Circle Drawn", Toast.LENGTH_LONG).show();
            }
        });

        Line.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shapesView.DrawLine();
                Toast.makeText(getApplicationContext(), "Line Drawn", Toast.LENGTH_LONG).show();
            }
        });

        Rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shapesView.DrawRectangle();
                Toast.makeText(getApplicationContext(), "Rectangle Drawn", Toast.LENGTH_LONG).show();
            }
        });

        Sqaure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shapesView.DrawSqaure();
                Toast.makeText(getApplicationContext(), "Square Drawn", Toast.LENGTH_LONG).show();
            }
        });

        Trinagle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shapesView.DrawTriangle();
                Toast.makeText(getApplicationContext(), "Triangle Drawn", Toast.LENGTH_LONG).show();
            }
        });



    }

}
