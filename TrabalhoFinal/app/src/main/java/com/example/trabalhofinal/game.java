package com.example.trabalhofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class game extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_game);

        final ImageView replay = (ImageView) findViewById(R.id.replay);
        final ImageView pause = (ImageView) findViewById(R.id.pause);

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i =  new Intent(game.this,Pause.class);
                startActivity(i);
            }
        });

        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i =  new Intent(game.this, game.class);
                startActivity(i);
                finish();
            }
        });

        
    }
}
