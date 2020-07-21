package com.example.ligadajustia;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class HeroisCadastro extends AppCompatActivity {

    Button btnCadastrar, btnregistro;
    EditText t1, t2, t3, t4, t5, t7;
    TextView v1, v2, v3, v4, v5, v6, v7;
    ImageView im1, im2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herois_cadastro);

        final Spinner mySpinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(HeroisCadastro.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.permissoes));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        btnCadastrar = (Button) findViewById(R.id.btnCadH);
        t1 = (EditText) findViewById(R.id.txtHnome);
        t2 = (EditText) findViewById(R.id.txtCodHnome);
        t3 = (EditText) findViewById(R.id.txtHespecie);
        t4 = (EditText) findViewById(R.id.txtHhabili);
        t5 = (EditText) findViewById(R.id.txtHvul);
        v1 = (TextView) findViewById(R.id.lblnome);
        v2 = (TextView) findViewById(R.id.lblcod);
        v3 = (TextView) findViewById(R.id.lblespecie);
        v4 = (TextView) findViewById(R.id.lblhabili);
        v5 = (TextView) findViewById(R.id.lblvul);
        im1 = (ImageView) findViewById(R.id.imagemtela);
        v6 = (TextView) findViewById(R.id.txtn);
        t7 = (EditText) findViewById(R.id.equipa);
        v7 = (TextView) findViewById(R.id.txte);
        btnregistro = (Button) findViewById(R.id.btnreg);
        im2 = (ImageButton) findViewById(R.id.imgback);

        btnregistro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (t1.getText().length() == 0) {
                    new AlertDialog.Builder(HeroisCadastro.this)
                            .setTitle("Realize o cadastro")
                            .setMessage("Realize o cadastro!!")
                            .show();
                }
                if (t2.getText().length() == 0) {
                    new AlertDialog.Builder(HeroisCadastro.this)
                            .setTitle("Realize o cadastro")
                            .setMessage("Realize o cadastro!!")
                            .show();
                }
                if (t3.getText().length() == 0) {
                    new AlertDialog.Builder(HeroisCadastro.this)
                            .setTitle("Realize o cadastro")
                            .setMessage("Realize o cadastro!!")
                            .show();
                }
                if (t4.getText().length() == 0) {
                    new AlertDialog.Builder(HeroisCadastro.this)
                            .setTitle("Realize o cadastro")
                            .setMessage("Realize o cadastro!!")
                            .show();
                }
                if (t5.getText().length() == 0) {
                    new AlertDialog.Builder(HeroisCadastro.this)
                            .setTitle("Realize o cadastro")
                            .setMessage("Realize o cadastro!!")
                            .show();
                }
                if (t7.getText().length() == 0) {
                    new AlertDialog.Builder(HeroisCadastro.this)
                            .setTitle("Realize o cadastro")
                            .setMessage("Realize o cadastro!!")
                            .show();
                }

              if (t1.getText().length() >=1 && t2.getText().length() >=1 && t3.getText().length() >=1 && t4.getText().length() >=1
                      && t5.getText().length() >=1 && t7.getText().length() >=1) {
                    Intent it = new Intent(HeroisCadastro.this, HeroisRegistro.class);

                    it.putExtra("PARAM_ACTIVITY1", t1
                            .getText().toString());
                    startActivityForResult(it, 1);

                    it.putExtra("PARAM2_ACTIVITY1", t2
                            .getText().toString());
                    startActivityForResult(it, 1);

                    it.putExtra("PARAM3_ACTIVITY1", t3
                            .getText().toString());
                    startActivityForResult(it, 1);

                    it.putExtra("PARAM4_ACTIVITY1", t4
                            .getText().toString());
                    startActivityForResult(it, 1);

                    it.putExtra("PARAM5_ACTIVITY1", t5
                            .getText().toString());
                    startActivityForResult(it, 1);

                    it.putExtra("PARAM6_ACTIVITY1", t7
                            .getText().toString());
                    startActivityForResult(it, 1);

                    it.putExtra("PARAM7_ACTIVITY1", mySpinner
                            .getSelectedItem().toString());
                    startActivityForResult(it, 1);

                }

            }
        });


    }

    public void cad(View view){



        if (t1.getText().length() == 0) {
            new AlertDialog.Builder(HeroisCadastro.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (t2.getText().length() == 0) {
            new AlertDialog.Builder(HeroisCadastro.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (t3.getText().length() == 0) {
            new AlertDialog.Builder(HeroisCadastro.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (t4.getText().length() == 0) {
            new AlertDialog.Builder(HeroisCadastro.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (t5.getText().length() == 0) {
            new AlertDialog.Builder(HeroisCadastro.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (t7.getText().length() == 0) {
            new AlertDialog.Builder(HeroisCadastro.this)
                    .setTitle("Campos vazios")
                    .setMessage("Preencha todos os campos!!")
                    .show();
        }
        if (t1.getText().length() >=1 && t2.getText().length() >=1 && t3.getText().length() >=1 && t4.getText().length() >=1
                && t5.getText().length() >=1 && t7.getText().length() >=1) {
            Toast.makeText(HeroisCadastro.this, "Herói Registrado!", Toast.LENGTH_SHORT).show();


        }

        }

    public void back(View view) {
        im2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it2 = new Intent(HeroisCadastro.this, MainActivity.class);
                startActivity(it2);
            }
        });
    }



    }




