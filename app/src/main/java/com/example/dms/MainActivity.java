package com.example.dms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText editTextTextPersonName;
    private EditText editTextTextPersonName2;
    private EditText editTextTextPersonName3;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        editTextTextPersonName=findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2=findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName3=findViewById(R.id.editTextTextPersonName3);




    }

    public void openActivity(View v)
    {
        Intent intent = new Intent(this, MainActivity3.class);
        String name = editTextTextPersonName.getText().toString();
        String contact = editTextTextPersonName.getText().toString();
        String location = editTextTextPersonName.getText().toString();
        startActivity(intent);
    }
}