package com.example.ligadajustia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt1, bt2, bt3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     bt1 = (Button) findViewById(R.id.btnHeroi);
     bt2 = (Button) findViewById(R.id.btnEquipamentos);
     bt3 = (Button) findViewById(R.id.btnVilao);


    }

    public void CadHeroi(View view){
            bt1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent it = new Intent(MainActivity.this, HeroisCadastro.class);
                    startActivity(it);
                }
            });
        }

    public void CadEquip(View view){
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it2 = new Intent(MainActivity.this, EquipamentosCadastro.class);
                startActivity(it2);
            }
        });
    }

    public void CadVilao(View view){
        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it3 = new Intent(MainActivity.this, ViloesCadastro.class);
                startActivity(it3);
            }
        });
    }


    }





