package com.example.vsga_mpvalidasilogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText txtuser, txtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtuser = (EditText) findViewById(R.id.et_user);
        txtpass = (EditText) findViewById(R.id.et_password);
        Button tbl = (Button) findViewById(R.id.bt_login);

        tbl.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View V) {
        if (txtuser.getText().toString().equals("Farendfal") && txtpass.getText().toString().equals("123")) {
            Intent in = new Intent(this,MainActivity.class);
            startActivity(in);
        } else Toast.makeText(Login.this, "Anda belum beruntung", Toast.LENGTH_SHORT).show();
    }
}