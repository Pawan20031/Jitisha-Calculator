package com.example.jitishacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button Initialisation
        Button button1=findViewById(R.id.button);
        Button button2=findViewById(R.id.button2);
        Button button3=findViewById(R.id.button3);
        Button button4=findViewById(R.id.button4);

//        Edittext Initialisation
        EditText editText1=findViewById(R.id.editTextNumber);
        EditText editText2=findViewById(R.id.editTextNumber2);

//        Textview Initialisation
        TextView textView=findViewById(R.id.textView);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editText1.getText().toString();
                int k=Integer.parseInt(s);
                String p=editText2.getText().toString();
                int l=Integer.parseInt(p);
                int add=k+l;
                textView.setText("The Summation of given Numbers  : "+add);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editText1.getText().toString();
                int k=Integer.parseInt(s);
                String p=editText2.getText().toString();
                int l=Integer.parseInt(p);
                int sub=k-l;
                textView.setText("The Subtraction of given Numbers  : "+sub);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editText1.getText().toString();
                int k=Integer.parseInt(s);
                String p=editText2.getText().toString();
                int l=Integer.parseInt(p);
                int mul=k*l;
                textView.setText("The Multiplication of given Numbers  : "+mul);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editText1.getText().toString();
                int k=Integer.parseInt(s);
                String p=editText2.getText().toString();
                int l=Integer.parseInt(p);
                if(l==0){
                    Toast.makeText(MainActivity.this, "Can't divide by zero", Toast.LENGTH_SHORT).show();
                }
                else{
                    int add=k/l;
                    textView.setText("The Division of given Numbers  : "+add);
                }

            }
        });
    }
}