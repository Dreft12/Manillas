package com.manillas.manillas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class Principal extends AppCompatActivity {
    private Spinner cmbMater, cmbDije, cmbTipo, cmbMoneda;
    private EditText txtCant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        cmbMater = (Spinner) findViewById(R.id.cmbMater);
        cmbDije = (Spinner) findViewById(R.id.cmbDije);
        cmbTipo = (Spinner) findViewById(R.id.cmbTipo);
        cmbMoneda = (Spinner) findViewById(R.id.cmbMoneda);
        txtCant = (EditText) findViewById(R.id.txtCant);
    }

    public void calcular(View v){
        int valor = 0;
        int cantidad = Integer.parseInt(txtCant.getText().toString().trim());
        switch (cmbMater.getSelectedItemPosition()){
            case 1:{
                switch (cmbDije.getSelectedItemPosition()){
                    case 1:{
                        switch (cmbTipo.getSelectedItemPosition()){
                            case 1:{

                            }
                        }
                    }
                }
            }
        }
        switch (cmbMoneda.getSelectedItemPosition()){
            case 1:{

            }
        }
    }


}
