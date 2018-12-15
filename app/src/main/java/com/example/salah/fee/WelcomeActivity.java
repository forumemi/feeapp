package com.example.salah.fee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    Button ok = null ;


    public View.OnClickListener okListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent next =new Intent(WelcomeActivity.this,MainActivity.class);
            WelcomeActivity.this.startActivity(next);

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        ok = (Button)findViewById(R.id.ok);

        ok.setOnClickListener(okListner);

        }
    }

