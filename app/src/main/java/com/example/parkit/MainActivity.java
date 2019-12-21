package com.example.parkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText logEmail, logPass;
    Button logButton;
    TextView signup, forgotpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logEmail = findViewById(R.id.txtLogEmail);
        logPass = findViewById(R.id.txtLogPassword);
        logButton = findViewById(R.id.btnLogin);
        forgotpassword = findViewById(R.id.txtForgotPassword);
        signup = findViewById(R.id.txtSignUp);


        logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(MainActivity.this, CustomerMap.class);
                startActivity(loginIntent);
            }
        });
        forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(MainActivity.this, CustomerMap.class);
                startActivity(loginIntent);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(MainActivity.this, Registration.class);
                startActivity(loginIntent);
            }
        });
    }
}
