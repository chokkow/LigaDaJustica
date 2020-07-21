package com.example.ligadajustia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ViloesRegistro extends AppCompatActivity {

    TextView Name,txtNome, CodeName, txtco, Especie, txtes, Skills, txts, Vulnera, txtvul, NA, txtNA, Equipam, txtequi;
    Button im22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viloes_registro);
        im22 = (Button) findViewById(R.id.back);
        Name = (TextView) findViewById(R.id.o1);
        Bundle extras1 = getIntent().getExtras();
        String paramRecebidoPelaActivity11 = extras1.getString("PARAM_ACTIVITY2");
        Name.setText(paramRecebidoPelaActivity11);
        txtNome = (TextView) findViewById(R.id.txtnome);

        NA = (TextView) findViewById(R.id.o2);
        Bundle extras21 = getIntent().getExtras();
        String paramRecebidoPelaActivity21 = extras21.getString("PARAM9_ACTIVITY2");
        NA.setText(paramRecebidoPelaActivity21);
        txtNA = (TextView) findViewById(R.id.txtna);

        CodeName = (TextView) findViewById(R.id.o3);
        Bundle extras31 = getIntent().getExtras();
        String paramRecebidoPelaActivity31 = extras31.getString("PARAM2_ACTIVITY2");
        CodeName.setText(paramRecebidoPelaActivity31);
        txtco = (TextView) findViewById(R.id.txtc);

        Especie = (TextView) findViewById(R.id.o4);
        Bundle extras41 = getIntent().getExtras();
        String paramRecebidoPelaActivity41 = extras41.getString("PARAM3_ACTIVITY2");
        Especie.setText(paramRecebidoPelaActivity41);
        txtes = (TextView) findViewById(R.id.txte);

        Skills = (TextView) findViewById(R.id.o5);
        Bundle extras51 = getIntent().getExtras();
        String paramRecebidoPelaActivity51 = extras51.getString("PARAM4_ACTIVITY2");
        Skills.setText(paramRecebidoPelaActivity51);
        txts = (TextView) findViewById(R.id.txth);

        Vulnera = (TextView) findViewById(R.id.o6);
        Bundle extras61 = getIntent().getExtras();
        String paramRecebidoPelaActivity61 = extras61.getString("PARAM5_ACTIVITY2");
        Vulnera.setText(paramRecebidoPelaActivity61);
        txtvul = (TextView) findViewById(R.id.txtv);

        Equipam = (TextView) findViewById(R.id.o7);
        Bundle extras71 = getIntent().getExtras();
        String paramRecebidoPelaActivity71 = extras71.getString("PARAM6_ACTIVITY2");
        Equipam.setText(paramRecebidoPelaActivity71);
        txtequi = (TextView) findViewById(R.id.txteq);

        Equipam = (TextView) findViewById(R.id.o8);
        Bundle extras81 = getIntent().getExtras();
        String paramRecebidoPelaActivity81 = extras81.getString("PARAM7_ACTIVITY2");
        Equipam.setText(paramRecebidoPelaActivity81);
        txtequi = (TextView) findViewById(R.id.txteq);

        Equipam = (TextView) findViewById(R.id.o9);
        Bundle extras91 = getIntent().getExtras();
        String paramRecebidoPelaActivity91 = extras91.getString("PARAM8_ACTIVITY2");
        Equipam.setText(paramRecebidoPelaActivity91);
        txtequi = (TextView) findViewById(R.id.txteq);



    }

    public void backk(View view) {
        im22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it4 = new Intent(ViloesRegistro.this, MainActivity.class);
                startActivity(it4);
            }
        });
    }
}
