package com.example.task_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText arg1_13;
    EditText arg2_13;
    EditText arg3_13;
    Button button_13;
    TextView answ1_13;
    TextView answ2_13;

    EditText arg1_14;
    EditText arg2_14;
    EditText arg3_14;
    Button button_14;
    TextView answ1_14;
    TextView answ2_14;
    TextView answ3_14;
    TextView answ4_14;
    String a1_14;
    String a2_14;
    String a3_14;
    String a4_14;

    EditText arg1_15;
    Button button_15;
    TextView answ1_15;
    String a1_15;

    EditText arg1_16;
    EditText arg2_16;
    EditText arg3_16;
    EditText arg4_16;
    Button button_16;
    TextView answ1_16;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arg1_13 = findViewById(R.id.arg1_13);
        arg2_13 = findViewById(R.id.arg2_13);
        arg3_13 = findViewById(R.id.arg3_13);
        button_13 = findViewById(R.id.button_13);
        answ1_13 = findViewById(R.id.answ1_13);
        answ2_13 = findViewById(R.id.answ2_13);

        arg1_14 = findViewById(R.id.arg1_14);
        arg2_14 = findViewById(R.id.arg2_14);
        arg3_14 = findViewById(R.id.arg3_14);
        button_14 = findViewById(R.id.button_14);
        answ1_14 = findViewById(R.id.answ1_14);
        answ2_14 = findViewById(R.id.answ2_14);
        answ3_14 = findViewById(R.id.answ3_14);
        answ4_14 = findViewById(R.id.answ4_14);
        a1_14 = answ1_14.getText().toString();
        a2_14 = answ2_14.getText().toString();
        a3_14 = answ3_14.getText().toString();
        a4_14 = answ4_14.getText().toString();

        arg1_15 = findViewById(R.id.arg1_15);
        button_15 = findViewById(R.id.button_15);
        answ1_15 = findViewById(R.id.answ1_15);
        a1_15 = answ1_15.getText().toString();

        arg1_16 = findViewById(R.id.arg1_16);
        arg2_16 = findViewById(R.id.arg2_16);
        arg3_16 = findViewById(R.id.arg3_16);
        arg4_16 = findViewById(R.id.arg4_16);
        button_16 = findViewById(R.id.button_16);
        answ1_16 = findViewById(R.id.answ1_16);
    }

    public void click_13(View view) {

        int a = Integer.parseInt(arg1_13.getText().toString());
        int b = Integer.parseInt(arg2_13.getText().toString());
        int c = Integer.parseInt(arg3_13.getText().toString());

        if((a<(b+c) && c<(a+b) && b<(c+a)) || (a == b && b == c)){

            double P = a + b + c;
            double p = P / 2;
            double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));

            answ1_13.setText(answ1_13.getText().toString() + S);
            answ2_13.setText(answ2_13.getText().toString() + P);
        }
        else{
            Toast.makeText(this, "Треугольника не существует", Toast.LENGTH_SHORT).show();
        }
    }

    public void click_14(View view) {

        answ1_14.setText(a1_14);
        answ2_14.setText(a2_14);
        answ3_14.setText(a3_14);
        answ4_14.setText(a4_14);


        Double a = Double.parseDouble(arg1_14.getText().toString());
        Double b = Double.parseDouble(arg2_14.getText().toString());
        Double c = Double.parseDouble(arg3_14.getText().toString());

        if((a + b > c && a + c > b && b + c > a) && a > 0 && b > 0 && c > 0){

            List<Double> list = new ArrayList<>();
            list.add(a);
            list.add(b);
            list.add(c);

            answ1_14.setText(answ1_14.getText().toString() + Collections.max(list).toString());
            answ2_14.setText(answ2_14.getText().toString() + Collections.min(list).toString());
            Double answ3 = (a+b+c)/3;
            answ3_14.setText(answ3_14.getText().toString() + answ3.toString());
            Double answ4 = Math.cbrt(a*b*c);
            answ4_14.setText(answ4_14.getText().toString() + answ4.toString());
        }else {
            Toast.makeText(this, "Треугольника не существует", Toast.LENGTH_SHORT).show();
        }

    }

    public void click_15(View view) {
        answ1_15.setText(a1_15);

        Integer number = Integer.parseInt(arg1_15.getText().toString());
        String numString = arg1_15.getText().toString();
        if(number >= 1 && number <= 99999){

            int answer = 0;
            for (Character item:
                 numString.toCharArray()) {
                answer+=Integer.parseInt(item.toString());
            }

            answ1_15.setText(answ1_15.getText().toString() + answer);

        }else{
            Toast.makeText(this, "Число не входит в диапазон 1-99999", Toast.LENGTH_SHORT).show();
        }
    }


    public void click_16(View view) {
        Integer x1 = Integer.parseInt(arg1_16.getText().toString());
        Integer y1 = Integer.parseInt(arg2_16.getText().toString());
        Integer x2 = Integer.parseInt(arg3_16.getText().toString());
        Integer y2 = Integer.parseInt(arg4_16.getText().toString());

        double Y1 = Math.abs(y1-y2);
        double Y2 = Math.abs(x1-x2);
        if(Y2==0||Y1==0||Y2-Y1==0||Y1<2||Y2<2 && Y2<2)
            answ1_16.setText("Бьют");
        else
            answ1_16.setText("Не бьют");
    }
}