package com.example.bigboiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.cert.CertificateFactorySpi;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView text;
    Random random;
    Button pressButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pressButton = findViewById(R.id.pressButton);
        text = findViewById(R.id.text);





        pressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNewFact();
            }
        });
    }

    public void showNewFact(){
        String[] facts = {"name is Zac and i am 15 years old",
                "i have raised 1 pig and 2 chickens",
                "I have 1 sister an 1 dog"};

        random = new Random{};
        int randomNumber = random.nextInt(facts.length);

        text.setText (facts{randomNumber});



    }
}
