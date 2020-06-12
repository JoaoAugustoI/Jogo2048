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
        //e lá vamos nós
        final ImageView sobe1 = (ImageView) findViewById(R.id.sobe1);
        final ImageView sobe2 = (ImageView) findViewById(R.id.sobe2);
        final ImageView sobe3 = (ImageView) findViewById(R.id.sobe3);
        final ImageView sobe4 = (ImageView) findViewById(R.id.sobe4);
        final ImageView sobe5 = (ImageView) findViewById(R.id.sobe5);
        final ImageView sobe6 = (ImageView) findViewById(R.id.sobe6);
        final ImageView sobe7 = (ImageView) findViewById(R.id.sobe7);
        final ImageView sobe8 = (ImageView) findViewById(R.id.sobe8);
        final ImageView sobe9 = (ImageView) findViewById(R.id.sobe9);
        final ImageView sobe10 = (ImageView) findViewById(R.id.sobe10);
        final ImageView sobe11 = (ImageView) findViewById(R.id.sobe11);
        final ImageView sobe12 = (ImageView) findViewById(R.id.sobe12);
        final ImageView sobe13 = (ImageView) findViewById(R.id.sobe13);
        final ImageView sobe14 = (ImageView) findViewById(R.id.sobe14);
        final ImageView sobe15 = (ImageView) findViewById(R.id.sobe15);
        final ImageView sobe16 = (ImageView) findViewById(R.id.sobe16);
        final ImageView sobe17 = (ImageView) findViewById(R.id.sobe17);
        final ImageView sobe18 = (ImageView) findViewById(R.id.sobe18);
        final ImageView sobe19 = (ImageView) findViewById(R.id.sobe19);
        final ImageView sobe20 = (ImageView) findViewById(R.id.sobe20);
        final ImageView sobe21 = (ImageView) findViewById(R.id.sobe21);
        final ImageView sobe22 = (ImageView) findViewById(R.id.sobe22);
        final ImageView sobe23 = (ImageView) findViewById(R.id.sobe23);
        final ImageView sobe24 = (ImageView) findViewById(R.id.sobe24);
        final ImageView sobe25 = (ImageView) findViewById(R.id.sobe25);
        final ImageView sobe26 = (ImageView) findViewById(R.id.sobe26);
        final ImageView sobe27 = (ImageView) findViewById(R.id.sobe27);
        final ImageView sobe28 = (ImageView) findViewById(R.id.sobe28);
        final ImageView sobe29 = (ImageView) findViewById(R.id.sobe29);
        final ImageView sobe30 = (ImageView) findViewById(R.id.sobe30);
        final ImageView sobe31 = (ImageView) findViewById(R.id.sobe31);
        final ImageView sobe32 = (ImageView) findViewById(R.id.sobe32);
        final ImageView sobe33 = (ImageView) findViewById(R.id.sobe33);
        final ImageView sobe34 = (ImageView) findViewById(R.id.sobe34);
        final ImageView sobe35 = (ImageView) findViewById(R.id.sobe35);
        final ImageView sobe36 = (ImageView) findViewById(R.id.sobe36);
        final ImageView sobe37 = (ImageView) findViewById(R.id.sobe37);
        final ImageView sobe38 = (ImageView) findViewById(R.id.sobe38);
        final ImageView sobe39 = (ImageView) findViewById(R.id.sobe39);
        final ImageView sobe40 = (ImageView) findViewById(R.id.sobe40);
        final ImageView sobe41 = (ImageView) findViewById(R.id.sobe41);
        final ImageView sobe42 = (ImageView) findViewById(R.id.sobe42);
        final ImageView sobe43 = (ImageView) findViewById(R.id.sobe43);
        final ImageView sobe44 = (ImageView) findViewById(R.id.sobe44);
        final ImageView sobe45 = (ImageView) findViewById(R.id.sobe45);
        final ImageView sobe46 = (ImageView) findViewById(R.id.sobe46);
        final ImageView sobe47 = (ImageView) findViewById(R.id.sobe47);
        final ImageView sobe48 = (ImageView) findViewById(R.id.sobe48);
        final ImageView sobe49 = (ImageView) findViewById(R.id.sobe49);
        final ImageView sobe50 = (ImageView) findViewById(R.id.sobe50);
        final ImageView sobe51 = (ImageView) findViewById(R.id.sobe51);
        final ImageView sobe52 = (ImageView) findViewById(R.id.sobe52);
        final ImageView sobe53 = (ImageView) findViewById(R.id.sobe53);
        final ImageView sobe54 = (ImageView) findViewById(R.id.sobe54);
        final ImageView sobe55 = (ImageView) findViewById(R.id.sobe55);
        final ImageView sobe56 = (ImageView) findViewById(R.id.sobe56);
        final ImageView sobe57 = (ImageView) findViewById(R.id.sobe57);
        final ImageView sobe58 = (ImageView) findViewById(R.id.sobe58);
        final ImageView sobe59 = (ImageView) findViewById(R.id.sobe59);
        final ImageView sobe60 = (ImageView) findViewById(R.id.sobe60);


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
