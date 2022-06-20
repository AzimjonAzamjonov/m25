package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView resultTxt;
    Button  btnClear, btnBacspace, btnMinus, btnPlus, btnDot,btnDel, btnMultiply, btn0;
    String curr= "";
    String res= "";

    boolean operator_inserted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        init();
    }
    public void init(){
        editText= findViewById(R.id.edit1);
        resultTxt=findViewById(R.id.result);
        btnClear=findViewById(R.id.clear);
        btnBacspace=findViewById(R.id.bacspace);
        btnMinus=findViewById(R.id.ayirish);
        btnPlus=findViewById(R.id.qoshish);
        btnDot=findViewById(R.id.nuqta);
        btnDel=findViewById(R.id.bolish);
        btnMultiply=findViewById(R.id.kopaytirish);
        btn0=findViewById(R.id.nol);
    }
    public void onPressed(View view){
        Button btn=(Button) view;
        String txt=(String) btn.getText();

        switch (btn.getId()){
            case R.id.clear:
                curr="";
                resultTxt.setText("");
                operator_inserted=false;
                break;
            case R.id.bacspace:
                if (!curr.isEmpty()){
                    char a =curr.charAt(curr.length());
                    if (a=='-'||a=='*'||a=='+'||a=='-'){
                        operator_inserted=false;
                    }


                }
        }
    }
}