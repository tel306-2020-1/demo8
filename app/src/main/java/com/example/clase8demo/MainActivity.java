package com.example.clase8demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int i = 1;

    public void agregarFragmentoTiempoEjec(View view) {
        BlankFragment blankFragment = BlankFragment.newInstance(i);

        FragmentManager supportFragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction =
                supportFragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fragmentContainer, blankFragment, "tag"+i);
        i++;
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    public void borrarFragmento(View view) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();

        BlankFragment blankFragment =
                (BlankFragment) supportFragmentManager.findFragmentById(R.id.fragmentContainer);

        if (blankFragment != null) {
            FragmentTransaction fragmentTransaction =
                    supportFragmentManager.beginTransaction();

            fragmentTransaction.remove(blankFragment);
            fragmentTransaction.commit();
        }
    }

    public void mostrarPicker(View view) {
        DatePickerFragment datePickerFragment = new DatePickerFragment();
        datePickerFragment.show(getSupportFragmentManager(), "fecha");
    }

    public void mostrarFechaSeleccionada(int anio, int mes, int dia) {
        Log.d("infoApp", "Año: " + anio);
        Log.d("infoApp", "Mes: " + mes);
        Log.d("infoApp", "Día: " + dia);
    }
}