package com.example.sourabhkulkarni.prebootest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button bLogin;
    EditText etPassword, etUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername=(EditText)findViewById(R.id.etusername);
        etPassword=(EditText)findViewById(R.id.etpassword1);
        bLogin=(Button)findViewById(R.id.login);
        bLogin.setOnClickListener(this);
    }


    public void onClick(View v){
        switch (v.getId()){
            case R.id.login:



                break;


        }
    }
}
