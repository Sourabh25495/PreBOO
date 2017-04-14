package com.example.sourabhkulkarni.prebootest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button bLogout;
    EditText etName, etage, etUsername;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etName = (EditText) findViewById(R.id.etname);
        etage = (EditText) findViewById(R.id.etage);
        etUsername = (EditText) findViewById(R.id.etusername1);

        bLogout = (Button) findViewById(R.id.logout);
        bLogout.setOnClickListener(this);
    }

        public void onClick(View v){
        switch (v.getId()){
            case R.id.logout:
                startActivity(new Intent(this, Login.class));


                break;



        }
    }
    }

