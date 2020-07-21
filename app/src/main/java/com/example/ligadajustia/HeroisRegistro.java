package com.example.ligadajustia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HeroisRegistro extends AppCompatActivity {

    TextView Name,txtNome, CodeName, txtco, Especie, txtes, Skills, txts, Vulnera, txtvul, NA, txtNA, Equipam, txtequi;
    Button im2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herois_registro);
        im2 = (Button) findViewById(R.id.back);
        Name = (TextView) findViewById(R.id.V1);
        Bundle extras = getIntent().getExtras();
        String paramRecebidoPelaActivity1 = extras.getString("PARAM_ACTIVITY1");
        Name.setText(paramRecebidoPelaActivity1);
        txtNome = (TextView) findViewById(R.id.txtnome);

        NA = (TextView) findViewById(R.id.V2);
        Bundle extras2 = getIntent().getExtras();
        String paramRecebidoPelaActivity2 = extras2.getString("PARAM7_ACTIVITY1");
        NA.setText(paramRecebidoPelaActivity2);
        txtNA = (TextView) findViewById(R.id.txtna);

        CodeName = (TextView) findViewById(R.id.V3);
        Bundle extras3 = getIntent().getExtras();
        String paramRecebidoPelaActivity3 = extras3.getString("PARAM2_ACTIVITY1");
        CodeName.setText(paramRecebidoPelaActivity3);
        txtco = (TextView) findViewById(R.id.txtc);

        Especie = (TextView) findViewById(R.id.V4);
        Bundle extras4 = getIntent().getExtras();
        String paramRecebidoPelaActivity4 = extras4.getString("PARAM3_ACTIVITY1");
        Especie.setText(paramRecebidoPelaActivity4);
        txtes = (TextView) findViewById(R.id.txte);

        Skills = (TextView) findViewById(R.id.V5);
        Bundle extras5 = getIntent().getExtras();
        String paramRecebidoPelaActivity5 = extras5.getString("PARAM4_ACTIVITY1");
        Skills.setText(paramRecebidoPelaActivity5);
        txts = (TextView) findViewById(R.id.txth);

        Vulnera = (TextView) findViewById(R.id.V6);
        Bundle extras6 = getIntent().getExtras();
        String paramRecebidoPelaActivity6 = extras6.getString("PARAM5_ACTIVITY1");
        Vulnera.setText(paramRecebidoPelaActivity6);
        txtvul = (TextView) findViewById(R.id.txtv);

        Equipam = (TextView) findViewById(R.id.V7);
        Bundle extras7 = getIntent().getExtras();
        String paramRecebidoPelaActivity7 = extras7.getString("PARAM6_ACTIVITY1");
        Equipam.setText(paramRecebidoPelaActivity7);
        txtequi = (TextView) findViewById(R.id.txteq);



    }

    public void back(View view) {
        im2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it2 = new Intent(HeroisRegistro.this, MainActivity.class);
                startActivity(it2);
            }
        });
    }
}
