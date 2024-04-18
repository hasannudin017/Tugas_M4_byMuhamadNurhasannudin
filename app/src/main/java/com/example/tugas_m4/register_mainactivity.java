package com.example.tugas_m4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class register_mainactivity extends AppCompatActivity {

    private EditText inputUsername, inputEmail, inputPassword;
    private CheckBox checkBoxSyarat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_mainactivity);

        inputUsername = findViewById(R.id.register_username);
        inputEmail = findViewById(R.id.register_email);
        inputPassword = findViewById(R.id.register_password);
        checkBoxSyarat = findViewById(R.id.checkBoxSyarat);

        AppCompatButton createAccountButton = findViewById(R.id.createAccountButton);
        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBoxSyarat.isChecked()) {
                    // Mendapatkan data yang dimasukkan oleh pengguna
                    String username = inputUsername.getText().toString();
                    String email = inputEmail.getText().toString();
                    String password = inputPassword.getText().toString();

                    // Membuat intent untuk pindah ke halaman register success dan mengirim data
                    Intent intent = new Intent(register_mainactivity.this, hasil_register.class);
                    intent.putExtra("username", username);
                    intent.putExtra("email", email);
                    intent.putExtra("password", password);
                    startActivity(intent);
                } else {
                    Toast.makeText(register_mainactivity.this, "Mohon setujui syarat dan ketentuan", Toast.LENGTH_SHORT).show();
                }
            }
        });

        AppCompatButton loginButton = findViewById(R.id.loginButton3);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(register_mainactivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
