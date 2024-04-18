package com.example.tugas_m4;

import android.os.Bundle;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class hasil_register extends AppCompatActivity {

    private EditText inputUsername, inputEmail, inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_register);

        // Mengambil data yang dikirim dari halaman sebelumnya
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String username = extras.getString("username");
            String email = extras.getString("email");
            String password = extras.getString("password");

            // Menampilkan data yang diterima di EditText yang sesuai
            inputUsername = findViewById(R.id.hasil_inputusername);
            inputEmail = findViewById(R.id.hasil_inputemail);
            inputPassword = findViewById(R.id.hasil_inputpassword);

            inputUsername.setText(username);
            inputEmail.setText(email);
            inputPassword.setText(password);
        }
    }
}
