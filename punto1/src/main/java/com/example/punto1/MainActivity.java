package com.example.punto1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.PI;


public class MainActivity extends AppCompatActivity {

    private EditText eLado1, eRadio, eBase, eLado2;
    private TextView tResultado;
    private RadioButton rCuadrado;
    private Button bCalcular;
    private String cuadrado="cuadrado", circulo, cubo, triangulo, radio, base;
    private int a, b, c, d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        eLado1 = (EditText) findViewById(R.id.eLado1);
        eRadio = (EditText) findViewById(R.id.eRadio);
        eBase = (EditText) findViewById(R.id.eBase);
        eLado2 = (EditText) findViewById(R.id.eLado2);
        tResultado = (TextView) findViewById(R.id.tResultado);
        bCalcular = (Button) findViewById(R.id.bCalcular);
        rCuadrado =  (RadioButton) findViewById(R.id.rCuadrado);
        rCuadrado.setChecked(true);
        eLado1.setEnabled(true);
        eRadio.setEnabled(false);
        eBase.setEnabled(false);
        eLado2.setEnabled(false);
        a = 1;
        eLado2.setVisibility(View.INVISIBLE);
        eBase.setVisibility(View.INVISIBLE);
        eRadio.setVisibility(View.INVISIBLE);


    }

    public void onRadioButtonClicked(View view) {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        eBase.setText("");
        eLado1.setText("");
        eLado2.setText("");
        eRadio.setText("");
        int id = view.getId();
        if (id == R.id.rCuadrado) {
            a = 1;
            eLado1.setEnabled(true);
            eRadio.setEnabled(false);
            eBase.setEnabled(false);
            eLado2.setEnabled(false);
            eLado1.setVisibility(view.VISIBLE);
            eRadio.setVisibility(view.INVISIBLE);
            eBase.setVisibility(view.INVISIBLE);
            eLado2.setVisibility(view.INVISIBLE);
        }
        if (id == R.id.rCirculo) {
            b = 1;
            eLado1.setEnabled(false);
            eRadio.setEnabled(true);
            eBase.setEnabled(false);
            eLado2.setEnabled(false);
            eRadio.setVisibility(view.VISIBLE);
            eLado1.setVisibility(view.INVISIBLE);
            eBase.setVisibility(view.INVISIBLE);
            eLado2.setVisibility(view.INVISIBLE);
        }
        if (id == R.id.rCubo) {
            c = 1;
            eLado1.setEnabled(true);
            eRadio.setEnabled(false);
            eBase.setEnabled(false);
            eLado2.setEnabled(false);
            eRadio.setVisibility(view.INVISIBLE);
            eLado1.setVisibility(view.VISIBLE);
            eBase.setVisibility(view.INVISIBLE);
            eLado2.setVisibility(view.INVISIBLE);
        }
        if (id == R.id.rTriangulo) {
            d = 1;
            eLado1.setEnabled(true);
            eRadio.setEnabled(false);
            eBase.setEnabled(true);
            eLado2.setEnabled(true);
            eRadio.setVisibility(view.INVISIBLE);
            eLado1.setVisibility(view.VISIBLE);
            eBase.setVisibility(view.VISIBLE);
            eLado2.setVisibility(view.VISIBLE);
        }
    }


    public void Calcular(View view) {

        if ((eLado1.getText().toString().equals("")) && (a == 1)) {
            Toast.makeText(getApplicationContext(), "Ingrese un valor", Toast.LENGTH_SHORT).show();
        } else if ((eRadio.getText().toString().equals("")) && (b == 1)) {
            Toast.makeText(getApplicationContext(), "Ingrese un valor", Toast.LENGTH_SHORT).show();
        } else if ((eLado1.getText().toString().equals("")) && (c == 1)) {
            Toast.makeText(getApplicationContext(), "Ingrese un valor", Toast.LENGTH_SHORT).show();
        } else if ((eBase.getText().toString().equals("") || eLado2.getText().toString().equals("") || eLado1.getText().toString().equals("")) && (d == 1)) {
            Toast.makeText(getApplicationContext(), "Ingrese los valores correctos", Toast.LENGTH_SHORT).show();
        }
        else {
            if (a == 1) {
                String lado = eLado1.getText().toString();
                Float lado1 = Float.parseFloat(lado);
                Float ar = lado1 * lado1;
                Float per = 4 * lado1;
                String area = String.valueOf(ar);
                String perimetro = String.valueOf(per);
                tResultado.setText("El area del cuadrado es: " + area + "\nEl perimetro del cuadrado es: " + per +
                        "\nEl cuadrado no tiene volumen");

            }
            if (b == 1) {
                String radio = eRadio.getText().toString();
                Float radio1 = Float.parseFloat(radio);
                double ar = PI * radio1 * radio1;
                double per = 2 * PI * radio1;
                String area = String.valueOf(ar);
                String perimetro = String.valueOf(per);
                tResultado.setText("El area del circulo es: " + area + "\nEl perimetro del circulo es: " + per +
                        "\nEl circulo no tiene volumen");
            }
            if (c == 1) {
                String lado = eLado1.getText().toString();
                Float lado1 = Float.parseFloat(lado);
                double ar = 6 * lado1 * lado1;
                double per = 12 * lado1;
                double vol = lado1 * lado1 * lado1;
                String area = String.valueOf(ar);
                String perimetro = String.valueOf(per);
                String volumen = String.valueOf(vol);
                tResultado.setText("El area del cubo es: " + area + "\nEl perimetro del cubo es: " + perimetro +
                        "\nEl volumen del cubo es: " + volumen);
            }
            if (d == 1) {
                String lado1 = eLado1.getText().toString();
                String base = eBase.getText().toString();
                String lado2 = eLado2.getText().toString();
                Float base1 = Float.parseFloat(base);
                Float lado11 = Float.parseFloat(lado1);
                Float lado22 = Float.parseFloat(lado2);
                double rp = (base1 + lado11 + lado22) / 2;
                double ar = Math.sqrt(rp * (rp - lado11) * (rp - lado22) * (rp - base1));
                double per = (base1 + lado11 + lado22);
                String area = String.valueOf(ar);
                String perimetro = String.valueOf(per);
                tResultado.setText("El area del triangulo es: " + area + "\nEl area del triangulo es: " + perimetro +
                        "\nEl circulo no tiene volumen");
            }
        }
    }
}
