package com.example.jasper.helloworld;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button title = findViewById(R.id.title);
        Button step1 = findViewById(R.id.step1);
        Button step2 = findViewById(R.id.step2);
        Button step3 = findViewById(R.id.step3);
        Button step4 = findViewById(R.id.step4);
        final ImageView orangeTitle = (ImageView) findViewById(R.id.orange_title);
        final ImageView orange = (ImageView) findViewById(R.id.orange_bush);
        final ImageView shower = (ImageView) findViewById(R.id.shower);
        final ImageView peeling = (ImageView) findViewById(R.id.peeling);
        final ImageView consume = (ImageView) findViewById(R.id.consume_orange);
        final TextView overhead = (TextView) findViewById(R.id.textbox);
        final TextView description1 = (TextView) findViewById(R.id.description1);
        final TextView description2 = (TextView) findViewById(R.id.description2);
        final TextView description3 = (TextView) findViewById(R.id.description3);
        final TextView description4 = (TextView) findViewById(R.id.description4);

        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                overhead.setVisibility(View.INVISIBLE);
                orangeTitle.setVisibility(View.VISIBLE);

                description1.setVisibility(View.INVISIBLE);
                description2.setVisibility(View.INVISIBLE);
                description3.setVisibility(View.INVISIBLE);
                description4.setVisibility(View.INVISIBLE);

                orange.setVisibility(View.INVISIBLE);
                shower.setVisibility(View.INVISIBLE);
                peeling.setVisibility(View.INVISIBLE);
                consume.setVisibility(View.INVISIBLE);

            }
        });

        step1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                overhead.setText("Step 1");
                overhead.setVisibility(View.VISIBLE);
                orangeTitle.setVisibility(View.INVISIBLE);
                description1.setVisibility(View.VISIBLE);
                description2.setVisibility(View.INVISIBLE);
                description3.setVisibility(View.INVISIBLE);
                description4.setVisibility(View.INVISIBLE);

                orange.setVisibility(View.VISIBLE);
                shower.setVisibility(View.INVISIBLE);
                peeling.setVisibility(View.INVISIBLE);
                consume.setVisibility(View.INVISIBLE);
            }
        });

        step2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                overhead.setText("Step 2");
                overhead.setVisibility(View.VISIBLE);
                orangeTitle.setVisibility(View.INVISIBLE);
                description1.setVisibility(View.INVISIBLE);
                description2.setVisibility(View.VISIBLE);
                description3.setVisibility(View.INVISIBLE);
                description4.setVisibility(View.INVISIBLE);

                orange.setVisibility(View.INVISIBLE);
                shower.setVisibility(View.VISIBLE);
                peeling.setVisibility(View.INVISIBLE);
                consume.setVisibility(View.INVISIBLE);
            }
        });

        step3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                overhead.setText("Step 3");
                overhead.setVisibility(View.VISIBLE);
                orangeTitle.setVisibility(View.INVISIBLE);
                description1.setVisibility(View.INVISIBLE);
                description2.setVisibility(View.INVISIBLE);
                description3.setVisibility(View.VISIBLE);
                description4.setVisibility(View.INVISIBLE);

                orange.setVisibility(View.INVISIBLE);
                shower.setVisibility(View.INVISIBLE);
                peeling.setVisibility(View.VISIBLE);
                consume.setVisibility(View.INVISIBLE);
            }
        });

        step4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                overhead.setText("Step 4");
                overhead.setVisibility(View.VISIBLE);
                orangeTitle.setVisibility(View.INVISIBLE);
                description1.setVisibility(View.INVISIBLE);
                description2.setVisibility(View.INVISIBLE);
                description3.setVisibility(View.INVISIBLE);
                description4.setVisibility(View.VISIBLE);

                orange.setVisibility(View.INVISIBLE);
                shower.setVisibility(View.INVISIBLE);
                peeling.setVisibility(View.INVISIBLE);
                consume.setVisibility(View.VISIBLE);
            }
        });
    }
}
