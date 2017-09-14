package com.example.punto4;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import static com.example.punto4.R.color.black;
import static com.example.punto4.R.color.blue;
import static com.example.punto4.R.color.brown;
import static com.example.punto4.R.color.gold;
import static com.example.punto4.R.color.gray;
import static com.example.punto4.R.color.green;
import static com.example.punto4.R.color.orange;
import static com.example.punto4.R.color.red;
import static com.example.punto4.R.color.silver;
import static com.example.punto4.R.color.violet;
import static com.example.punto4.R.color.white;
import static com.example.punto4.R.color.yellow;

public class MainActivity extends AppCompatActivity {

    private Spinner sColor1, sColor2, sColor3, sColor4;
    private TextView tValorFinal, tToleranciaFinal;
    private RelativeLayout relativeLayout1,relativeLayout2,relativeLayout3, relativeLayout4;
    private int a=0;
    private Double guardar1,guardar2, guardar3, guardar4;

    private String color1, color2, color3, color4, guardar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sColor1 = (Spinner) findViewById(R.id.sColor1);
        sColor2 = (Spinner) findViewById(R.id.sColor2);
        sColor3 = (Spinner) findViewById(R.id.sColor3);
        sColor4 = (Spinner) findViewById(R.id.sColor4);
        tValorFinal = (TextView) findViewById(R.id.tValorFinal);
        tToleranciaFinal = (TextView) findViewById(R.id.tToleranciaFinal);
        relativeLayout1 = (RelativeLayout) findViewById(R.id.relativeLayout1);
        relativeLayout2 = (RelativeLayout) findViewById(R.id.relativeLayout2);
        relativeLayout3 = (RelativeLayout) findViewById(R.id.relativeLayout3);
        relativeLayout4 = (RelativeLayout) findViewById(R.id.relativeLayout4);



        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.primer_color_array, R.layout.spinner_item);
// Specify the layout to use when the list of choices appears
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        sColor1.setAdapter(adapter1);

        sColor1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                              @Override
                                              public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                                  color1 = adapterView.getItemAtPosition(i).toString();
                                                  if(color1.toString().equals("Café")){
                                                      relativeLayout1.setBackgroundColor(getResources().getColor(brown));
                                                      guardar1=1.0;
                                                  }
                                                  else if(color1.toString().equals("Rojo")){
                                                      relativeLayout1.setBackgroundColor(getResources().getColor(red));
                                                      guardar1=2.0;
                                                  }
                                                  else if(color1.toString().equals("Naranja")){
                                                      relativeLayout1.setBackgroundColor(getResources().getColor(orange));
                                                      guardar1=3.0;
                                                  }
                                                  else if(color1.toString().equals("Amarillo")){
                                                      relativeLayout1.setBackgroundColor(getResources().getColor(yellow));
                                                      guardar1=4.0;
                                                  }
                                                  else if(color1.toString().equals("Verde")){
                                                      relativeLayout1.setBackgroundColor(getResources().getColor(green));
                                                      guardar1=5.0;
                                                  }
                                                  else if(color1.toString().equals("Azúl")){
                                                      relativeLayout1.setBackgroundColor(getResources().getColor(blue));
                                                      guardar1=6.0;
                                                  }
                                                  else if(color1.toString().equals("Violeta")){
                                                      relativeLayout1.setBackgroundColor(getResources().getColor(violet));
                                                      guardar1=7.0;
                                                  }
                                                  else if(color1.toString().equals("Gris")){
                                                      relativeLayout1.setBackgroundColor(getResources().getColor(gray));
                                                      guardar1=8.0;
                                                  }
                                                  else if(color1.toString().equals("Blanco")){
                                                      relativeLayout1.setBackgroundColor(getResources().getColor(white));
                                                      guardar1=9.0;
                                                  }
                                              }

                                              @Override
                                              public void onNothingSelected(AdapterView<?> adapterView) {
                                              }
                                          }
        );
        {
        }

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.segundo_color_array, R.layout.spinner_item);
// Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        sColor2.setAdapter(adapter2);

        sColor2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                              @Override

                                              public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                                  Double guardar3;
                                                  color2 = adapterView.getItemAtPosition(i).toString();
                                                  if(color2.toString().equals("Negro")){
                                                      relativeLayout2.setBackgroundColor(getResources().getColor(black));
                                                      guardar2=0.0;
                                                  }
                                                  else if(color2.toString().equals("Café")){
                                                      relativeLayout2.setBackgroundColor(getResources().getColor(brown));
                                                      guardar2=1.0;
                                                  }
                                                  else if(color2.toString().equals("Rojo")){
                                                      relativeLayout2.setBackgroundColor(getResources().getColor(red));
                                                      guardar2=2.0;
                                                  }
                                                  else if(color2.toString().equals("Naranja")){
                                                      relativeLayout2.setBackgroundColor(getResources().getColor(orange));
                                                      guardar2=3.0;
                                                  }
                                                  else if(color2.toString().equals("Amarillo")){
                                                      relativeLayout2.setBackgroundColor(getResources().getColor(yellow));
                                                      guardar2=4.0;
                                                  }
                                                  else if(color2.toString().equals("Verde")){
                                                      relativeLayout2.setBackgroundColor(getResources().getColor(green));
                                                      guardar2=5.0;
                                                  }
                                                  else if(color2.toString().equals("Azúl")){
                                                      relativeLayout2.setBackgroundColor(getResources().getColor(blue));
                                                      guardar2=6.0;
                                                  }
                                                  else if(color2.toString().equals("Violeta")){
                                                      relativeLayout2.setBackgroundColor(getResources().getColor(violet));
                                                      guardar2=7.0;
                                                  }
                                                  else if(color2.toString().equals("Gris")){
                                                      relativeLayout2.setBackgroundColor(getResources().getColor(gray));
                                                      guardar2=8.0;
                                                  }
                                                  else if(color2.toString().equals("Blanco")){
                                                      relativeLayout2.setBackgroundColor(getResources().getColor(white));
                                                      guardar2=9.0;
                                                  }
                                              }

                                              @Override
                                              public void onNothingSelected(AdapterView<?> adapterView) {
                                              }
                                          }
        );
        {
        }

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.tercer_color_array, R.layout.spinner_item);
// Specify the layout to use when the list of choices appears
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        sColor3.setAdapter(adapter3);

        sColor3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                              @Override
                                              public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                                  color3 = adapterView.getItemAtPosition(i).toString();
                                                  if(color3.toString().equals("Negro")){
                                                      relativeLayout3.setBackgroundColor(getResources().getColor(black));
                                                      guardar3=1.0;
                                                  }
                                                  else if(color3.toString().equals("Café")){
                                                      relativeLayout3.setBackgroundColor(getResources().getColor(brown));
                                                      guardar3=10.0;
                                                  }
                                                  else if(color3.toString().equals("Rojo")){
                                                      relativeLayout3.setBackgroundColor(getResources().getColor(red));
                                                      guardar3=Math.pow(10.0,2);
                                                  }
                                                  else if(color3.toString().equals("Naranja")){
                                                      relativeLayout3.setBackgroundColor(getResources().getColor(orange));
                                                      guardar3=Math.pow(10.0,3);
                                                  }
                                                  else if(color3.toString().equals("Amarillo")){
                                                      relativeLayout3.setBackgroundColor(getResources().getColor(yellow));
                                                      guardar3=Math.pow(10.0,4);
                                                  }
                                                  else if(color3.toString().equals("Verde")){
                                                      relativeLayout3.setBackgroundColor(getResources().getColor(green));
                                                      guardar3=Math.pow(10.0,5);
                                                  }
                                                  else if(color3.toString().equals("Azúl")){
                                                      relativeLayout3.setBackgroundColor(getResources().getColor(blue));
                                                      guardar3=Math.pow(10.0,6);
                                                  }
                                                  else if(color3.toString().equals("Violeta")){
                                                      relativeLayout3.setBackgroundColor(getResources().getColor(violet));
                                                      guardar3=Math.pow(10.0,7);
                                                  }
                                                  else if(color3.toString().equals("Gris")){
                                                      relativeLayout3.setBackgroundColor(getResources().getColor(gray));
                                                      guardar3=Math.pow(10.0,8);
                                                  }
                                                  else if(color3.toString().equals("Blanco")){
                                                      relativeLayout3.setBackgroundColor(getResources().getColor(white));
                                                      guardar3=Math.pow(10.0,9);
                                                  }
                                                  else if(color3.toString().equals("Dorado")){
                                                      relativeLayout3.setBackgroundColor(getResources().getColor(gold));
                                                      guardar3=0.1;
                                                  }
                                                  else if(color3.toString().equals("Plata")){
                                                      relativeLayout3.setBackgroundColor(getResources().getColor(silver));
                                                      guardar3=0.01;
                                                  }
                                              }

                                              @Override
                                              public void onNothingSelected(AdapterView<?> adapterView) {
                                              }
                                          }
        );
        {
        }

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.cuarto_color_array, R.layout.spinner_item);
// Specify the layout to use when the list of choices appears
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        sColor4.setAdapter(adapter4);

        sColor4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                              @Override
                                              public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                                                  color4 = adapterView.getItemAtPosition(i).toString();
                                                  if(color4.toString().equals("Plata")){
                                                      relativeLayout4.setBackgroundColor(getResources().getColor(silver));
                                                      tToleranciaFinal.setText("10%");
                                                  }
                                                  else if(color4.toString().equals("Dorado")) {
                                                      relativeLayout4.setBackgroundColor(getResources().getColor(gold));
                                                      tToleranciaFinal.setText("5%");
                                                  }
                                                  else if(color4.toString().equals("Café")) {
                                                      relativeLayout4.setBackgroundColor(getResources().getColor(brown));
                                                      tToleranciaFinal.setText("1%");
                                                  }
                                                  else if(color4.toString().equals("Rojo")) {
                                                      relativeLayout4.setBackgroundColor(getResources().getColor(red));
                                                      tToleranciaFinal.setText("2%");
                                                  }
                                                  else if(color4.toString().equals("Verde")) {
                                                      relativeLayout4.setBackgroundColor(getResources().getColor(green));
                                                      tToleranciaFinal.setText("0.5%");
                                                  }
                                              }

                                              @Override
                                              public void onNothingSelected(AdapterView<?> adapterView) {
                                              }
                                          }
        );
        {
        }

    }

    public void Calcular(View view) {
        guardar4=(guardar1*10+guardar2)*guardar3;

       if(guardar4<1000){
            tValorFinal.setText(String.valueOf(guardar4)+" Ohms");
        }
        else if(guardar4>=1000 && guardar4<1000000){
            guardar4=guardar4/1000;
            tValorFinal.setText(String.valueOf(guardar4)+" KOhms");
        }
       else if(guardar4>=1000000 && guardar4<1000000000){
            guardar4=guardar4/1000000;
            tValorFinal.setText(String.valueOf(guardar4)+" MOhms");
        }

        else{
           tValorFinal.setText(String.valueOf(guardar4));
       }

    }
}
