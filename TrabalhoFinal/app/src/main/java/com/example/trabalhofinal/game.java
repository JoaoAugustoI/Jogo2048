package com.example.trabalhofinal;

import android.app.ActionBar;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.Random;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.Random;

public class game extends AppCompatActivity
{
    int vetcolunas[] = new int[6];
    GridLayout g1,g2;
    //lara
    ImageView pause, play, home, semSom, help;
    TableLayout tableLayout;
    int pontos = 0, pontosMax = 0;
    AdView mAdView;
    TextView scoreMax;
    private InterstitialAd mInterstitialAd;
    Button btn;
    //fimlara
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_game);

        //lara
        play = findViewById(R.id.play);
        pause = findViewById(R.id.pause);
        home = findViewById(R.id.home);
        tableLayout = findViewById(R.id.layoutPause);
        btn = findViewById(R.id.teste);

        scoreMax = findViewById(R.id.pontos);
        SharedPreferences prefs = getSharedPreferences("recorde", MODE_PRIVATE);
        pontosMax = prefs.getInt("recorde", 0);
        scoreMax.setText("Recorde: " + pontosMax);

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pontos++;
                if(pontos > pontosMax) {
                    pontosMax = pontos;
                    scoreMax.setText("Recorde: " + pontosMax);
                }
                //salvar o record, mas antes tem que salvar os pontos
                SharedPreferences prefs = getSharedPreferences("recorde", MODE_PRIVATE);
                SharedPreferences.Editor edt = prefs.edit();
                edt.putInt("recorde", pontosMax);
                edt.apply();


//                Intent i = new Intent(game.this, Pause.class);
//                startActivity(i);

            }
        });


        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tableLayout.setVisibility(View.VISIBLE);
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tableLayout.setVisibility(View.INVISIBLE);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(game.this, MainActivity.class);
                i.putExtra("pontMax", String.valueOf(pontosMax));
                startActivity(i);
            }
        });


        //larafim

        final ImageView replay = (ImageView) findViewById(R.id.replay);
       // final ImageView pause = (ImageView) findViewById(R.id.pause);

        g2 = (GridLayout) findViewById(R.id.grid);
        g1 = new GridLayout(this);
        g1.setColumnCount(6);
        g1.setRowCount(10);

        for (int j = 0; j < 6; j++)
        {
            GridLayout.Spec linha = GridLayout.spec(0);
            GridLayout.Spec coluna = GridLayout.spec(j);
            GridLayout.LayoutParams lp = new GridLayout.LayoutParams(linha,coluna);

            ImageView iv = new ImageView(this);
            iv.setImageResource(R.drawable.tranparente);

            g1.addView(iv,lp);
        }
        for (int i = 1; i < 10; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                GridLayout.Spec linha = GridLayout.spec(i);
                GridLayout.Spec coluna = GridLayout.spec(j);
                GridLayout.LayoutParams lp = new GridLayout.LayoutParams(linha,coluna);

                ImageView iv = new ImageView(this);
                iv.setImageResource(R.drawable.squaree);

                g1.addView(iv,lp);
            }
        }
        criacao();
        g2.addView(g1);
        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int coluna = g1.getColumnCount();
                if (coluna == 0)
                {

                }else if(coluna == 1)
                {

                }else if(coluna == 2)
                {

                }else if(coluna == 3)
                {

                }else if(coluna == 4)
                {

                }else
                {

                }
            }
        });

//        pause.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)
//            {
//                Intent i =  new Intent(game.this,Pause.class);
//                startActivity(i);
//            }
//        });

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
    public void criacao()
    {
        int cont = 7,c;
        for (int i = 0; i < 6; i++)
        {
            Random rand = new Random();
            int r = rand.nextInt(7);
            r = r+3;
            vetcolunas[i] = r;
            for (;r <= 9;r++)
            {
                GridLayout.Spec linha = GridLayout.spec(r);
                GridLayout.Spec coluna = GridLayout.spec(i);
                GridLayout.LayoutParams lp = new GridLayout.LayoutParams(linha,coluna);

                ImageView iv = new ImageView(this);
                iv.setImageResource(R.drawable.ic_action_name);
                g1.addView(iv,lp);
            }
            cont++;
        }
    }
}
