package com.techweezy.modcomandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Read on events and listeners in android
    EditText time, principle, resultsEt;
    TextView results;
    Button calculateResults, listButton, fragBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        time = findViewById(R.id.timeET);
        principle = findViewById(R.id.principleET);
        results= findViewById(R.id.resultsTV);
        fragBtn = findViewById(R.id.fragmentBTN);
        resultsEt = findViewById(R.id.resultsET);

        calculateResults = findViewById(R.id.calcInterestBTN);
        listButton = findViewById(R.id.listBtn);
        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        ListActivity.class);
                startActivity(intent);
            }
        });
        fragBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        FragmentActivity.class);
                startActivity(intent);
            }
        });

        calculateResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double typed_time;
                double typed_principle;
                typed_principle = Double.parseDouble(principle.getText().toString());
                typed_time = Double.parseDouble(time.getText().toString());
                double rate = 0.03;
                double answer = typed_principle*typed_time*rate;
                resultsEt.setText(String.valueOf(answer));

            }
        });


    }
}
