package com.example.punto3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, ban=0;;
    private Double resultado;
    private String multi, punto, igual, mas, menos, div;
    private Button bUno, bDos, bTres, bCuatro, bCinco, bSeis, bSiete, bOcho, bNueve, bCeros, bMas, bMenos, bDiv, bBorrar;
    private Button bMulti, bPunto, bIgual;
    private TextView tResultado, tOperacion;
    boolean decimal = false;
    boolean suma = false;
    boolean resta = false;
    boolean Multi = false;
    boolean Div = false;
    Double numero[] = new Double[40];

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tOperacion = (TextView) findViewById(R.id.tOperacion);
        bBorrar = (Button) findViewById(R.id.bBorrar);
        bBorrar.setOnClickListener(this);
        bSiete = (Button) findViewById(R.id.bSiete);
        bSiete.setOnClickListener(this);
        bOcho = (Button) findViewById(R.id.bOcho);
        bOcho.setOnClickListener(this);
        bNueve = (Button) findViewById(R.id.bNueve);
        bNueve.setOnClickListener(this);
        bMas = (Button) findViewById(R.id.bMas);
        bMas.setOnClickListener(this);
        bCuatro = (Button) findViewById(R.id.bCuatro);
        bCuatro.setOnClickListener(this);
        bCinco = (Button) findViewById(R.id.bCinco);
        bCinco.setOnClickListener(this);
        bSeis = (Button) findViewById(R.id.bSeis);
        bSeis.setOnClickListener(this);
        bMenos = (Button) findViewById(R.id.bMenos);
        bMenos.setOnClickListener(this);
        bUno = (Button) findViewById(R.id.bUno);
        bUno.setOnClickListener(this);
        bDos = (Button) findViewById(R.id.bDos);
        bDos.setOnClickListener(this);
        bTres = (Button) findViewById(R.id.bTres);
        bTres.setOnClickListener(this);
        bMulti = (Button) findViewById(R.id.bMulti);
        bMulti.setOnClickListener(this);
        bPunto = (Button) findViewById(R.id.bPunto);
        bPunto.setOnClickListener(this);
        bCeros = (Button) findViewById(R.id.bCeros);
        bCeros.setOnClickListener(this);
        bIgual = (Button) findViewById(R.id.bIgual);
        bIgual.setOnClickListener(this);
        bDiv = (Button) findViewById(R.id.bDiv);
        bDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        int sel = view.getId();
        String guardar = tOperacion.getText().toString();
        try {
            switch (sel) {
                case R.id.bCeros:
                    if (ban==1){
                        guardar="";
                        ban=0;
                        decimal = false;
                    }
                    tOperacion.setText(guardar+"0");
                    break;
                case R.id.bUno:
                    if (ban==1){
                        guardar="";
                        ban=0;
                        decimal = false;
                    }
                    tOperacion.setText(guardar+"1");
                   /* tOperacion.setText(String.valueOf(ban));*/
                    break;
                case R.id.bDos:
                    if (ban==1){
                        guardar="";
                        ban=0;
                        decimal = false;
                    }
                    tOperacion.setText(guardar+"2");
                    /*tOperacion.setText(String.valueOf(ban));*/
                    break;
                case R.id.bTres:
                    if (ban==1){
                        guardar="";
                        ban=0;
                        decimal = false;
                    }
                    tOperacion.setText(guardar+"3");
                    break;
                case R.id.bCuatro:
                    if (ban==1){
                        guardar="";
                        ban=0;
                        decimal = false;
                    }
                    tOperacion.setText(guardar+"4");
                    break;
                case R.id.bCinco:
                    if (ban==1){
                        guardar="";
                        ban=0;
                        decimal = false;
                    }
                    tOperacion.setText(guardar+"5");
                    break;
                case R.id.bSeis:
                    if (ban==1){
                        guardar="";
                        ban=0;
                        decimal = false;
                    }
                    tOperacion.setText(guardar+"6");
                    break;
                case R.id.bSiete:
                    if (ban==1){
                        guardar="";
                        ban=0;
                        decimal = false;
                    }
                    tOperacion.setText(guardar+"7");
                    break;
                case R.id.bOcho:
                    if (ban==1){
                        guardar="";
                        ban=0;
                        decimal = false;
                    }
                    tOperacion.setText(guardar+"8");
                    break;
                case R.id.bNueve:
                    if (ban==1){
                        guardar="";
                        ban=0;
                        decimal = false;
                    }
                    tOperacion.setText(guardar+"9");
                    break;
                case R.id.bPunto:
                    if(decimal == false) {
                        tOperacion.setText(guardar + ".");
                        decimal = true;
                    }
                    else{ 
                        return;
                    }
                    break;
                case R.id.bMas:
                    decimal = false;
                    if(guardar.equals("")){
                    }
                    else {
                        numero[0] = Double.parseDouble(guardar);
                        tOperacion.setText("");
                        suma = true;
                    }
                    break;
                case R.id.bMenos:
                    decimal = false;
                    if(guardar.equals("")){
                    }
                    else{
                    numero[0] = Double.parseDouble(guardar);
                    tOperacion.setText("");
                    resta = true;}
                    break;
                case R.id.bMulti:
                    decimal = false;
                    if(guardar.equals("")){
                    }
                    else{
                    numero[0] = Double.parseDouble(guardar);
                    tOperacion.setText("");
                    Multi = true;}
                    break;
                case R.id.bDiv:
                    decimal = false;
                    if(guardar.equals("")){
                    }
                    else {
                    numero[0] = Double.parseDouble(guardar);
                    tOperacion.setText("");
                    Div = true;}
                    break;
                case R.id.bIgual:
                    ban=1;
                    numero[1] = Double.parseDouble(guardar);
                    if(suma==true){
                        resultado = numero[0] + numero[1];
                        tOperacion.setText(String.valueOf(resultado));
                    }
                    else if(resta==true){
                        resultado = numero[0] - numero[1];
                        tOperacion.setText(String.valueOf(resultado));
                    }
                    else if(Multi==true){
                        resultado = numero[0] * numero[1];
                        tOperacion.setText(String.valueOf(resultado));
                    }
                    else if(Div==true){
                        resultado = numero[0] / numero[1];
                        tOperacion.setText(String.valueOf(resultado));
                    }
                    suma=false;
                    resta=false;
                    Multi=false;
                    Div=false;
                    break;
                case R.id.bBorrar:
                    tOperacion.setText("");
                    decimal = false;
                    break;
            }
        }
            catch (Exception e){
                tResultado.setText("Error");
            }
        }


}

