package com.example.ligadajustia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EquipRegistros extends AppCompatActivity {
    TextView b1, b11, b2, b22;
    Button btndelete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equip_registros);

        b1 = (TextView) findViewById(R.id.n1);
        b11 = (TextView) findViewById(R.id.a1);
        b2 = (TextView) findViewById(R.id.n2);
        b22 = (TextView) findViewById(R.id.a2);
        btndelete = (Button) findViewById(R.id.delete);

        b1 = (TextView) findViewById(R.id.n1);
        Bundle extras = getIntent().getExtras();
        String paramRecebidoPelaActivity1 = extras.getString("PARAM_ACTIVITY1");
        b1.setText(paramRecebidoPelaActivity1);
        b11 = (TextView) findViewById(R.id.a1);

        b2 = (TextView) findViewById(R.id.n2);
        Bundle extras2 = getIntent().getExtras();
        String paramRecebidoPelaActivity2 = extras2.getString("PARAM2_ACTIVITY1");
        b2.setText(paramRecebidoPelaActivity2);
        b22 = (TextView) findViewById(R.id.a2);

    }

    public void apagar(View view) {
        btndelete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(EquipRegistros.this, MainActivity.class);
                startActivity(it);
            }
        });

    }
}
