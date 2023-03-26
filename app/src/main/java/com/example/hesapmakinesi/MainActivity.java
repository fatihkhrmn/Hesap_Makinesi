package com.example.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual;
    EditText TopText, result;
    float mValueOne, mValueTwo;
    boolean Addition, Subtract, Multiplication, Division;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        TopText = (EditText) findViewById(R.id.edt1);
        result = (EditText) findViewById(R.id.edt2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().contains("=")){
                    TopText.setText("");
                    result.setText("");
                }
                TopText.setText(TopText.getText() + "1");
                result.setText(result.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().contains("=")){
                    TopText.setText("");
                    result.setText("");
                }
                TopText.setText(TopText.getText() + "2");
                result.setText(result.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().contains("=")){
                    TopText.setText("");
                    result.setText("");
                }
                TopText.setText(TopText.getText() + "3");
                result.setText(result.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().contains("=")){
                    TopText.setText("");
                    result.setText("");
                }
                TopText.setText(TopText.getText() + "4");
                result.setText(result.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().contains("=")){
                    TopText.setText("");
                    result.setText("");
                }
                TopText.setText(TopText.getText() + "5");
                result.setText(result.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().contains("=")){
                    TopText.setText("");
                    result.setText("");
                }
                TopText.setText(TopText.getText() + "6");
                result.setText(result.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().contains("=")){
                    TopText.setText("");
                    result.setText("");
                }
                TopText.setText(TopText.getText() + "7");
                result.setText(result.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().contains("=")){
                    TopText.setText("");
                    result.setText("");
                }
                TopText.setText(TopText.getText() + "8");
                result.setText(result.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().contains("=")){
                    TopText.setText("");
                    result.setText("");
                }
                TopText.setText(TopText.getText() + "9");
                result.setText(result.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TopText.setText("");
                result.setText("");
                TopText.setText(TopText.getText() + "0");
                result.setText(result.getText() + "0");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TopText == null) {
                    TopText.setText("");
                } else {
                    mValueOne = Float.parseFloat(TopText.getText() + "");
                    Addition = true;
                    TopText.setText(null);
                    result.setText(result.getText() + "+");
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(TopText.getText() + "");
                Subtract = true;
                TopText.setText(null);
                result.setText(result.getText() + "-");
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(TopText.getText() + "");
                Multiplication = true;
                TopText.setText(null);
                result.setText(result.getText() + "*");
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(TopText.getText() + "");
                Division = true;
                TopText.setText(null);
                result.setText(result.getText() + "/");
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(TopText.getText() + "");
                result.setText(result.getText() + "=");

                if (Addition == true) {
                    TopText.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }
                if (Subtract == true) {
                    TopText.setText(mValueOne - mValueTwo + "");
                    Subtract = false;
                }
                if (Multiplication == true) {
                    TopText.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }
                if (Division == true) {
                    TopText.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TopText.setText("");
                result.setText("");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TopText.setText(TopText.getText() + ".");
                result.setText(result.getText() + ".");
            }
        });
    }
}
