package com.example.tugas_m4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText usernameEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatButton loginButton = findViewById(R.id.loginButton);
        AppCompatButton registerButton = findViewById(R.id.Rrgisterbtn2);
        usernameEditText = findViewById(R.id.login_username);
        passwordEditText = findViewById(R.id.login_password);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginUser();
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, register_mainactivity.class);
                startActivity(intent);
            }
        });
    }

    private void loginUser() {
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        // Check if username and password are correct (You may replace this with your authentication logic)
        if (username.equals("Hasan Nudin") && password.equals("123")) {
            // If username and password are correct, move to login success page
            Intent intent = new Intent(MainActivity.this, Hasil_login.class);
            intent.putExtra("username", username); // Send username to the login success page
            intent.putExtra("password", password); // Send password to the login success page
            startActivity(intent);
            finish();
        } else {
            // If username and password are incorrect, show error message
            Toast.makeText(MainActivity.this, "Username atau password salah", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity();
    }
}
