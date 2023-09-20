package com.example.mad_borromeomanipis_act1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button colorbtn = findViewById(R.id.colorbtn);
        Button sizebtn = findViewById(R.id.sizebtn);
        TextView maintext = findViewById(R.id.maintext);

        //change font color
        colorbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int color = Color.argb(219, random.nextInt(255), random.nextInt(255), random.nextInt(255) );
                maintext.setTextColor(color);

            }
        });

        //change font size
        sizebtn.setOnClickListener(new View.OnClickListener() {
            boolean isTextLarge = false;

            @Override
            public void onClick(View view) {
                if(isTextLarge){
                    maintext.setTextSize(25);
                    isTextLarge = false;
                }
                else{
                    maintext.setTextSize(30);
                    isTextLarge = true;
                }

            }
        });


    }
}
