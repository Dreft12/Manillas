package com.manillas.manillas;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Principal extends AppCompatActivity {
    private Spinner cmbMater, cmbDije, cmbTipo;
    private EditText txtCant;
    private TextView txtValor;
    private Resources resources;
    private RadioButton dolar, pesos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        cmbMater = (Spinner) findViewById(R.id.cmbMater);
        cmbDije = (Spinner) findViewById(R.id.cmbDije);
        cmbTipo = (Spinner) findViewById(R.id.cmbTipo);
        dolar = (RadioButton) findViewById(R.id.rbtDolar);
        pesos = (RadioButton) findViewById(R.id.rbtPesos);
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
        if(opMaterial == 0){
            if(opDije == 0){
                if (opTipo == 0){
                    if (cantidad > 0){
                        int valor = Metodos.total(opMaterial, opDije, opTipo, cantidad);
                        if (dolar.isChecked()) {
                            txtValor.setText(resources.getText(R.string.valordolares) + "$" + Integer.toString(valor));
                        } else if (pesos.isChecked()) {
                            txtValor.setText(resources.getText(R.string.valorpesos) + "$" + Integer.toString(Metodos.dolarAPeso(valor)));
                        }
                    }else {
                        Toast.makeText(this, resources.getText(R.string.cantidadInvalida), Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(this, resources.getText(R.string.seleccioneTipo), Toast.LENGTH_LONG).show();
                }
            }else{
                Toast.makeText(this, resources.getText(R.string.seleccioneDije), Toast.LENGTH_LONG).show();
            }
        }else{
            Toast.makeText(this, resources.getText(R.string.seleccioneMaterial), Toast.LENGTH_LONG).show();
        }
    }

    public void limpiar(View v){
        cmbDije.setSelection(0);
        cmbMater.setSelection(0);
        cmbTipo.setSelection(0);
        txtValor.setText(resources.getText(R.string.resultado));
        txtCant.setText("");
        dolar.setChecked(true);
    }
}
