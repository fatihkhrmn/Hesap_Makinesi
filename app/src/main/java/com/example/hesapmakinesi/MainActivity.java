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
    EditText BotText, result;
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
        BotText = (EditText) findViewById(R.id.edt1);
        result = (EditText) findViewById(R.id.edt2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().contains("=")){
                    BotText.setText("");
                    result.setText("");
                }
                BotText.setText(BotText.getText() + "1");
                result.setText(result.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().contains("=")){
                    BotText.setText("");
                    result.setText("");
                }
                BotText.setText(BotText.getText() + "2");
                result.setText(result.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().contains("=")){
                    BotText.setText("");
                    result.setText("");
                }
                BotText.setText(BotText.getText() + "3");
                result.setText(result.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().contains("=")){
                    BotText.setText("");
                    result.setText("");
                }
                BotText.setText(BotText.getText() + "4");
                result.setText(result.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().contains("=")){
                    BotText.setText("");
                    result.setText("");
                }
                BotText.setText(BotText.getText() + "5");
                result.setText(result.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().contains("=")){
                    BotText.setText("");
                    result.setText("");
                }
                BotText.setText(BotText.getText() + "6");
                result.setText(result.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().contains("=")){
                    BotText.setText("");
                    result.setText("");
                }
                BotText.setText(BotText.getText() + "7");
                result.setText(result.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().contains("=")){
                    BotText.setText("");
                    result.setText("");
                }
                BotText.setText(BotText.getText() + "8");
                result.setText(result.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().contains("=")){
                    BotText.setText("");
                    result.setText("");
                }
                BotText.setText(BotText.getText() + "9");
                result.setText(result.getText() + "9");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BotText.setText("");
                result.setText("");
                BotText.setText(BotText.getText() + "0");
                result.setText(result.getText() + "0");
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BotText == null) {
                    BotText.setText("");
                } else {
                    mValueOne = Float.parseFloat(BotText.getText() + "");
                    Addition = true;
                    BotText.setText(null);
                    result.setText(result.getText() + "+");
                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(BotText.getText() + "");
                Subtract = true;
                BotText.setText(null);
                result.setText(result.getText() + "-");
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(BotText.getText() + "");
                Multiplication = true;
                BotText.setText(null);
                result.setText(result.getText() + "*");
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(BotText.getText() + "");
                Division = true;
                BotText.setText(null);
                result.setText(result.getText() + "/");
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(BotText.getText() + "");
                result.setText(result.getText() + "=");

                if (Addition == true) {
                    BotText.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }
                if (Subtract == true) {
                    BotText.setText(mValueOne - mValueTwo + "");
                    Subtract = false;
                }
                if (Multiplication == true) {
                    BotText.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }
                if (Division == true) {
                    BotText.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BotText.setText("");
                result.setText("");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BotText.setText(BotText.getText() + ".");
                result.setText(result.getText() + ".");
            }
        });
    }
}
