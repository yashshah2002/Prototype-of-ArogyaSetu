package com.example.aarogyasetu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SelfTest extends AppCompatActivity {

    TextView q1,q2,a1,a2,out;
    Button q1_cough,q1_fever,q1_diffculty,q1_none,q2_diabetes,q2_lung,q2_heart,q2_none,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_test);
        final String o1,o2;
        q1 = findViewById(R.id.q1);
        q2 = findViewById(R.id.q2);
        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        out = findViewById(R.id.out);

        q1_cough = findViewById(R.id.q1_cough);
        q1_fever = findViewById(R.id.q1_fever);
        q1_diffculty = findViewById(R.id.q1_diffculty);
        q1_none = findViewById(R.id.q1_none);
        q2_diabetes = findViewById(R.id.q2_diabetes);
        q2_lung = findViewById(R.id.q2_lung);
        q2_heart = findViewById(R.id.q2_heart);
        q2_none = findViewById(R.id.q2_none);
        back = findViewById(R.id.back);

        a1.setVisibility(View.GONE);
        a2.setVisibility(View.GONE);
        q2.setVisibility(View.GONE);
        q2_diabetes.setVisibility(View.GONE);
        q2_lung.setVisibility(View.GONE);
        q2_heart.setVisibility(View.GONE);
        q2_none.setVisibility(View.GONE);
        out.setVisibility(View.GONE);

        q1_cough.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a1.setText("Cough");
                a1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q2_diabetes.setVisibility(View.VISIBLE);
                q2_lung.setVisibility(View.VISIBLE);
                q2_heart.setVisibility(View.VISIBLE);
                q2_none.setVisibility(View.VISIBLE);
            }
        });

        q1_fever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a1.setText("Fever");
                a1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q2_diabetes.setVisibility(View.VISIBLE);
                q2_lung.setVisibility(View.VISIBLE);
                q2_heart.setVisibility(View.VISIBLE);
                q2_none.setVisibility(View.VISIBLE);
            }
        });

        q1_diffculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a1.setText("Difficulty in breathing");
                a1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q2_diabetes.setVisibility(View.VISIBLE);
                q2_lung.setVisibility(View.VISIBLE);
                q2_heart.setVisibility(View.VISIBLE);
                q2_none.setVisibility(View.VISIBLE);
            }
        });

        q1_none.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a1.setText("None of the above");
                a1.setVisibility(View.VISIBLE);
                q2.setVisibility(View.VISIBLE);
                q2_diabetes.setVisibility(View.VISIBLE);
                q2_lung.setVisibility(View.VISIBLE);
                q2_heart.setVisibility(View.VISIBLE);
                q2_none.setVisibility(View.VISIBLE);
            }
        });

        q2_diabetes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans = a1.getText().toString();
                a2.setText("Diabetes");
                if(ans.equals("None of the above"))
                out.setText("You are at moderate risk of infection. But don't worry stay home and stay safe!");
                else
                    out.setText("You are at high risk of infection. But don't worry stay home and stay safe!");
                a2.setVisibility(View.VISIBLE);
                out.setVisibility(View.VISIBLE);
            }
        });

        q2_heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans = a1.getText().toString();
                a2.setText("Heart Disease");
                if(ans.equals("None of the above"))
                    out.setText("You are at moderate risk of infection. But don't worry stay home and stay safe!");
                else
                    out.setText("You are at high risk of infection. But don't worry stay home and stay safe!");
                a2.setVisibility(View.VISIBLE);
                out.setVisibility(View.VISIBLE);
            }
        });

        q2_lung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans = a1.getText().toString();
                a2.setText("Lung Disease");
                if(ans.equals("None of the above"))
                    out.setText("You are at moderate risk of infection. But don't worry stay home and stay safe!");
                else
                    out.setText("You are at high risk of infection. But don't worry stay home and stay safe!");
                a2.setVisibility(View.VISIBLE);
                out.setVisibility(View.VISIBLE);
            }
        });

        q2_none.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ans = a1.getText().toString();
                a2.setText("None of the above");
                if(ans.equals("None of the above"))
                    out.setText("You are at low risk of infection. But don't worry stay home and stay safe!");
                else
                    out.setText("You are at moderate risk of infection. But don't worry stay home and stay safe!");
                a2.setVisibility(View.VISIBLE);
                out.setVisibility(View.VISIBLE);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String back = out.getText().toString();

                Intent intent = new Intent();
                intent.putExtra("back",out.getText().toString());
                setResult(RESULT_OK,intent);
                SelfTest.this.finish();
            }
        });

//        q1_cough.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                a1.setText("Cough");
//                a1.setVisibility(View.VISIBLE);
//                out.setText("You are at high risk of infection. But don't worry stay home and stay safe!");
//                q2.setVisibility(View.VISIBLE);
//                q2_diabetes.setVisibility(View.VISIBLE);
//                q2_lung.setVisibility(View.VISIBLE);
//                q2_heart.setVisibility(View.VISIBLE);
//                q2_none.setVisibility(View.VISIBLE);
//            }
//        });
//
//        q1_fever.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                a1.setText("Fever");
//                a1.setVisibility(View.VISIBLE);
//                out.setText("You are at high risk of infection. But don't worry stay home and stay safe!");
//                q2.setVisibility(View.VISIBLE);
//                q2_diabetes.setVisibility(View.VISIBLE);
//                q2_lung.setVisibility(View.VISIBLE);
//                q2_heart.setVisibility(View.VISIBLE);
//                q2_none.setVisibility(View.VISIBLE);
//
//            }
//        });
//
//        q1_diffculty.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                a1.setText("Difficulty in Breathing");
//                a1.setVisibility(View.VISIBLE);
//                out.setText("You are at high risk of infection. But don't worry stay home and stay safe!");
//                q2.setVisibility(View.VISIBLE);
//                q2_diabetes.setVisibility(View.VISIBLE);
//                q2_lung.setVisibility(View.VISIBLE);
//                q2_heart.setVisibility(View.VISIBLE);
//                q2_none.setVisibility(View.VISIBLE);
//            }
//        });
//
//        q1_none.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                a1.setText("None of the above");
//                a1.setVisibility(View.VISIBLE);
//                out.setText("You are at low risk of infection. But stay home and stay safe!");
//                q2.setVisibility(View.VISIBLE);
//                q2_diabetes.setVisibility(View.VISIBLE);
//                q2_lung.setVisibility(View.VISIBLE);
//                q2_heart.setVisibility(View.VISIBLE);
//                q2_none.setVisibility(View.VISIBLE);
//
//            }
//        });
//
//
////        o2 = out.getText().toString();
//
//        q2_diabetes.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                a2.setText("Diabetes");
//                a2.setVisibility(View.VISIBLE);
//                if(out.getText().toString().equals("You are at low risk of infection. But stay home and stay safe!"))
//                    out.setText("You are at moderate risk of infection. But stay home and stay safe!");
//                else
//                    out.setText("You are at high risk of infection. But don't worry stay home and stay safe!");
//                out.setVisibility(View.VISIBLE);
//
//            }
//        });
//
//        q2_lung.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                a2.setText("Lung Disease");
//                a2.setVisibility(View.VISIBLE);
//                if(out.getText().toString().equals("You are at low risk of infection. But stay home and stay safe!"))
//                    out.setText("You are at moderate risk of infection. But stay home and stay safe!");
//                else
//                    out.setText("You are at high risk of infection. But don't worry stay home and stay safe!");
//                out.setVisibility(View.VISIBLE);
//            }
//        });
//
//        q2_heart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                a2.setText("Heart Disease");
//                a2.setVisibility(View.VISIBLE);
//                if(out.getText().toString().equals("You are at low risk of infection. But stay home and stay safe!"))
//                    out.setText("You are at moderate risk of infection. But stay home and stay safe!");
//                else
//                    out.setText("You are at high risk of infection. But don't worry stay home and stay safe!");
//                out.setVisibility(View.VISIBLE);
//            }
//        });
//
//        q2_none.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                a2.setText("None of the above");
//                a2.setVisibility(View.VISIBLE);
//                if(out.getText().toString().equals("You are at high risk of infection. But stay home and stay safe!"))
//                    out.setText("You are at moderate risk of infection. But stay home and stay safe!");
//                else
//                    out.setText("You are at low risk of infection. But don't worry stay home and stay safe!");
//                out.setVisibility(View.VISIBLE);
//
//            }
//        });
//
////       o1 = out.getText().toString();
//        final String o3;
//        o3 = "NULL";
//
//        if(out.getText().toString().equals("You are at high risk of infection. But don't worry stay home and stay safe!"))
//        {
//            back.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    Intent intent = new Intent();
//                    intent.putExtra("o3",out.getText().toString());
//                    setResult(RESULT_CANCELED,intent);
//                    SelfTest.this.finish();
//                }
//            });
//
//        }
//        else
//        {
//            back.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    Intent intent = new Intent();
//                    intent.putExtra("o3",out.getText().toString());
//                    setResult(RESULT_OK,intent);
//                    SelfTest.this.finish();
//                }
//            });
//        }
//
    }
}
