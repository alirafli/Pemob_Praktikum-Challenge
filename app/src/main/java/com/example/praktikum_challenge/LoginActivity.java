package com.example.praktikum_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText Email, Password;
    TextView Register;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Email = findViewById(R.id.email);
        Password = findViewById(R.id.password);
        Login = findViewById(R.id.login);
        Register = findViewById(R.id.register);

//        Register.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent RegisterIntent = new Intent(LoginActivity.this, MaintenanceActivity.class);
//                startActivity(RegisterIntent);
//            }
//        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = Email.getText().toString();
                String password = Password.getText().toString();

                if (email.equals(email) && password.equals("admin")){
                    Intent intent = new Intent(LoginActivity.this, HomepageActivity.class);
                    intent.putExtra("EMAIL", email);
                    Toast.makeText(LoginActivity.this, "login berhasil", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginActivity.this, "login gagal", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}