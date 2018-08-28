package com.manillas.manillas;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Locale;

public class Principal extends AppCompatActivity {
    private Spinner cmbMater, cmbDije, cmbTipo, cmbMoneda;
    private EditText txtCant;
    private TextView txtValor;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        cmbMater = (Spinner) findViewById(R.id.cmbMater);
        cmbDije = (Spinner) findViewById(R.id.cmbDije);
        cmbTipo = (Spinner) findViewById(R.id.cmbTipo);
        cmbMoneda = (Spinner) findViewById(R.id.cmbMoneda);
        txtCant = (EditText) findViewById(R.id.txtCant);
        txtValor = (TextView) findViewById(R.id.txtValor);
        resources = this.getResources();
    }

    @SuppressLint("SetTextI18n")
    public void calcular(View v) {
        int cantidad = Integer.parseInt(txtCant.getText().toString().trim());
        int opMaterial = cmbMater.getSelectedItemPosition();
        int opDije = cmbDije.getSelectedItemPosition();
        int opTipo = cmbTipo.getSelectedItemPosition();
        int opMoneda = cmbMoneda.getSelectedItemPosition();
        int valor = Metodos.total(opMaterial,opDije,opTipo,cantidad);
        switch (opMoneda){
            case 1:{
                txtValor.setText(resources.getText(R.string.valordolares) + "$" +Integer.toString(valor));
                break;
            }
            case 2:{
                txtValor.setText(resources.getText(R.string.valorpesos) + "$" + Integer.toString(Metodos.dolarAPeso(valor)));
                break;
            }
        }

    }
}
