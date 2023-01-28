package com.example.askme_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_top3_authors extends AppCompatActivity {

    Button btnGoBlog1, btnGoBlog2, btnGoBlog3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top3_authors);

        btnGoBlog1 = findViewById(R.id.btnGoBlog1);
        btnGoBlog2 = findViewById(R.id.btnGoBlog2);
        btnGoBlog3 = findViewById(R.id.btnGoBlog3);

        btnGoBlog1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(activity_top3_authors.this, activity_author_blog.class));
                finish();
            }
        });
    }
}