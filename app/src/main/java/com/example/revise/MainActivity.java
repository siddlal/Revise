package com.example.revise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){
//        Log.i("Info","done");
        TextView myTextField = findViewById(R.id.myTextField);
        TextView myTextFieldOne = findViewById(R.id.myTextFieldOne);
        Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        Log.i("Info", myTextField.getText().toString());
        Log.i("Info", myTextFieldOne.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
