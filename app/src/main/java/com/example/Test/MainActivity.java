package com.example.Test;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private RadioButton round1, roll1, square1, dd1, bf1, van1, kisses1, pearls1, chili1, button4, button2, button3;
    private RadioGroup size, toppings, flavor;
    private Button button1;
    private EditText mensahe1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();

    }

    private void addListenerOnButton() {
        round1 = (RadioButton) findViewById(R.id.round);
        roll1 = (RadioButton) findViewById(R.id.roll);
        square1 = (RadioButton) findViewById(R.id.square);
        dd1 = (RadioButton) findViewById(R.id.dd);
        bf1 = (RadioButton) findViewById(R.id.bf);
        van1 = (RadioButton) findViewById(R.id.van);
        kisses1 = (RadioButton) findViewById(R.id.kisses);
        pearls1 = (RadioButton) findViewById(R.id.pearls);
        chili1 = (RadioButton) findViewById(R.id.chili);
        mensahe1 = (EditText) findViewById(R.id.mensahe);
        button1 = (Button) findViewById(R.id.button_1);
        size = (RadioGroup) findViewById(R.id.size);
        toppings = (RadioGroup) findViewById(R.id.toppings);
        flavor = (RadioGroup) findViewById(R.id.flavor);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get selected radio button from radioGroup
                int selectedId = size.getCheckedRadioButtonId();
                int selectedId1 = toppings.getCheckedRadioButtonId();
                int selectedId2 = flavor.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                button4 = (RadioButton) findViewById(selectedId);
                button2 = (RadioButton) findViewById(selectedId1);
                button3 = (RadioButton) findViewById(selectedId2);
                mensahe1= findViewById(R.id.mensahe);


                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                alertDialogBuilder.setMessage("Size:" +button4.getText().toString()+ "\n" + "Flavor:" + button2.getText().toString()+"\n"+"Toppings:"+button3.getText().toString()+"\n"+ "Message:"+mensahe1.getText().toString());
                alertDialogBuilder.setPositiveButton("close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                ;
                alertDialog.show();
              alertDialog.getWindow().getAttributes();
            }
        });

    }

}
