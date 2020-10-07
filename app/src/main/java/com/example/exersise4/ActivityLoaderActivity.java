package com.example.exersise4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityLoaderActivity extends AppCompatActivity {
    private Button callBtn;
    private Button browserBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loaderactivity);

        callBtn = findViewById(R.id.callBtn);
        browserBtn = findViewById(R.id.browserBtn);

    }

    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.browserBtn:
                Uri webpage = Uri.parse("http://www.amazon.com");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(Intent.createChooser((webIntent), "Choose"));
                startActivity(webIntent);
                break;

            case R.id.callBtn:
                String justCall = "+194912344444";

                Intent callActivity = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + justCall));
                startActivity(callActivity);
                break;

        }
    }
}