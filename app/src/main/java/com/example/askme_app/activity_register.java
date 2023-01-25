package com.example.askme_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.example.askme_app.Models.User;
import com.rengwuxian.materialedittext.MaterialEditText;

import java.net.HttpURLConnection;
import java.net.URL;

public class activity_register extends AppCompatActivity {

    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doRegistration();
            }
        });
    }

    private void doRegistration() {
        MaterialEditText loginView = findViewById(R.id.loginField);
        MaterialEditText emailView = findViewById(R.id.emailField);
        MaterialEditText passwordView = findViewById(R.id.passwordField);
        RadioButton isAuthorView = findViewById(R.id.authorRadioButton);

        String login = loginView.getText().toString();
        String email = emailView.getText().toString();
        String password = passwordView.getText().toString();
        boolean is_author = isAuthorView.isChecked();

        User user = new User();
        user.setLogin(login);
        user.setEmail(email);
        user.setPassword(password);
        user.setIsAuthor(is_author);

        String urlAddres = "http://localhost:7279/swagger/index.html/post/user/create";
        URL url;
        HttpURLConnection httpURLConnection;
    }
}