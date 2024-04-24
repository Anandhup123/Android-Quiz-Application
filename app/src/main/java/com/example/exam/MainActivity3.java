package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity3 extends AppCompatActivity {
    RadioButton x0;
    RadioButton x1;
    RadioButton x2;
    Button clickmee;

    String answer="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        x0=findViewById(R.id.answer1);
        x1=findViewById(R.id.wanswer1);
        x2=findViewById(R.id.wranswer1);
        clickmee=findViewById(R.id.submit9);

        if(x0.isChecked()){
            answer="correct";
        } else if (x1.isChecked()) {
            answer="wrong";
        } else if (x2.isChecked()) {
            answer="wrong";
        }
        else{
            answer="please select any one of the option";

        }
        clickmee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x0.isChecked()){
                    Intent i=new Intent(MainActivity3.this, MainActivity4.class);
                    startActivity(i);
                }
                else{
                    Intent i=new Intent(MainActivity3.this, MainActivity9.class);
                    startActivity(i);
                }

            }
        });
    }
}