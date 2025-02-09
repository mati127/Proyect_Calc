package com.example.calc_proyect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    double in1 = 0,i2=0;
    double operacion=0;
    String operador="",aux="";
    TextView edittext1, viewcalc;
    boolean Add, Sub, Multiply, Divide, Remainder, deci;
    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9,
            button_Add, button_Sub, button_Mul, button_Div, button_Equ, button_Del, button_Dot, button_Remainder,
            button_change, button_deleteone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Encontrar por el Id los componentes

        button_0 = (Button) findViewById(R.id.Btn0);
        button_1 = (Button) findViewById(R.id.Btn1);
        button_2 = (Button) findViewById(R.id.Btn2);
        button_3 = (Button) findViewById(R.id.Btn3);
        button_4 = (Button) findViewById(R.id.Btn4);
        button_5 = (Button) findViewById(R.id.Btn5);
        button_6 = (Button) findViewById(R.id.Btn6);
        button_7 = (Button) findViewById(R.id.Btn7);
        button_8 = (Button) findViewById(R.id.Btn8);
        button_9 = (Button) findViewById(R.id.Btn9);
        button_Dot = (Button) findViewById(R.id.BtnPunto);
        button_Add = (Button) findViewById(R.id.BtnSumar);
        button_Sub = (Button) findViewById(R.id.BtnResta);
        button_Mul = (Button) findViewById(R.id.BtnMulti);
        button_Div = (Button) findViewById(R.id.BtnDividir);
        button_Remainder = (Button) findViewById(R.id.BtnEliminarTodo);
        button_Del = (Button) findViewById(R.id.BtnEliminar);
        button_Equ = (Button) findViewById(R.id.BtnIgual);
        button_change=(Button) findViewById(R.id.BtnCambiarSimbolo);

        edittext1 = (TextView) findViewById(R.id.TexViewResultado);
        viewcalc =(TextView) findViewById(R.id.TextViewVistaCalculo);
        button_deleteone =(Button) findViewById(R.id.BtnEliminar);

        //Acción de los botones ============================================================================================
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux= String.valueOf(edittext1.getText());
                if (aux.contentEquals("0") ||aux.contentEquals("") ) {
                    edittext1.setText("");
                    edittext1.setText(edittext1.getText() + "0");
                    in1=Double.parseDouble((String) edittext1.getText());
                }else {
                    edittext1.setText(edittext1.getText() + "0");
                    in1=Double.parseDouble((String) edittext1.getText());
                }
            }
        });
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux= String.valueOf(edittext1.getText());
                if (aux.contentEquals("0") ||aux.contentEquals("") ) {
                    edittext1.setText("");
                    edittext1.setText(edittext1.getText() + "1");
                    in1=Double.parseDouble((String) edittext1.getText());
                }else {
                    edittext1.setText(edittext1.getText() + "1");
                    in1=Double.parseDouble((String) edittext1.getText());
                }

            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux= String.valueOf(edittext1.getText());
                if (aux.contentEquals("0") ||aux.contentEquals("") ) {
                    edittext1.setText("");
                    edittext1.setText(edittext1.getText() + "2");
                    in1=Double.parseDouble((String) edittext1.getText());
                }else {
                    edittext1.setText(edittext1.getText() + "2");
                    in1 = Double.parseDouble((String) edittext1.getText());
                }
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux= String.valueOf(edittext1.getText());
                if (aux.contentEquals("0") ||aux.contentEquals("") ) {
                    edittext1.setText("");
                    edittext1.setText(edittext1.getText() + "3");
                    in1=Double.parseDouble((String) edittext1.getText());
                }else {
                edittext1.setText(edittext1.getText() + "3");
                in1=Double.parseDouble((String) edittext1.getText());
                }
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux= String.valueOf(edittext1.getText());
                if (aux.contentEquals("0") ||aux.contentEquals("") ) {
                    edittext1.setText("");
                    edittext1.setText(edittext1.getText() + "4");
                    in1=Double.parseDouble((String) edittext1.getText());
                }else {
                    edittext1.setText(edittext1.getText() + "4");
                    in1 = Double.parseDouble((String) edittext1.getText());
                }
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux= String.valueOf(edittext1.getText());
                if (aux.contentEquals("0") ||aux.contentEquals("") ) {
                    edittext1.setText("");
                    edittext1.setText(edittext1.getText() + "5");
                    in1=Double.parseDouble((String) edittext1.getText());
                }else {
                    edittext1.setText(edittext1.getText() + "5");
                    in1 = Double.parseDouble((String) edittext1.getText());
                }
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux= String.valueOf(edittext1.getText());
                if (aux.contentEquals("0") ||aux.contentEquals("") ) {
                    edittext1.setText("");
                    edittext1.setText(edittext1.getText() + "6");
                    in1=Double.parseDouble((String) edittext1.getText());
                }else {
                    edittext1.setText(edittext1.getText() + "6");
                    in1 = Double.parseDouble((String) edittext1.getText());
                }
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux= String.valueOf(edittext1.getText());
                if (aux.contentEquals("0") ||aux.contentEquals("") ) {
                    edittext1.setText("");
                    edittext1.setText(edittext1.getText() + "7");
                    in1=Double.parseDouble((String) edittext1.getText());
                }else {
                    edittext1.setText(edittext1.getText() + "7");
                    in1 = Double.parseDouble((String) edittext1.getText());
                }
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux= String.valueOf(edittext1.getText());
                if (aux.contentEquals("0") ||aux.contentEquals("") ) {
                    edittext1.setText("");
                    edittext1.setText(edittext1.getText() + "8");
                    in1=Double.parseDouble((String) edittext1.getText());
                }else {
                    edittext1.setText(edittext1.getText() + "8");
                    in1 = Double.parseDouble((String) edittext1.getText());
                }
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux= String.valueOf(edittext1.getText());
                if (aux.contentEquals("0") ||aux.contentEquals("") ) {
                    edittext1.setText("");
                    edittext1.setText(edittext1.getText() + "9");
                    in1=Double.parseDouble((String) edittext1.getText());
                }else {
                    edittext1.setText(edittext1.getText() + "9");
                    in1 = Double.parseDouble((String) edittext1.getText());
                }
            }
        });
        //Botones de operaciones =================================================================================================


        button_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewcalc.setText(edittext1.getText() + " +");
                edittext1.setText("");
                i2=in1;
                operador="+";
            }
        });
        button_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewcalc.setText(edittext1.getText() + " -");
                edittext1.setText("");
                i2=in1;
                operador="-";
            }
        });
        button_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewcalc.setText(edittext1.getText() + " x");
                edittext1.setText("");
                i2=in1;
                operador="x";
            }
        });

        button_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewcalc.setText(edittext1.getText() + " /");
                edittext1.setText("");
                i2=in1;
                operador="/";
            }
        });
        button_Remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText("0");
                viewcalc.setText("");
                operador="";
                in1=0;
                i2=0;
            }
        });

        button_Equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (operador){
                    case "+":
                        operacion = in1 + i2 ;
                        edittext1.setText(operacion+"");
                        operador="";
                        break;
                    case "-":
                        operacion= in1 - i2 ;
                        edittext1.setText(operacion+"");
                        operador="";
                        break;
                    case "x":
                        operacion= in1 * i2;
                        edittext1.setText(operacion+"");
                        operador="";
                        break;
                    case "/":
                        operacion= in1 / i2;
                        edittext1.setText(operacion+"");
                        operador="";
                        break;
                    case "":
                        edittext1.setText("0");
                        break;
                }
            }
        });

        button_Del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText("");
                in1 = 0.0;
                i2 = 0.0;
            }
        });

        button_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux= String.valueOf(edittext1.getText());
                if (aux.contentEquals("0") || aux.contentEquals("") ) {
                    edittext1.setText("");
                    edittext1.setText(edittext1.getText() + "0.");
                    in1=Double.parseDouble((String) edittext1.getText());
                }else {
                    edittext1.setText(edittext1.getText() + ".");
                    in1 = Double.parseDouble((String) edittext1.getText());
                }
            }
        });

        button_deleteone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aux= String.valueOf(edittext1.getText());
                if (aux.contentEquals("0")){
                    edittext1.setText("0");
                }else{
                   char[] DeleteOne = new char[Integer.parseInt(aux)];
                }
            }
        });

    }
}