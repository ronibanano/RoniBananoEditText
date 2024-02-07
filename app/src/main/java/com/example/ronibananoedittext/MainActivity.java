package com.example.ronibananoedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
    private ImageView iv1;
    private ImageView iv2;
    private ImageView iv3;

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
    int sum = 0;






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
        iv1 = findViewById(R.id.imageView1);
        iv2 = findViewById(R.id.imageView2);
        iv3 = findViewById(R.id.imageView3);
        check1 =findViewById(R.id.button1);
        check2 = findViewById(R.id.button2);
        check3 = findViewById(R.id.button3);
        restart = findViewById(R.id.button4);

        rnd1=random_number();
        rnd2=random_number();

        num1.setText(""+rnd1);
        num2.setText(""+rnd2);
        num3.setText("number");
        num4.setText("number");
        num5.setText("number");
        num6.setText("number");
    }

    public static int random_number(){
        Random random=new Random();
        return (int)(Math.random()*89+10);
    }

    public void check_answer(View view) {
        String ans1=et1.getText().toString();
        iv1.setVisibility(view.VISIBLE);
        if(Integer.parseInt(ans1)!=(rnd1+rnd2))
            iv1.setImageResource(R.drawable.img_1);
        else{
            iv1.setImageResource(R.drawable.img);
            sum++;
        }
        rnd3= rnd1+rnd2;
        rnd4 = random_number();
        num3.setText(""+rnd3);
        num4.setText(""+rnd4);

    }

    public void check_answer2(View view) {
        String ans2=et2.getText().toString();
        iv2.setVisibility(view.VISIBLE);
        if(Integer.parseInt(ans2)!=(rnd3+rnd4))
            iv2.setImageResource(R.drawable.img_1);
        else{
            iv2.setImageResource(R.drawable.img);
            sum++;
        }
        rnd5 = rnd3+rnd4;
        rnd6 = random_number();
        num5.setText(""+rnd5);
        num6.setText(""+rnd6);
    }

    public void check_answer3(View view) {
        String ans3=et3.getText().toString();
        iv3.setVisibility(view.VISIBLE);
        if(Integer.parseInt(ans3)!=(rnd5+rnd6))
            iv3.setImageResource(R.drawable.img_1);
        else{
            iv3.setImageResource(R.drawable.img);
            sum++;
        }
        double success = ((double)sum/3)*100;
        Toast.makeText(MainActivity.this,(sum+"/3"+","+success+"%"),Toast.LENGTH_LONG).show();
        sum=0;
    }
    public void restart(View view) {
        iv1.setVisibility(view.INVISIBLE);
        iv2.setVisibility(view.INVISIBLE);
        iv3.setVisibility(view.INVISIBLE);
        rnd1=random_number();
        rnd2=random_number();
        num1.setText(""+rnd1);
        num2.setText(""+rnd2);
        num3.setText("number");
        num4.setText("number");
        num5.setText("number");
        num6.setText("number");
        et1.setText(null);
        et2.setText(null);
        et3.setText(null);
    }
}