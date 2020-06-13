package com.example.trabalhofinal;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class game extends AppCompatActivity
{
    int vetcolunas[] = new int[6];
    GridLayout g1,g2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_game);

        final ImageView replay = (ImageView) findViewById(R.id.replay);
        final ImageView pause = (ImageView) findViewById(R.id.pause);

        g2 = (GridLayout) findViewById(R.id.grid);
        g1 = new GridLayout(this);
        g1.setColumnCount(6);
        g1.setRowCount(10);
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                GridLayout.Spec linha = GridLayout.spec(i);
                GridLayout.Spec coluna = GridLayout.spec(j);
                GridLayout.LayoutParams lp = new GridLayout.LayoutParams(linha,coluna);

                ImageView iv = new ImageView(this);
                iv.setImageResource(R.drawable.ic_action_name);

                g1.addView(iv,lp);
            }
        }
       // g2 = g1;
        g2.addView(g1);
        //setContentView(g1);
//        criacao();

//        grid.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int coluna = grid.getColumnCount();
//                if (coluna == 0)
//                {
//
//                }else if(coluna == 1)
//                {
//
//                }else if(coluna == 2)
//                {
//
//                }else if(coluna == 3)
//                {
//
//                }else if(coluna == 4)
//                {
//
//                }else
//                {
//
//                }
//            }
//        });

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
    public void criacao()
    {


//        int cont = 7,comeco;
//        for (int i = 1; i <= 6; i++)
//        {
//            Random rand = new Random();
//            int r = rand.nextInt(7);
//            r = r+3;
//            comeco = 7*r + cont;
//            for (;r <= 9;r++)
//            {
//
//            }
//            cont++;
//        }
    }
}
