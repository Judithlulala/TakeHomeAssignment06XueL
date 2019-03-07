package com.example.takehomeassignment06_xuel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class YourReceipt extends AppCompatActivity {
private TextView displayContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_receipt);


        Intent intent = getIntent();


        double amount=intent.getDoubleExtra("Total",0);
      double tax=intent.getDoubleExtra("Tax Percentage",0);
     double tip=intent.getDoubleExtra("Tip Percentage",0);

        displayContent=(TextView)findViewById(R.id.display);
        String message="Total: "+amount+"\nTax Percentage: "+tax*amount+"\n Tip Percentage: "+tip*amount+"\nGrand Total: "+amount*(1+tax+tip);
        displayContent.setText(message);
    }
}
