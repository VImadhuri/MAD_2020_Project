package com.example.mad_2020_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditItem extends AppCompatActivity {

    private Button button;
    private EditText name,price;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        button = (Button) findViewById(R.id.btn5_madu);
        name = (EditText) findViewById(R.id.edtxt3_madu);
        price = (EditText) findViewById(R.id.edtxt4_madu);
        context = this;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Foods.class);
                startActivity(intent);
            }
        });
    }
}
