package com.example.democlick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void buttonClicked(View view) {
        EditText myTextfield = (EditText) findViewById(R.id.myTextfield);
        Log.i("info", myTextfield.getText().toString());
        Toast.makeText(MainActivity.this,"Hi there, "+ myTextfield.getText().toString()+ "!",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
