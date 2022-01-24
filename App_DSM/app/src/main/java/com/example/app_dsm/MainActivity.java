package com.example.app_dsm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//ANALISIS DE RESULTADOS GUIA 1 DSM
    //GH161659

    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.txtR);
        tv3=findViewById(R.id.txtD);
        tv4=findViewById(R.id.txtM);

    }

    //este metodo se ejecutara cuando se precione el botno sumar
    public void sumar(View view)
    {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();

        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        int suma = n1+n2;

        String resultado=String.valueOf(suma);
        tv1.setText(resultado);
        }

    public void resta(View view)
    {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();

        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        int rest = n1-n2;

        String resultado=String.valueOf(rest);
        tv2.setText(resultado);

    }

    public void divi(View view)
    {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();

        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        if (n2!=0)
        {
            int div = n1/n2;

            String resultado=String.valueOf(div);
            tv3.setText(resultado);
        }
        else tv3.setText("No puedes dividir entre 0");


    }

    public void multi(View view)
    {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();

        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);

        int mult = n1*n2;

        String resultado=String.valueOf(mult);
        tv4.setText(resultado);
    }


}
