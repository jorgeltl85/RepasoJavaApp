package com.sl2.repasojavaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int mensajesNoLeidos;
    String nombreDeContacto;
    boolean esMiAmigo;
    long numeroPrimo; //guarda numeros de 64 bits 9,2x10 a la 18


    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * @deprecated indicar por que no utilizar el metodo
     * @see MainActivity#metodoTonto() metodoTonto con que metodo se asocia
     * @param entrada
     * @return salida respuesta
     * @autor Jorge Luis Tufiño
     * @version 0.0.0.1
     *
     */
    public String clasePrueba1 (String entrada){
        String salida = "mi salida";
        return salida;
    }

    public void metodoTonto(){
    clasePrueba1("Hola");

    }
}
