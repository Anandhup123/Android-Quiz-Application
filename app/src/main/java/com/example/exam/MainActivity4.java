package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity4 extends AppCompatActivity {
    RadioButton a0;
    RadioButton a1;
    RadioButton a2;
    Button clicke;

    String answer="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        a0=findViewById(R.id.answer4);
        a1=findViewById(R.id.wanswer4);
        a2=findViewById(R.id.wranswer4);
        clicke=findViewById(R.id.submit4);

        if(a0.isChecked()){
            answer="correct";
        } else if (a1.isChecked()) {
            answer="wrong";
        } else if (a2.isChecked()) {
            answer="wrong";
        }
        else{
            answer="please select any one of the option";

        }
        clicke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a0.isChecked()){
                    Intent i=new Intent(MainActivity4.this, MainActivity5.class);
                    startActivity(i);
                }
                else{
                    Intent i=new Intent(MainActivity4.this, MainActivity9.class);
                    startActivity(i);
                }

            }
        });
    }
}