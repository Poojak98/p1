package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText editText;
    private static final String Tag=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.activityAButton).setOnClickListener(this);
        editText=(EditText)findViewById(R.id.editText);
        Log.i(Tag, "in method OnCreate");
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("HELLO", editText.getText().toString());
        startActivity(intent);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag,"in method onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag,"in method onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag,"in method onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag,"in method onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag,"in method onDestroy");
    }
}