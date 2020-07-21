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

public class ViloesCadastro extends AppCompatActivity {
    Button btnCadastrar, btnregistro;
    EditText t1, t2, t3, t4, t5, t7, t8, t9;
    TextView v1, v2, v3, v4, v5, v6, v7;
    ImageView im1, im2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viloes_cadastro);
        btnCadastrar = (Button) findViewById(R.id.btnCadH);
        t1 = (EditText) findViewById(R.id.txtHnome2);
        t2 = (EditText) findViewById(R.id.txtCodHnome2);
        t3 = (EditText) findViewById(R.id.txtHespecie2);
        t4 = (EditText) findViewById(R.id.txtHhabili2);
        t5 = (EditText) findViewById(R.id.txtHvul2);
        v1 = (TextView) findViewById(R.id.lblnome2);
        v2 = (TextView) findViewById(R.id.lblcod2);
        v3 = (TextView) findViewById(R.id.lblespecie2);
        v4 = (TextView) findViewById(R.id.lblhabili2);
        v5 = (TextView) findViewById(R.id.lblvul2);
        im1 = (ImageView) findViewById(R.id.imagemtela2);
        v6 = (EditText) findViewById(R.id.txtn2);
        t7 = (EditText) findViewById(R.id.equipa2);
        v7 = (TextView) findViewById(R.id.txte2);
        btnregistro = (Button) findViewById(R.id.btnreg2);
        im2 = (ImageButton) findViewById(R.id.imgback3);
        t8 = (EditText) findViewById(R.id.txtescond);
        t9 = (EditText) findViewById(R.id.txtrival);

        btnregistro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (t1.getText().length() == 0) {
                    new AlertDialog.Builder(ViloesCadastro.this)
                            .setTitle("Realize o cadastro")
                            .setMessage("Realize o cadastro!!")
                            .show();
                }
                if (t2.getText().length() == 0) {
                    new AlertDialog.Builder(ViloesCadastro.this)
                            .setTitle("Realize o cadastro")
                            .setMessage("Realize o cadastro!!")
                            .show();
                }
                if (t3.getText().length() == 0) {
                    new AlertDialog.Builder(ViloesCadastro.this)
                            .setTitle("Realize o cadastro")
                            .setMessage("Realize o cadastro!!")
                            .show();
                }
                if (t4.getText().length() == 0) {
                    new AlertDialog.Builder(ViloesCadastro.this)
                            .setTitle("Realize o cadastro")
                            .setMessage("Realize o cadastro!!")
                            .show();
                }
                if (t5.getText().length() == 0) {
                    new AlertDialog.Builder(ViloesCadastro.this)
                            .setTitle("Realize o cadastro")
                            .setMessage("Realize o cadastro!!")
                            .show();
                }
                if (t7.getText().length() == 0) {
                    new AlertDialog.Builder(ViloesCadastro.this)
                            .setTitle("Realize o cadastro")
                            .setMessage("Realize o cadastro!!")
                            .show();
                }
                if (t8.getText().length() == 0) {
                    new AlertDialog.Builder(ViloesCadastro.this)
                            .setTitle("Realize o cadastro")
                            .setMessage("Realize o cadastro!!")
                            .show();
                }
                if (t9.getText().length() == 0) {
                    new AlertDialog.Builder(ViloesCadastro.this)
                            .setTitle("Realize o cadastro")
                            .setMessage("Realize o cadastro!!")
                            .show();
                }


                if (t1.getText().length() >=1 && t2.getText().length() >=1 && t3.getText().length() >=1 && t4.getText().length() >=1
                        && t5.getText().length() >=1 && t7.getText().length() >=1 && t8.getText().length() >=1 && t9.getText().length() >=1) {
                    Intent it = new Intent(ViloesCadastro.this, ViloesRegistro.class);

                    it.putExtra("PARAM_ACTIVITY2", t1
                            .getText().toString());
                    startActivityForResult(it, 1);

                    it.putExtra("PARAM2_ACTIVITY2", t2
                            .getText().toString());
                    startActivityForResult(it, 1);

                    it.putExtra("PARAM3_ACTIVITY2", t3
                            .getText().toString());
                    startActivityForResult(it, 1);

                    it.putExtra("PARAM4_ACTIVITY2", t4
                            .getText().toString());
                    startActivityForResult(it, 1);

                    it.putExtra("PARAM5_ACTIVITY2", t5
                            .getText().toString());
                    startActivityForResult(it, 1);

                    it.putExtra("PARAM6_ACTIVITY2", t7
                            .getText().toString());
                    startActivityForResult(it, 1);

                    it.putExtra("PARAM7_ACTIVITY2", t8
                            .getText().toString());
                    startActivityForResult(it, 1);

                    it.putExtra("PARAM8_ACTIVITY2", t9
                            .getText().toString());
                    startActivityForResult(it, 1);

                    it.putExtra("PARAM9_ACTIVITY2", v6
                            .getText().toString());
                    startActivityForResult(it, 1);

                }

            }
        });


    }

    public void cad(View view){



        if (t1.getText().length() == 0) {
            new AlertDialog.Builder(ViloesCadastro.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (t2.getText().length() == 0) {
            new AlertDialog.Builder(ViloesCadastro.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (t3.getText().length() == 0) {
            new AlertDialog.Builder(ViloesCadastro.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (t4.getText().length() == 0) {
            new AlertDialog.Builder(ViloesCadastro.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (t5.getText().length() == 0) {
            new AlertDialog.Builder(ViloesCadastro.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (t7.getText().length() == 0) {
            new AlertDialog.Builder(ViloesCadastro.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }

        if (t8.getText().length() == 0) {
            new AlertDialog.Builder(ViloesCadastro.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }

        if (t9.getText().length() == 0) {
            new AlertDialog.Builder(ViloesCadastro.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (t1.getText().length() >=1 && t2.getText().length() >=1 && t3.getText().length() >=1 && t4.getText().length() >=1
                && t5.getText().length() >=1 && t7.getText().length() >=1 && t8.getText().length() >=1 && t9.getText().length() >=1) {
            Toast.makeText(ViloesCadastro.this, "Vilão Registrado!", Toast.LENGTH_SHORT).show();


        }

    }

    public void back(View view) {
        im2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it2 = new Intent(ViloesCadastro.this, MainActivity.class);
                startActivity(it2);
            }
        });
    }



}
