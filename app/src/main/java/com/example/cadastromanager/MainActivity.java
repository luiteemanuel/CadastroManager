package com.example.cadastromanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bt_Cliente, bt_Empresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_Cliente = (Button) findViewById(R.id.bt_Cliente);
        bt_Empresa = (Button) findViewById(R.id.bt_Empresa);

        bt_Cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_ClienteActivity();
            }
        });

        bt_Empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt_EmpresaActivity();
            }
        });
    }

    private void bt_EmpresaActivity() {
        startActivity(new Intent(MainActivity.this, MainActivity3.class));

    }

    private void bt_ClienteActivity() {
        startActivity(new Intent(MainActivity.this, MainActivity2.class));

    }



}