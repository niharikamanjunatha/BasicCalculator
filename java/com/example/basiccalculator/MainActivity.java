package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float result = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText number1 = (EditText) findViewById(R.id.number1);
        final EditText number2 = (EditText) findViewById(R.id.number2);
        Button add = (Button) findViewById(R.id.btnAdd);
        Button sub = (Button) findViewById(R.id.btnSub);
        Button mul = (Button) findViewById(R.id.btnMul);
        Button div = (Button) findViewById(R.id.btnDiv);
        final TextView txtScreen = (TextView) findViewById(R.id.txtScreen);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   float result = Float.parseFloat(number1.getText().toString()) + Float.parseFloat(number2.getText().toString());
                   txtScreen.setText(""+result);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float result = Float.parseFloat(number1.getText().toString()) - Float.parseFloat(number2.getText().toString());
                txtScreen.setText(""+result);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float result = Float.parseFloat(number1.getText().toString()) * Float.parseFloat(number2.getText().toString());
                txtScreen.setText(""+result);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    float result = Float.parseFloat(number1.getText().toString()) / Float.parseFloat(number2.getText().toString());
                    txtScreen.setText("" + result);
                }
                catch (ArithmeticException ex)
                {
                       txtScreen.setText("Error: Division not possible");
                }
            }
        });
    }
}
