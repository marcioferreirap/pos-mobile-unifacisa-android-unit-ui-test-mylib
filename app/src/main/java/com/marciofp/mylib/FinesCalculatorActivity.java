package com.marciofp.mylib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.marciofp.mylib.models.Fine;

import org.w3c.dom.Text;

public class FinesCalculatorActivity extends AppCompatActivity {
    EditText days;
    EditText fine;
    TextView result;
    Button butn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fines_calculator);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("Register Student");

        days = (EditText) findViewById(R.id.editText4);
        fine = (EditText) findViewById(R.id.editText5);
        result = (TextView) findViewById(R.id.textView);

        Button butn = (Button) findViewById(R.id.button3);
        butn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Fine fineCalc = new Fine();
                String res = Double.toString(fineCalc.calcFineTax(Double.parseDouble(String.valueOf(fine.getText())),Integer.parseInt(days.getText().toString())));
                result.setText(res);

            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                startActivity(new Intent(this, MainActivity.class));
                finishAffinity();
                break;
            default:break;
        }
        return true;
    }

    @Override
    public void onBackPressed(){
        startActivity(new Intent(this, MainActivity.class));
        finishAffinity();
        return;
    }
}
