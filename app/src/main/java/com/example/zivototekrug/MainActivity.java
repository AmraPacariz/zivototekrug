package com.example.zivototekrug;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registration=findViewById(R.id.registracija);

    }



    public void registerUser(View view) {

        Intent intent=new Intent(this,RegisterUser.class);
        startActivity(intent);
    }
}