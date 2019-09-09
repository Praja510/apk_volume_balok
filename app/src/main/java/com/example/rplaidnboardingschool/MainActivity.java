package com.example.rplaidnboardingschool;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //Attribut, Variable, Field

    //Access Modifier - Nama Class - nama Objek / nama variable

    private EditText etPanjang, etLebar, etTinggi;
    private Button btnHitung;
    private TextView tvHasil;


    //Method / Function

    //Syntax Error


    //Logic Error

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R. layout.activity_main);

        Log.d("SNO", MainActivity.class.getSimpleName()+" onCreate");

        //Binding View
        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        etTinggi = findViewById(R.id.etTinggi);
        btnHitung = findViewById(R.id.btnHitung);
        tvHasil =  findViewById(R.id.tvHasil);


        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

        etLebar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Ini ET Lebar", Toast.LENGTH_SHORT).show();
            }
        });
        
        tvHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Halo Fathan", Toast.LENGTH_SHORT).show();
            }
        });

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer panjang = Integer.parseInt (etPanjang.getText().toString());
                Integer lebar = Integer.parseInt(etLebar.getText().toString());
                int tinggi = Integer.parseInt(etTinggi.getText().toString());

                tvHasil.setText(String.valueOf(panjang*lebar*tinggi));

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("SNO", MainActivity.class.getSimpleName()+" onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("SNO", MainActivity.class.getSimpleName()+" onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("SNO", MainActivity.class.getSimpleName()+" onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("SNO", MainActivity.class.getSimpleName()+" onRestart");

    }


    @Override
    public void onClick(View view) {

    }
}
