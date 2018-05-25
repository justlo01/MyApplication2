package com.lorenter.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Texte;
    private Button luxembourg;
    private Button bercy;
    private Button tuileries;
    private Button chaumont;
    private Button monsouris;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Texte = (TextView) findViewById(R.id.Texte);
        luxembourg = (Button) findViewById(R.id.luxembourg);
        bercy = (Button) findViewById(R.id.bercy);
        tuileries = (Button) findViewById(R.id.tuilerie);
        chaumont = (Button) findViewById(R.id.chaumont);
        monsouris = (Button) findViewById(R.id.monsouris);

        setTitle("Les jardins de Paris");


        luxembourg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cliqueBouton = new Intent(MainActivity.this, action.class);
                startActivity(cliqueBouton);
            }
        });

        chaumont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cliqueBoutonChaumont = new Intent(MainActivity.this, action2.class);
                startActivity(cliqueBoutonChaumont);
            }
        });

        bercy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cliqueBoutonBercy = new Intent(MainActivity.this, action3.class);
                startActivity(cliqueBoutonBercy);
            }
        });

        monsouris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cliqueBoutonMontsouris = new Intent(MainActivity.this, action4.class);
                startActivity(cliqueBoutonMontsouris);
            }
        });

        tuileries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cliqueBoutonTuileries = new Intent(MainActivity.this, action5.class);
                startActivity(cliqueBoutonTuileries);
            }
        });

    }
}

