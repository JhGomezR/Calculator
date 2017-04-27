package com.example.jhgomez.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv1=(TextView)findViewById(R.id.tv1);

    }

    public  void suma(View view)
    {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        double nro1=Double.parseDouble(valor1);
        double nro2=Double.parseDouble(valor2);
        double calculo= nro1 + nro2;
        String rta=String.valueOf(calculo);

        tv1.setText(getString(R.string.la_suma_es) + rta);
    }

    public  void promedio(View view)
    {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        double nro1=Double.parseDouble(valor1);
        double nro2=Double.parseDouble(valor2);
        double calculo= (nro1 + nro2)/2;
        String rta=String.valueOf(calculo);

        tv1.setText(getString(R.string.el_promedio_es) + rta);
    }

    public  void division(View view)
    {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        double nro1=Double.parseDouble(valor1);
        double nro2=Double.parseDouble(valor2);
        double calculo= nro1 / nro2;
        String rta=String.valueOf(calculo);

        tv1.setText(getString(R.string.la_division_es) + rta);
    }

    public  void mayor(View view)
    {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        double nro1=Double.parseDouble(valor1);
        double nro2=Double.parseDouble(valor2);
        double calculo= (nro1 + nro2)/2;
        String rta=String.valueOf(calculo);

        if(nro1 > nro2)
        {
            tv1.setText(getString(R.string.num_mayor) + nro1);
        }
        else if(nro1 < nro2)
        {
            tv1.setText(getString(R.string.num_mayor) + nro2);
        }
    }

    public  void menor(View view)
    {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        double nro1=Double.parseDouble(valor1);
        double nro2=Double.parseDouble(valor2);
        double calculo= (nro1 + nro2)/2;
        String rta=String.valueOf(calculo);

        if(nro1 < nro2)
        {
            tv1.setText(getString(R.string.num_menor) + nro1);
        }
        else if(nro1 > nro2)
        {
            tv1.setText(getString(R.string.num_menor) + nro2);
        }
    }

    public  void resta(View view)
    {
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        double nro1=Double.parseDouble(valor1);
        double nro2=Double.parseDouble(valor2);
        double calculo= nro1 - nro2;
        String rta=String.valueOf(calculo);

        tv1.setText(getString(R.string.la_resta_es) + rta);
    }

    public void by(View view)
    {
        Intent i = new Intent(this, By.class );
        startActivity(i);
    }

}
