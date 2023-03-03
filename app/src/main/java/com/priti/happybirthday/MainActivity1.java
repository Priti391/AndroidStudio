package com.priti.happybirthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity1 extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        btn1 = findViewById(R.id.gift);
        btn2 = findViewById(R.id.birthday);
        img = findViewById(R.id.imageView);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("test","Wish U A Happiest Birthday");
                Toast.makeText(MainActivity1.this,"ready for gift",Toast.LENGTH_SHORT).show();
            }
        });

       btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity1.this,MainActivity2.class);
                startActivity(intent);
            }

            });
        }
    }