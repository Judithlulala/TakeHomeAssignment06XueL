package com.example.takehomeassignment06_xuel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import android.widget.EditText;

import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Button submit;

    private EditText Amount;
    private EditText TaxPercentage;
    private EditText TipPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Amount = (EditText) findViewById(R.id.amount);
        TaxPercentage = (EditText) findViewById(R.id.taxPercentage);
        TipPercentage = (EditText) findViewById(R.id.tipPercentage);

        submit = (Button) findViewById(R.id.submit_button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Display();
            }
        });
    }
    public EditText getAmount() {
        return Amount;
    }

    public EditText getTaxPercentage() {
        return TaxPercentage;
    }

    public EditText getTipPercentage() {
        return TipPercentage;}

    public void Display() {

        double amountN = Double.parseDouble(getAmount().getText().toString());
       double taxPercentageN = Double.parseDouble(getTaxPercentage().getText().toString());
        double tipPercentageN = Double.parseDouble(getTipPercentage().getText().toString());

        Intent intent = new Intent(MainActivity.this, YourReceipt.class);

        intent.putExtra("Total", amountN);
        intent.putExtra("Tax Percentage", taxPercentageN);
        intent.putExtra("Tip Percentage", tipPercentageN);


        startActivity(intent);

    }


    }

