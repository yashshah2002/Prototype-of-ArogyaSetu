package com.example.aarogyasetu;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

//    TextView risk;
    Button help;
    ImageView safe,risky,test,hospital,pmcares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        test = findViewById(R.id.test);

//        help = findViewById(R.id.help);
//        risk = findViewById(R.id.risk);
        hospital = findViewById(R.id.hospital);
        pmcares = findViewById(R.id.pmcares);
        safe = findViewById(R.id.safe);
        risky = findViewById(R.id.risky);


//        risk.setVisibility(View.GONE);
        safe.setVisibility(View.GONE);
        risky.setVisibility(View.GONE);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,com.example.aarogyasetu.SelfTest.class);
                startActivityForResult(intent,1);
            }
        });

        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,com.example.aarogyasetu.Hospitals.class);
                startActivity(intent);
            }
        });

        pmcares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pmcares.gov.in/en/\n"));
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 1)
        {
            if(resultCode == RESULT_OK)
            {
               String pic = data.getStringExtra("back").toString();

                if(pic.equals("You are at low risk of infection. But don't worry stay home and stay safe!"))
                {
                    risky.setVisibility(View.GONE);
                    safe.setVisibility(View.VISIBLE);
                }
                else if(pic.equals("You are at moderate risk of infection. But don't worry stay home and stay safe!"))
                {
                    risky.setVisibility(View.GONE);
                    safe.setVisibility(View.VISIBLE);
                }
                else
                {
                    safe.setVisibility(View.GONE);
                    risky.setVisibility(View.VISIBLE);
                }

            }
            else
            {
                Toast.makeText(this, "please complete the self assessment test!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}