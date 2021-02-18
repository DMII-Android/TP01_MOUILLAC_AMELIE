package com.ameliemouillac.gmail.tpo1_mouillac_amelie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ameliemouillac.gmail.tpo1_mouillac_amelie.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        this.setButtonsEvents();
    }

    private void setButtonsEvents() {
        binding.calculsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intention = new Intent(MainActivity.this, CalculsActivity.class);
                startActivity(intention);
            }
        });

        binding.mailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();
            }
        });
    }

    private void sendEmail() {
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{ "ameliemouillacpro@gmail.com"});
        email.putExtra(Intent.EXTRA_SUBJECT, "Test Android Mail");
        email.putExtra(Intent.EXTRA_TEXT, binding.mailContentTV.getText().toString());

        //need this to prompts email client only
        email.setType("message/rfc822");

        startActivity(email);
    }

}