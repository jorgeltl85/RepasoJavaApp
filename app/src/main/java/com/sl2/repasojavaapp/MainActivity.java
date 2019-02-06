package com.sl2.repasojavaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //tipos basicos de datos o primitivos
    int mensajesNoLeidos; //guardade 32 bits a 2 billones
    boolean esMiAmigo; //binario true o false
    long numeroPrimo; //guarda numeros de 64 bits 9,2x10 a la 18
    float pi; //guarda numeros decimales hasta 8 cifras
    double presicionPi; // guarda el doble que float de decimales
    char unaLetra; //guarda una solo caracter en asii, 243 caracteres.

    //tipos de datos referenciado
    String nombreDeContacto; // guarda un string


    private static final String TAG = "MyActivity";
    private static final String TAG1 = "MyActivity1";








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

    private int sumaUno(int entrada){
        int salida = entrada + 1;
        return salida;
    }

    //clase 38
    private void tiposBasicos(){
        mensajesNoLeidos = 7;
        esMiAmigo = true;
        numeroPrimo = 12;
        presicionPi = 0.00;
        unaLetra = 'L';
        nombreDeContacto = "Jorge Luis Tufiño";

        Log.i(TAG, "onCreate - Los mensajes no leidos son: "+mensajesNoLeidos);
        Log.d(TAG1, "onCreate - El nombre de contacto es: "+nombreDeContacto);

        sumaUno(mensajesNoLeidos);
        Log.i(TAG, "onCreate - Los mensajes no leidos sumado uno son: "+sumaUno(mensajesNoLeidos));

        ++mensajesNoLeidos;
        mensajesNoLeidos++;

        --mensajesNoLeidos;
        mensajesNoLeidos--;

        mensajesNoLeidos += mensajesNoLeidos;
        mensajesNoLeidos=+ 2;
        mensajesNoLeidos +=2;

    }

    //clase 39
    private void variables(){
        int numeroDeMensajes;
        int numeroDeMensajesSinLeer;

        numeroDeMensajes = 10;
        numeroDeMensajes++;
        numeroDeMensajes+=1;

        Log.i("numero de mensajes", "onCreate: "+numeroDeMensajes); //12

        boolean esMiAmigo1 = true;
        Log.i("amigo", "onCreate: "+esMiAmigo1);

        String nombre = "Jorgito";
        String mensaje = "Bienvenido a mi programa";

        Toast.makeText(this,"Mensaje de "+nombre,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"Mensaje: "+mensaje,Toast.LENGTH_SHORT).show();

        //contexto = nombreDeLaClase.this.
    }

    //Clase 40 La toma de decisiones
    private void tiempoDeGuerra(){

        boolean esFalso = (9 == 10); // false
        boolean esVerdad = (2+2==4); // verdad
        boolean tambienEsFalso = !(2+2==4); // verdad
        boolean negacion = (2 != 5); //true
        boolean otraComparacion = (2>=5); //es mayor que
        boolean otraComparacion1 = !(2>=5); //no es mayor que

        boolean soyRico = false;
        boolean soyMayorDeEdad = true;

        boolean entroEnlaFiesta = soyMayorDeEdad && soyRico; //Las dos deben ser ciertas
        boolean entroEnLaMejorFiesta = soyRico || soyMayorDeEdad; //almenos una de las dos debe ser cierta

    }
}
