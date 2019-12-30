package com.example.paintart.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paintart.Models.Artist;
import com.example.paintart.R;
import com.example.paintart.adapter.CardViewAdapter;

import java.util.ArrayList;

import static com.example.paintart.Models.Artists.getArtist;

public class SearchView extends AppCompatActivity implements CardViewAdapter.ItemClickListener  {

    String st;
    TextView chatLabel;
    WebView url;

    CardViewAdapter adapter;
    String Url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_view);

        // data to populate the RecyclerView with
        ArrayList<Artist> newFlowersList = new ArrayList<>();
        for (Artist artitst: getArtist()){
            Artist a = new Artist(artitst.getName(), artitst.getImage(), artitst.getDescription(),artitst.getUrl());
            newFlowersList.add(a);
        }

        st=getIntent().getExtras().getString("username");
        chatLabel = findViewById(R.id.chatLabel);
        st=st.toUpperCase();
        chatLabel.setText(st+"'S SEARCH AREA");

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.flower);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new CardViewAdapter(this, newFlowersList);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);




    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position).getName() + " on row number " + position, Toast.LENGTH_SHORT).show();
        Url=adapter.getItem(position).getUrl();
        sendUrl();
    }

    public void sendUrl(){
        Intent intent = new Intent(this, WebViewClass.class);
        intent.putExtra("url", Url);
        startActivity(intent);
        System.out.println(Url);
    }

}
