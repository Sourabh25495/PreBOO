package com.example.sourabhkulkarni.prebootest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button bLogin;
    EditText etPassword, etUsername;
    TextView RegisterLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername=(EditText)findViewById(R.id.etusername);
        etPassword=(EditText)findViewById(R.id.etpassword1);
        bLogin=(Button)findViewById(R.id.login);
        RegisterLink=(TextView)findViewById(R.id.tvRegLink);
        bLogin.setOnClickListener(this);
        RegisterLink.setOnClickListener(this);
    }



    public void onClick(View v){
        switch (v.getId()){
            case R.id.login:



                break;
            case R.id.tvRegLink:



                break;


        }
    }
}
