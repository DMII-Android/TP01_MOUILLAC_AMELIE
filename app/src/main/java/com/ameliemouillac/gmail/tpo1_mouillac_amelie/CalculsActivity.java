package com.ameliemouillac.gmail.tpo1_mouillac_amelie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ameliemouillac.gmail.tpo1_mouillac_amelie.databinding.ActivityCalculsBinding;
import com.ameliemouillac.gmail.tpo1_mouillac_amelie.databinding.ActivityMainBinding;

public class CalculsActivity extends AppCompatActivity {

    private Integer counterValue = 0;

    ActivityCalculsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCalculsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        this.setCounterEvent();
        this.setAddEvent();
    }

    // Exercice 1
    private void setCounterEvent() {
        binding.counter.setText(String.valueOf(this.counterValue));
        binding.toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CalculsActivity.this, String.valueOf(counterValue), Toast.LENGTH_SHORT).show();
            }
        });
        binding.count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterValue += 1;
                binding.counter.setText(String.valueOf(counterValue));
            }
        });
    }

    // Exercice 2
    private void setAddEvent() {
        binding.additionButton.setOnClickListener(v -> {
            int value = Integer.parseInt(binding.number1TV.getText().toString()) + Integer.parseInt(binding.number2TV.getText().toString());
            binding.additionResponseTV.setText("" + value);
        });
    }
}