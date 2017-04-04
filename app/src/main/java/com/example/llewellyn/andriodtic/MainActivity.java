package com.example.llewellyn.andriodtic;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    public static boolean Turn=false;
    public static String Winer="";
    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;
    Button button_9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        button_1 = (Button) findViewById(R.id.button_1);
        button_2 = (Button) findViewById(R.id.button_2);
        button_3 = (Button) findViewById(R.id.button_3);
        button_4 = (Button) findViewById(R.id.button_4);
        button_5 = (Button) findViewById(R.id.button_5);
        button_6 = (Button) findViewById(R.id.button_6);
        button_7 = (Button) findViewById(R.id.button_7);
        button_8 = (Button) findViewById(R.id.button_8);
        button_9 = (Button) findViewById(R.id.button_9);


        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_1.getText()==""){
                    if (Turn==false){
                        button_1.setText("X");
                        Turn = true;
                    }
                    else if (Turn==true){
                        button_1.setText("O");
                        Turn=false;
                    }

                }
                whoWon();
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_2.getText()==""){
                    if (Turn==false){
                        button_2.setText("X");
                        Turn = true;
                    }
                    else if (Turn==true){
                        button_2.setText("O");
                        Turn=false;
                    }

                }
                whoWon();
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_3.getText()==""){
                    if (Turn==false){
                        button_3.setText("X");
                        Turn = true;
                    }
                    else if (Turn==true){
                        button_3.setText("O");
                        Turn=false;
                    }

                }
                whoWon();
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_4.getText()==""){
                    if (Turn==false){
                        button_4.setText("X");
                        Turn = true;
                    }
                    else if (Turn==true){
                        button_4.setText("O");
                        Turn=false;
                    }

                }
                whoWon();
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_5.getText()==""){
                    if (Turn==false){
                        button_5.setText("X");
                        Turn = true;
                    }
                    else if (Turn==true){
                        button_5.setText("O");
                        Turn=false;
                    }

                }
                whoWon();
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_6.getText()==""){
                    if (Turn==false){
                        button_6.setText("X");
                        Turn = true;
                    }
                    else if (Turn==true){
                        button_6.setText("O");
                        Turn=false;
                    }

                }
                whoWon();
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_7.getText()==""){
                    if (Turn==false){
                        button_7.setText("X");
                        Turn = true;
                    }
                    else if (Turn==true){
                        button_7.setText("O");
                        Turn=false;
                    }

                }
                whoWon();
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_8.getText()==""){
                    if (Turn==false){
                        button_8.setText("X");
                        Turn = true;
                    }
                    else if (Turn==true){
                        button_8.setText("O");
                        Turn=false;
                    }

                }
                whoWon();
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button_9.getText()==""){
                    if (Turn==false){
                        button_9.setText("X");
                        Turn = true;
                    }
                    else if (Turn==true){
                        button_9.setText("O");
                        Turn=false;
                    }

                }
                whoWon();
            }
        });

    }
    public void clear(){
        button_1.setText("");
        button_2.setText("");
        button_3.setText("");
        button_4.setText("");
        button_5.setText("");
        button_6.setText("");
        button_7.setText("");
        button_8.setText("");
        button_9.setText("");
        AlertDialog ad = new AlertDialog.Builder(this).create();
        ad.setCancelable(true); // This blocks the 'BACK' button
        ad.setMessage(Winer);
        ad.show();
    }
    public void whoWon(){
        if(button_1.getText()=="" || button_2.getText()=="" ||  button_3.getText()=="" || button_4.getText()=="" || button_5.getText()=="" || button_6.getText()=="" || button_7.getText()=="" || button_8.getText()=="" || button_9.getText()==""){
            Winplan();
        } else{
            Winer="It's a Draw!";
            clear();
        }
    }
    public void Winplan(){
        if(button_1.getText()=="X" && button_2.getText()=="X" && button_3.getText()=="X" ){
            Winer="X's win! Congratulations ";
            clear();

        }
        if(button_4.getText()=="X" && button_5.getText()=="X" && button_6.getText()=="X" ){
            Winer="X's win! Congratulations ";
            clear();
        }
        if(button_7.getText()=="X" && button_8.getText()=="X" && button_9.getText()=="X" ){
            Winer="X's win! Congratulations ";
            clear();
        }
        if(button_1.getText()=="X" && button_4.getText()=="X" && button_7.getText()=="X" ){
            Winer="X's win! Congratulations ";
            clear();
        }
        if(button_2.getText()=="X" && button_5.getText()=="X" && button_8.getText()=="X" ){
            Winer="X's win! Congratulations ";
            clear();
        }
        if(button_3.getText()=="X" && button_6.getText()=="X" && button_9.getText()=="X" ){
            Winer="X's win! Congratulations ";
            clear();
        }
        if(button_1.getText()=="X" && button_5.getText()=="X" && button_9.getText()=="X" ){
            Winer="X's win! Congratulations ";
            clear();
        }
        if(button_7.getText()=="X" && button_5.getText()=="X" && button_3.getText()=="X" ){
            Winer="X's win! Congratulations ";
            clear();
        }



        if(button_1.getText()=="O" && button_2.getText()=="O" && button_3.getText()=="O" ){
            Winer="O's win! Congratulations ";
            clear();
        }
        if(button_4.getText()=="O" && button_5.getText()=="O" && button_6.getText()=="O" ){
            Winer="O's win! Congratulations ";
            clear();
        }
        if(button_7.getText()=="O" && button_8.getText()=="O" && button_9.getText()=="O" ){
            Winer="O's win! Congratulations ";
            clear();
        }
        if(button_1.getText()=="O" && button_4.getText()=="O" && button_7.getText()=="O" ){
            Winer="O's win! Congratulations ";
            clear();
        }
        if(button_2.getText()=="O" && button_5.getText()=="O" && button_8.getText()=="O" ){
            Winer="O's win! Congratulations ";
            clear();
        }
        if(button_3.getText()=="O" && button_6.getText()=="O" && button_9.getText()=="O" ){
            Winer="O's win! Congratulations ";
            clear();
        }
        if(button_1.getText()=="O" && button_5.getText()=="O" && button_9.getText()=="O" ){
            Winer="O's win! Congratulations ";
            clear();
        }
        if(button_7.getText()=="O" && button_5.getText()=="O" && button_3.getText()=="O" ){
            Winer="O's win! Congratulations ";
            clear();
        }


    }




}
