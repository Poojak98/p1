package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText=(EditText)findViewById(R.id.editText);
        Intent sentIntent = getIntent();
        String ans = sentIntent.getStringExtra("HELLO");
        editText.setText("Hello " +ans);
        Toast.makeText(this, ans, Toast.LENGTH_SHORT).show();
    }
}
