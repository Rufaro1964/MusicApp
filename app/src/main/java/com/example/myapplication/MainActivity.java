package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //The view that show playlist
        TextView playlist =(TextView)findViewById(R.id.playlist);

        //set clickListener on the view
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the {@link playlistActivity}
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                //start the new activity
                startActivity(playlistIntent);
            }
        });

        //The view that show artist
        TextView artist =(TextView)findViewById(R.id.artists);

        //set clickListener on the view
        artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the {@link artistActivity}
                Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);
                //start the new activity
                startActivity(artistIntent);
            }
        });

        //The view that show Album
        TextView album =(TextView)findViewById(R.id.albums);

        //set clickListener on the view
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the {@link albumActivity}
                Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);
                //start the new activity
                startActivity(albumIntent);
            }
        });

        //The view that show songs
        TextView song =(TextView)findViewById(R.id.songs);

        //set clickListener on the view
        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open the {@link playlistActivity}
                Intent songIntent = new Intent(MainActivity.this, SongsActivity.class);
                //start the new activity
                startActivity(songIntent);
            }
        });
    }
}
