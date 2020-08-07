package com.example.aarogyasetu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Hospitals extends AppCompatActivity {

    EditText search;
    Button bt_search;
    ImageView gang_name,gang,gang_call,gang_get,deen_name,deen,deen_call,deen_get,gb_name,gb,gb_call,gb_get,guru_name,guru,guru_call,guru_get,max_name,max,max_call,max_get,raj_name,raj,raj_call,raj_get,rml_name,rml,rml_call,rml_get;
//    TextView hos1,hos2,hos3,hos4,hos5,hos6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitals);
        search = findViewById(R.id.search);
        bt_search = findViewById(R.id.bt_search);

        gang_name = findViewById(R.id.gang_name);
        gang = findViewById(R.id.gang);
        gang_call = findViewById(R.id.gang_call);
        gang_get = findViewById(R.id.gang_get);
        deen_name = findViewById(R.id.deen_name);
        deen = findViewById(R.id.deen);
        deen_call = findViewById(R.id.deen_call);
        deen_get = findViewById(R.id.deen_get);
        gb_name = findViewById(R.id.gb_name);
        gb = findViewById(R.id.gb);
        gb_call = findViewById(R.id.gb_call);
        gb_get = findViewById(R.id.gb_get);
        guru_name = findViewById(R.id.guru_name);
        guru = findViewById(R.id.guru);
        guru_call = findViewById(R.id.guru_call);
        guru_get = findViewById(R.id.guru_get);
        max_name = findViewById(R.id.max_name);
        max = findViewById(R.id.max);
        max_call = findViewById(R.id.max_call);
        max_get = findViewById(R.id.max_get);
        raj_name = findViewById(R.id.raj_name);
        raj = findViewById(R.id.raj);
        raj_call = findViewById(R.id.raj_call);
        raj_get = findViewById(R.id.raj_get);
        rml_name = findViewById(R.id.rml_name);
        rml = findViewById(R.id.rml);
        rml_call = findViewById(R.id.rml_call);
        rml_get = findViewById(R.id.rml_get);

//        hos1 = findViewById(R.id.hos1);
//        hos2 = findViewById(R.id.hos2);
//        hos3 = findViewById(R.id.hos3);
//        hos4 = findViewById(R.id.hos4);
//        hos5 = findViewById(R.id.hos5);
//        hos6 = findViewById(R.id.hos6);
//
        gang_name.setVisibility(View.GONE);
        gang.setVisibility(View.GONE);
        gang_call.setVisibility(View.GONE);
        gang_get.setVisibility(View.GONE);

        deen_name.setVisibility(View.GONE);
        deen.setVisibility(View.GONE);
        deen_call.setVisibility(View.GONE);
        deen_get.setVisibility(View.GONE);

        gb_name.setVisibility(View.GONE);
        gb.setVisibility(View.GONE);
        gb_call.setVisibility(View.GONE);
        gb_get.setVisibility(View.GONE);

        guru_name.setVisibility(View.GONE);
        guru.setVisibility(View.GONE);
        guru_call.setVisibility(View.GONE);
        guru_get.setVisibility(View.GONE);

        max_name.setVisibility(View.GONE);
        max.setVisibility(View.GONE);
        max_call.setVisibility(View.GONE);
        max_get.setVisibility(View.GONE);

        raj_name.setVisibility(View.GONE);
        raj.setVisibility(View.GONE);
        raj_call.setVisibility(View.GONE);
        raj_get.setVisibility(View.GONE);

        rml_name.setVisibility(View.GONE);
        rml.setVisibility(View.GONE);
        rml_call.setVisibility(View.GONE);
        rml_get.setVisibility(View.GONE);

        bt_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(search.getText().toString().trim().isEmpty())
                    Toast.makeText(Hospitals.this, "Please enter your city", Toast.LENGTH_SHORT).show();
                else
                {
                    if(search.getText().toString().trim().equals("Delhi") || search.getText().toString().trim().equals("delhi") ||search.getText().toString().trim().equals("DELHI"))
                    {
                        gang_name.setVisibility(View.VISIBLE);
                        gang.setVisibility(View.VISIBLE);
                        gang_call.setVisibility(View.VISIBLE);
                        gang_get.setVisibility(View.VISIBLE);

                        deen_name.setVisibility(View.VISIBLE);
                        deen.setVisibility(View.VISIBLE);
                        deen_call.setVisibility(View.VISIBLE);
                        deen_get.setVisibility(View.VISIBLE);

                        gb_name.setVisibility(View.VISIBLE);
                        gb.setVisibility(View.VISIBLE);
                        gb_call.setVisibility(View.VISIBLE);
                        gb_get.setVisibility(View.VISIBLE);

                        guru_name.setVisibility(View.VISIBLE);
                        guru.setVisibility(View.VISIBLE);
                        guru_call.setVisibility(View.VISIBLE);
                        guru_get.setVisibility(View.VISIBLE);

                        max_name.setVisibility(View.VISIBLE);
                        max.setVisibility(View.VISIBLE);
                        max_call.setVisibility(View.VISIBLE);
                        max_get.setVisibility(View.VISIBLE);

                        raj_name.setVisibility(View.VISIBLE);
                        raj.setVisibility(View.VISIBLE);
                        raj_call.setVisibility(View.VISIBLE);
                        raj_get.setVisibility(View.VISIBLE);

                        rml_name.setVisibility(View.VISIBLE);
                        rml.setVisibility(View.VISIBLE);
                        rml_call.setVisibility(View.VISIBLE);
                        rml_get.setVisibility(View.VISIBLE);

                        gang_call.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:011 2575 0000"));
                                startActivity(intent);
                            }
                        });
                        gang_get.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Sarhadi Gandhi Marg, near Bal Bharati Public School, Old Rajinder Nagar, Rajinder Nagar, New Delhi, Delhi 110060"));
                                startActivity(intent);
                            }
                        });
                        deen_call.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:011 2549 4402"));
                                startActivity(intent);
                            }
                        });
                        deen_get.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Shaheed Mangal Pandey Marg, Nanak Pura, Hari Nagar, New Delhi, Delhi 110064"));
                                startActivity(intent);
                            }
                        });
                        gb_call.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:011 2323 4242"));
                                startActivity(intent);
                            }
                        });
                        gb_get.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=1, Jawaharlal Nehru Marg, 64 Khamba, Raj Ghat, New Delhi, Delhi 110002"));
                                startActivity(intent);
                            }
                        });
                        guru_call.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:011 2258 6262"));
                                startActivity(intent);
                            }
                        });
                        guru_get.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Tahirpur Rd, GTB Enclave, Dilshad Garden, New Delhi, Delhi 110095"));
                                startActivity(intent);
                            }
                        });
                        max_call.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:011 2651 5050"));
                                startActivity(intent);
                            }
                        });
                        max_get.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=1, 2, Press Enclave Marg, Saket Institutional Area, Saket, New Delhi, Delhi 110017"));
                                startActivity(intent);
                            }
                        });
                        raj_call.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:011 2289 0604"));
                                startActivity(intent);
                            }
                        });
                        raj_get.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Taharpur Rd, Taharpur, Taharpur Village, Dilshad Garden, New Delhi, Delhi 110093"));
                                startActivity(intent);
                            }
                        });
                        rml_call.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:011 2336 5525"));
                                startActivity(intent);
                            }
                        });
                        rml_get.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=Baba Kharak Singh Rd, near Gurudwara Bangla Sahib, Ram Manohar Lohia Hospital, Type III, Connaught Place, New Delhi, Delhi 110001"));
                                startActivity(intent);
                            }
                        });

                    }
                    else if(search.getText().toString().trim().equals("Gurgaon") || search.getText().toString().trim().equals("gurgaon")||search.getText().toString().trim().equals("Gurugram") || search.getText().toString().trim().equals("gurugram")||search.getText().toString().trim().equals("GURGAON") || search.getText().toString().trim().equals("GURUGRAM"))
                    {
//                        hos1.setText("ESIC Hospital\n769, Service Ln, near Mothers Pride School, Sector 7, Sector 9A, Gurugram, Haryana 122001\nPhone: 0124 225 2001");
//                        hos2.setText("Civil Hospital\nAddress: Jharsa Road, near Bus Stand Road, Gurugram, Haryana 122001\nPhone: (0124) 2333 102");
//                        hos3.setText("SGT Medical College Hospital & Research Institute\nAddress: Village, near Sultanpur Bird Sanctuary, Budhera, Gurugram, Haryana 122505\nPhone: 0124 227 8256\n");
//                        hos1.setVisibility(View.VISIBLE);
//                        hos2.setVisibility(View.VISIBLE);
//                        hos3.setVisibility(View.VISIBLE);
//                        hos4.setVisibility(View.GONE);
//                        hos5.setVisibility(View.GONE);
//                        hos6.setVisibility(View.GONE);
                    }


                }
            }
        });
    }
}