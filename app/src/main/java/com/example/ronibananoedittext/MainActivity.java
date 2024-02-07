package com.example.ronibananoedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView num1;
    private TextView num2;
    private TextView num3;
    private TextView num4;
    private TextView num5;
    private TextView num6;
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private Button check1;
    private Button check2;
    private Button check3;
    private Button restart;

    private int rnd1;
    private int rnd2;
    private int rnd3;
    private int rnd4;
    private int rnd5;
    private int rnd6;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 =findViewById(R.id.number1);
        num2 =findViewById(R.id.number2);
        num3 =findViewById(R.id.number3);
        num4 =findViewById(R.id.number4);
        num5 =findViewById(R.id.number5);
        num6 =findViewById(R.id.number6);
        et1 = findViewById(R.id.editText1);
        et2 = findViewById(R.id.editText2);
        et3 = findViewById(R.id.editText3);
        check1 =findViewById(R.id.button1);
        check2 = findViewById(R.id.button2);
        check3 = findViewById(R.id.button3);
        restart = findViewById(R.id.button4);

        rnd1=random_number();
        rnd2=random_number();

        num1.setText(rnd1);
        num2.setText(rnd2);
    }

    public static int random_number(){
        Random random=new Random();
        return (int)(Math.random()*89+10);
    }
}