package com.example.raghav_dell.swap_the_number;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b;
    int n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show();
    }
    public void show() {
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Integer.parseInt(String.valueOf(e1.getText()));
                n2 = Integer.parseInt(String.valueOf(e2.getText()));
                n1 = n1 + n2;
                n2 = n1 - n2;
                n1 = n1 - n2;
                e1.setText(String.valueOf(n1));
                e2.setText(String.valueOf(n2));

            }
        });
    }}