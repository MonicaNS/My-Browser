package com.example.mybrowser2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text1);
        String URL = getIntent().getDataString();
        textView.setText(URL);
    }

    protected void onResume(){
        super.onResume();
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text1);
        String URL = getIntent().getDataString();
        textView.setText(URL);
    }
}
