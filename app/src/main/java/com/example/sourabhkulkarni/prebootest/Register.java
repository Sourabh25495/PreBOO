package com.example.sourabhkulkarni.prebootest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity implements View.OnClickListener {
    Button bregister;
    EditText etname, etage, etUN, etpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etname = (EditText) findViewById(R.id.etname);
        etage = (EditText) findViewById(R.id.etage);
        etUN = (EditText) findViewById(R.id.etusername1);
        etpass = (EditText) findViewById(R.id.etPassword);
        bregister = (Button) findViewById(R.id.Register);

        bregister.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Register:


                break;


        }
    }
}
