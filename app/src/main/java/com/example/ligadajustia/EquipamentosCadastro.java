package com.example.ligadajustia;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class EquipamentosCadastro extends AppCompatActivity {

    Button btnCadequip, requip;
    EditText t1,t2;
    TextView v1,v2;
    ImageView im1;
    ImageButton im2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipamentos_cadastro);
        im2 = (ImageButton) findViewById(R.id.imgback);
        btnCadequip = (Button) findViewById(R.id.btncadequip);
        t1 = (EditText) findViewById(R.id.txtnomeequip);
        t2 = (EditText) findViewById(R.id.txtdesc);
        v1 = (TextView) findViewById(R.id.lbldesc);
        v2=(TextView) findViewById(R.id.lblnomeequip);
        im1 = (ImageView) findViewById(R.id.fundoquip);
        requip = (Button) findViewById(R.id.btnregv);

        requip.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (t1.getText().length() == 0) {
                    new AlertDialog.Builder(EquipamentosCadastro.this)
                            .setTitle("Realize o cadastro")
                            .setMessage("Realize o cadastro!!")
                            .show();
                }
                if (t2.getText().length() == 0) {
                    new AlertDialog.Builder(EquipamentosCadastro.this)
                            .setTitle("Realize o cadastro")
                            .setMessage("Realize o cadastro!!")
                            .show();
                }
                if (t1.getText().length() >=1 && t2.getText().length() >=1) {
                Intent itt = new Intent(EquipamentosCadastro.this, EquipRegistros.class);
                startActivity(itt);
                itt.putExtra("PARAM_ACTIVITY1", t1
                        .getText().toString());
                startActivityForResult(itt, 1);

                itt.putExtra("PARAM2_ACTIVITY1", t2
                        .getText().toString());
                startActivityForResult(itt, 1);


            }
        }
    });
}

    public void cad(View view){

        if (t1.getText().length() == 0) {
            new AlertDialog.Builder(EquipamentosCadastro.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (t2.getText().length() == 0) {
            new AlertDialog.Builder(EquipamentosCadastro.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();

        }
        if (t1.getText().length() >=1 && t2.getText().length() >=1 ) {
            Toast.makeText(EquipamentosCadastro.this, "Equipamento Registrado!", Toast.LENGTH_SHORT).show();


        }

    }

    public void back(View view) {
        im2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it2 = new Intent(EquipamentosCadastro.this, MainActivity.class);
                startActivity(it2);
            }
        });
    }
}

