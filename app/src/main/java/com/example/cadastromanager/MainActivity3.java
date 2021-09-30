package com.example.cadastromanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {


    private EditText emp_nome;
    private EditText emp_email;
    private EditText emp_phone;
    private Button enviar_emp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        enviar_emp = findViewById(R.id.enviar_emp);
        final EditText emp_nome = findViewById(R.id.emp_nome);
        final EditText emp_email = findViewById(R.id.emp_email);
        final EditText emp_phone = findViewById(R.id.emp_phone);
        enviar_emp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
                intent.putExtra("nome", emp_nome.getText().toString());
                intent.putExtra("email", emp_email.getText().toString());
                intent.putExtra("phone", emp_phone.getText().toString());
                startActivity(intent);
            }
        });

    }
}