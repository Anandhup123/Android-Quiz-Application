package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity2 extends AppCompatActivity {
    RadioButton w0;
    RadioButton w1;
    RadioButton w2;
  Button clickme;

  String answer="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        w0=findViewById(R.id.answer);
        w1=findViewById(R.id.wanswer);
        w2=findViewById(R.id.wranswer);
        clickme=findViewById(R.id.submit1);

        if(w0.isChecked()){
            answer="correct";
        } else if (w1.isChecked()) {
            answer="wrong";
        } else if (w2.isChecked()) {
            answer="wrong";
        }
        else{
            answer="please select any one of the option";

        }
        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(w0.isChecked()){
                    Intent i=new Intent(MainActivity2.this, MainActivity6.class);
                    startActivity(i);
                }
                else{
                    Intent i=new Intent(MainActivity2.this, MainActivity9.class);
                    startActivity(i);
                }

            }
        });
    }
}