package com.example.cadastromanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {


    private EditText cli_nome;
    private EditText cli_email;
    private EditText cli_phone;
    private Button enviar_cli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        enviar_cli = findViewById(R.id.enviar_cli);
        final EditText cli_nome = findViewById(R.id.cli_nome);
        final EditText cli_email = findViewById(R.id.cli_email);
        final EditText cli_phone = findViewById(R.id.cli_phone);
        enviar_cli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
                intent.putExtra("nome", cli_nome.getText().toString());
                intent.putExtra("email", cli_email.getText().toString());
                intent.putExtra("phone", cli_phone.getText().toString());
                startActivity(intent);
            }
        });

        }
    }

