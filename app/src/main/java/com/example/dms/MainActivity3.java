package com.example.dms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
    }

    public void openActivity1(View v)
    {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    public void openActivity2(View v)
    {
        Intent intent1 = new Intent(this, MainActivity5.class);
        startActivity(intent1);
    }
}