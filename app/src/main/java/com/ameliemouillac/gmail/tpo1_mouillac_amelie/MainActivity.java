package com.ameliemouillac.gmail.tpo1_mouillac_amelie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView counterTV;
    private Integer counterValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.initView();
    }

    private void initView() {
        Button toastBtn = findViewById(R.id.toast);
        Button countBtn = findViewById(R.id.count);
        this.counterTV = findViewById(R.id.counter);

        this.counterTV.setText(String.valueOf(this.counterValue));

        toastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, String.valueOf(counterValue), Toast.LENGTH_SHORT).show();
            }
        });

        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterValue += 1;
                counterTV.setText(String.valueOf(counterValue));
            }
        });
    }
}