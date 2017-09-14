package com.example.punto2;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.channels.Selector;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private int year, monthofYear, dayofMonth ;
    private String ciudad, sexo = "Masculino", hobbies, loggin, password, repetirpassword, correo, fechanacimiento;
    private Button bFnacimiento;
    private TextView tFecha, tInformacion;
    private Spinner sCiudad;
    private EditText eLoggin, ePassword, eRepetirPassword, eCorreo;
    private CheckBox cCine, cComer, cDeportes, cDormir;
    private static DatePickerDialog.OnDateSetListener SelectorFecha;
    private  static final int DATE_DIALOG_ID = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tFecha = (TextView) findViewById(R.id.tFecha);
        tInformacion = (TextView) findViewById(R.id.tInformacion);
        bFnacimiento = (Button) findViewById(R.id.bFnacimiento);
        sCiudad = (Spinner) findViewById(R.id.sCiudad);
        eCorreo = (EditText) findViewById(R.id.eCorreo);
        eLoggin = (EditText) findViewById(R.id.eLoggin);
        ePassword = (EditText) findViewById(R.id.ePassword);
        cCine = (CheckBox) findViewById(R.id.cCine);
        cComer = (CheckBox) findViewById(R.id.cComer);
        cDeportes = (CheckBox) findViewById(R.id.cDeportes);
        cDormir = (CheckBox) findViewById(R.id.cDormir);
        eRepetirPassword = (EditText) findViewById(R.id.eRepetirPassword);
        bFnacimiento.setOnClickListener(this);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.ciudad_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        sCiudad.setAdapter(adapter);

        sCiudad.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ciudad = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        }
        );
        {
        }

    }

    @Override
    public void onClick(View view) {
        final Calendar calendario = Calendar.getInstance();

        year = calendario.get(Calendar.YEAR);
        monthofYear = calendario.get(Calendar.MONTH);
        dayofMonth = calendario.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthofYear, int dayofMonth) {
                tFecha.setText(dayofMonth+"/"+(monthofYear+1)+"/"+year);
            }
        }
        ,dayofMonth,monthofYear,year);
        datePickerDialog.show();
    }

    public void Aceptar(View view) {
        if ((eLoggin.getText().toString().equals(""))&&(ePassword.getText().toString().equals(""))&&
                (eRepetirPassword.getText().toString().equals(""))&&(eCorreo.getText().toString().equals(""))&&
                (cCine.isChecked()==false)&&(cComer.isChecked()==false)&&(cDeportes.isChecked()==false)&&
                (cDormir.isChecked()==false)&&(dayofMonth==0)){
            Toast.makeText(getApplicationContext(), "Ingrese algun dato", Toast.LENGTH_SHORT).show();
        }
        else if((eLoggin.getText().toString().equals(""))){
            Toast.makeText(getApplicationContext(), "Ingrese Loggin", Toast.LENGTH_SHORT).show();
        }
        else if((ePassword.getText().toString().equals(""))){
            Toast.makeText(getApplicationContext(), "Ingrese Password", Toast.LENGTH_SHORT).show();
        }
        else if((eRepetirPassword.getText().toString().equals(""))){
            Toast.makeText(getApplicationContext(), "Ingrese Repetir Password", Toast.LENGTH_SHORT).show();
        }
        else if((eCorreo.getText().toString().equals(""))){
            Toast.makeText(getApplicationContext(), "Ingrese Correo", Toast.LENGTH_SHORT).show();
        }
        else if((eCorreo.getText().toString().equals(""))){
            Toast.makeText(getApplicationContext(), "Ingrese Correo", Toast.LENGTH_SHORT).show();
        }
        else if((cCine.isChecked()==false)&&(cComer.isChecked()==false)&&(cDeportes.isChecked()==false)&&
                (cDormir.isChecked()==false)){
            Toast.makeText(getApplicationContext(), "Ingrese por lo menos un Hobbie", Toast.LENGTH_SHORT).show();
        }
        else if((dayofMonth==0)){
            Toast.makeText(getApplicationContext(), "Ingrese Fecha de nacimiento", Toast.LENGTH_SHORT).show();
        }
        else if((eRepetirPassword.getText().toString()!= null)){
            if(ePassword.getText().toString().equals(eRepetirPassword.getText().toString())){
                hobbies = "";
                if(cCine.isChecked()){hobbies = hobbies + " " + "Cine";}
                if(cComer.isChecked()){hobbies = hobbies + " " + "Comer";}
                if(cDeportes.isChecked()){hobbies = hobbies + " " + "Deportes";}
                if(cDormir.isChecked()){hobbies = hobbies + " " + "Dormir";}
                loggin = eLoggin.getText().toString();
                password = ePassword.getText().toString();
                repetirpassword = eRepetirPassword.getText().toString();
                correo = eCorreo.getText().toString();
                fechanacimiento = (dayofMonth+"/"+(monthofYear+1)+"/"+year);
                tInformacion.setText("Loggin: "+loggin+"\nPassword: "+password+"\nCorreo: "+correo+"\nSexo: "+sexo+
                        "\nFecha de nacimiento: "+fechanacimiento+"\nCiudad de nacimiento: "+ciudad+
                            "\nHobbies: "+hobbies);
            }
            else {
                Toast.makeText(getApplicationContext(), "Passwords diferentes", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        // boolean checked = ((RadioButton) view).isChecked();
        int  id = view.getId();
        if(id == R.id.rMasculino){
            sexo = "Masculino";
        }
        if(id == R.id.rFemenino){
            sexo = "Femenino";
        }
    }

    public void onCheckboxClicked(View view) {
    }
}
