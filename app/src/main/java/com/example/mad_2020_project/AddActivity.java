package com.example.mad_2020_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class AddActivity extends AppCompatActivity {
    private Button button;
    private EditText name,price;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);


        button = (Button) findViewById(R.id.btn1_madu);

        name = (EditText) findViewById(R.id.edtxt1_madu);
        price = (EditText) findViewById(R.id.edtxt2_madu);
        context = this;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name = name.getText().toString();
                String Price = price.getText().toString();
                long started = System.currentTimeMillis();

            }
        });

    }
}
