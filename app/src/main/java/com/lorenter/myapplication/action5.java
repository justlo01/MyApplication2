package com.lorenter.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class action5 extends AppCompatActivity {

    private Button retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action5);

        retour = (Button) findViewById(R.id.retour);


        retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cliqueBouton = new Intent(action5.this, MainActivity.class);
                startActivity(cliqueBouton);
            }
        });
    }
}
