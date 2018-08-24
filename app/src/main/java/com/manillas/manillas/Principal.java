package com.manillas.manillas;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class Principal extends AppCompatActivity {
    private Spinner cmbMater, cmbDije, cmbTipo, cmbMoneda;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        cmbMater = (Spinner) findViewById(R.id.cmbMater);
        cmbDije = (Spinner) findViewById(R.id.cmbDije);
        cmbTipo = (Spinner) findViewById(R.id.cmbTipo);
        cmbMoneda = (Spinner) findViewById(R.id.cmbMoneda);
        resources = this.getResources();
    }
}
