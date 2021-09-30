package com.example.cadastromanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TextView verNome = findViewById(R.id.verNome);
        TextView verPhone = findViewById(R.id.verPhone);
        TextView verEmail = findViewById(R.id.verEmail);

        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");
        String email = intent.getStringExtra("email");
        String phone = intent.getStringExtra("phone");
        verNome.setText("Nome: "+nome);
        verEmail.setText("email: "+email);
        verPhone.setText("phone: "+phone);







    }
}


