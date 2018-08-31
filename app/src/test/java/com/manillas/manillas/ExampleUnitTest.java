package com.manillas.manillas;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void cuero_martillo_oro(){
        int cant = 1, cmbMaterial = 1, cmbDije = 1, cmbTipo = 1;
        assertEquals(100,Metodos.total(cmbMaterial,cmbDije,cmbTipo,cant));
    }
    @Test
    public void cuero_martillo_oroRosado(){
        int cant = 1, cmbMaterial = 1, cmbDije = 1, cmbTipo = 2;
        assertEquals(100,Metodos.total(cmbMaterial,cmbDije,cmbTipo,cant));
    }
    @Test
    public void cuero_martillo_Plata(){
        int cant = 1, cmbMaterial = 1, cmbDije = 1, cmbTipo = 3;
        assertEquals(80,Metodos.total(cmbMaterial,cmbDije,cmbTipo,cant));
    }
    @Test
    public void cuero_martillo_Niquel(){
        int cant = 1, cmbMaterial = 1, cmbDije = 1, cmbTipo = 4;
        assertEquals(70,Metodos.total(cmbMaterial,cmbDije,cmbTipo,cant));
    }
    @Test
    public void cuero_ancla_oro(){
        int cant = 1, cmbMaterial = 1, cmbDije = 2, cmbTipo = 1;
        assertEquals(120,Metodos.total(cmbMaterial,cmbDije,cmbTipo,cant));
    }
    @Test
    public void cuero_ancla_oroRosado(){
        int cant = 1, cmbMaterial = 1, cmbDije = 2, cmbTipo = 2;
        assertEquals(120,Metodos.total(cmbMaterial,cmbDije,cmbTipo,cant));
    }
    @Test
    public void cuero_ancla_Plata(){
        int cant = 1, cmbMaterial = 1, cmbDije = 2, cmbTipo = 3;
        assertEquals(100,Metodos.total(cmbMaterial,cmbDije,cmbTipo,cant));
    }
    @Test
    public void cuero_ancla_Niquel(){
        int cant = 1, cmbMaterial = 1, cmbDije = 2, cmbTipo = 4;
        assertEquals(90,Metodos.total(cmbMaterial,cmbDije,cmbTipo,cant));
    }
    @Test
    public void cuerda_martillo_oro(){
        int cant = 1, cmbMaterial = 2, cmbDije = 1, cmbTipo = 1;
        assertEquals(90,Metodos.total(cmbMaterial,cmbDije,cmbTipo,cant));
    }
    @Test
    public void cuerda_martillo_oroRosado(){
        int cant = 1, cmbMaterial = 2, cmbDije = 1, cmbTipo = 2;
        assertEquals(90,Metodos.total(cmbMaterial,cmbDije,cmbTipo,cant));
    }
    @Test
    public void cuerda_martillo_Plata(){
        int cant = 1, cmbMaterial = 2, cmbDije = 1, cmbTipo = 3;
        assertEquals(70,Metodos.total(cmbMaterial,cmbDije,cmbTipo,cant));
    }
    @Test
    public void cuerda_martillo_Niquel(){
        int cant = 1, cmbMaterial = 2, cmbDije = 1, cmbTipo = 4;
        assertEquals(50,Metodos.total(cmbMaterial,cmbDije,cmbTipo,cant));
    }
    @Test
    public void cuerda_ancla_oro(){
        int cant = 1, cmbMaterial = 2, cmbDije = 2, cmbTipo = 1;
        assertEquals(110,Metodos.total(cmbMaterial,cmbDije,cmbTipo,cant));
    }
    @Test
    public void cuerda_ancla_oroRosado(){
        int cant = 1, cmbMaterial = 2, cmbDije = 2, cmbTipo = 2;
        assertEquals(110,Metodos.total(cmbMaterial,cmbDije,cmbTipo,cant));
    }
    @Test
    public void cuerda_ancla_Plata(){
        int cant = 1, cmbMaterial = 2, cmbDije = 2, cmbTipo = 3;
        assertEquals(90,Metodos.total(cmbMaterial,cmbDije,cmbTipo,cant));
    }
    @Test
    public void cuerda_ancla_Niquel(){
        int cant = 1, cmbMaterial = 2, cmbDije = 2, cmbTipo = 4;
        assertEquals(80,Metodos.total(cmbMaterial,cmbDije,cmbTipo,cant));
    }
    @Test
    public void dolarAPesos(){
        int dolar = 1;
        assertEquals(3200,Metodos.dolarAPeso(dolar));
    }
}