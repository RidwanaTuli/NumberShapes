package com.example.numbershape;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void testNumber(View view) {
        EditText usersNumber = (EditText) findViewById(R.id.editText);

        Log.i("UsersNumber", usersNumber.getText().toString());

    }
}
