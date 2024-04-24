package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity6 extends AppCompatActivity {
    RadioButton b0;
    RadioButton b1;
    RadioButton b2;
    Button clicke;

    String answer="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        b0=findViewById(R.id.answer6);
        b1=findViewById(R.id.wanswer6);
        b2=findViewById(R.id.wranswer6);
        clicke=findViewById(R.id.submit6);

        if(b0.isChecked()){
            answer="correct";
        } else if (b1.isChecked()) {
            answer="wrong";
        } else if (b2.isChecked()) {
            answer="wrong";
        }
        else{
            answer="please select any one of the option";

        }
        clicke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b0.isChecked()){
                    Intent i=new Intent(MainActivity6.this, MainActivity3.class);
                    startActivity(i);
                }
                else{
                    Intent i=new Intent(MainActivity6.this, MainActivity9.class);
                    startActivity(i);
                }

            }
        });



    }
}