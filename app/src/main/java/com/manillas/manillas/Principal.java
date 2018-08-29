package com.manillas.manillas;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
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
    private Resources resources;
    private RadioButton dolar, pesos;
    private AlertDialog.Builder valort;

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
        resources = this.getResources();
        valort = new AlertDialog.Builder(this);
        valort.setTitle("Valor total de las manillas");
    }

    @SuppressLint("SetTextI18n")
    public void calcular(View v) {
        int opMaterial = cmbMater.getSelectedItemPosition();
        int opDije = cmbDije.getSelectedItemPosition();
        int opTipo = cmbTipo.getSelectedItemPosition();
        if (opMaterial > 0) {
            if (opDije > 0) {
                if (opTipo > 0) {
                    if (!txtCant.getText().toString().trim().isEmpty()) {
                        int cantidad = Integer.parseInt(txtCant.getText().toString().trim());
                        if (cantidad > 0) {
                            int valor = Metodos.total(opMaterial, opDije, opTipo, cantidad);
                            if (dolar.isChecked()) {
                                valort.setMessage(resources.getText(R.string.valordolares) + "$" + Integer.toString(valor));
                            } else if (pesos.isChecked()) {
                                valort.setMessage(resources.getText(R.string.valorpesos) + "$" + Integer.toString(Metodos.dolarAPeso(valor)));
                            }
                            valort.show();
                        } else {
                            Toast.makeText(this, resources.getText(R.string.cantidadInvalida), Toast.LENGTH_LONG).show();
                        }
                    } else {
                        Toast.makeText(this, resources.getText(R.string.cantidadVacia), Toast.LENGTH_LONG).show();
                    }
                } else {
                    Toast.makeText(this, resources.getText(R.string.seleccioneTipo), Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(this, resources.getText(R.string.seleccioneDije), Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(this, resources.getText(R.string.seleccioneMaterial), Toast.LENGTH_LONG).show();
        }
    }


    public void limpiar(View v) {
        cmbDije.setSelection(0);
        cmbMater.setSelection(0);
        cmbTipo.setSelection(0);
        txtCant.setText("");
        dolar.setChecked(true);
    }
}
