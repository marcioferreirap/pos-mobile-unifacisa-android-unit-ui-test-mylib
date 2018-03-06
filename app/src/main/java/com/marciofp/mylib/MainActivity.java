package com.marciofp.mylib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnRegisterStudentPressed(View view) {
        Intent intent = new Intent(getBaseContext(), RegisterStudentActivity.class);
        startActivity(intent);
    }

    public void btnRegisterBookPressed(View view) {
        Intent intent = new Intent(getBaseContext(), RegisterBookActivity.class);
        startActivity(intent);
    }

    public void btnCalcPressed(View view) {
        Intent intent = new Intent(getBaseContext(), FinesCalculatorActivity.class);
        startActivity(intent);
    }

    public void btnQuitPressed(View view) {
    }
}
