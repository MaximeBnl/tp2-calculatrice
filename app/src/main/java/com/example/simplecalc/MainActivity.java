package com.example.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText result = null;
    Button b1 = null;
    Button b2 = null;
    Button b3 = null;
    Button b4 = null;
    Button b5 = null;
    Button b6 = null;
    Button b7 = null;
    Button b8 = null;
    Button b9 = null;
    Button b10 = null;
    Button b11 = null;
    Button b12 = null;
    Button b13 = null;
    Button b14 = null;
    Button b15 = null;
    Button b16 = null;
    Button b17 = null;
    Button b18 = null;
    Button b19 = null;
    Button b20 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (EditText)findViewById(R.id.result);

        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);
        b10 = (Button)findViewById(R.id.button10);
        b11 = (Button)findViewById(R.id.button11);
        b12 = (Button)findViewById(R.id.button12);
        b13 = (Button)findViewById(R.id.button13);
        b14 = (Button)findViewById(R.id.button14);
        b15 = (Button)findViewById(R.id.button15);
        b16 = (Button)findViewById(R.id.button16);
        b17 = (Button)findViewById(R.id.button17);
        b18 = (Button)findViewById(R.id.button18);
        b19 = (Button)findViewById(R.id.button19);
        b20 = (Button)findViewById(R.id.button20);

        b1.setOnClickListener(nbr1Listener);
        b2.setOnClickListener(nbr2Listener);
        b3.setOnClickListener(nbr3Listener);
        b5.setOnClickListener(nbr4Listener);
        b6.setOnClickListener(nbr5Listener);
        b7.setOnClickListener(nbr6Listener);
        b9.setOnClickListener(nbr7Listener);
        b10.setOnClickListener(nbr8Listener);
        b11.setOnClickListener(nbr9Listener);
        b14.setOnClickListener(nbr0Listener);
        b4.setOnClickListener(addListener);
        b8.setOnClickListener(subtractListener);
        b12.setOnClickListener(multiplyListener);
        b16.setOnClickListener(divideListener);
        b17.setOnClickListener(resetListener);
        b20.setOnClickListener(resultLisetener);
    }

    private View.OnClickListener nbr1Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String text = result.getText().toString();
            if (result.getText().toString().equals("0")) result.setText(b1.getText().toString());
            else result.setText(text+b1.getText().toString());
        }
    };

    private View.OnClickListener nbr2Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String text = result.getText().toString();
            if (result.getText().toString().equals("0")) result.setText(b2.getText().toString());
            else result.setText(text+b2.getText().toString());
        }
    };

    private View.OnClickListener nbr3Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String text = result.getText().toString();
            if (result.getText().toString().equals("0")) result.setText(b3.getText().toString());
            else result.setText(text+b3.getText().toString());
        }
    };

    private View.OnClickListener nbr4Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String text = result.getText().toString();
            if (result.getText().toString().equals("0")) result.setText(b5.getText().toString());
            else result.setText(text+b5.getText().toString());
        }
    };

    private View.OnClickListener nbr5Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String text = result.getText().toString();
            if (result.getText().toString().equals("0")) result.setText(b6.getText().toString());
            else result.setText(text+b6.getText().toString());
        }
    };

    private View.OnClickListener nbr6Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String text = result.getText().toString();
            if (result.getText().toString().equals("0")) result.setText(b7.getText().toString());
            else result.setText(text+b7.getText().toString());
        }
    };

    private View.OnClickListener nbr7Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String text = result.getText().toString();
            if (result.getText().toString().equals("0")) result.setText(b9.getText().toString());
            else result.setText(text+b9.getText().toString());
        }
    };

    private View.OnClickListener nbr8Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String text = result.getText().toString();
            if (result.getText().toString().equals("0")) result.setText(b10.getText().toString());
            else result.setText(text+b10.getText().toString());
        }
    };

    private View.OnClickListener nbr9Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String text = result.getText().toString();
            if (result.getText().toString().equals("0")) result.setText(b11.getText().toString());
            else result.setText(text+b11.getText().toString());
        }
    };

    private View.OnClickListener nbr0Listener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String text = result.getText().toString();
            if (result.getText().toString().equals("0")) result.setText(b14.getText().toString());
            else result.setText(text+b14.getText().toString());
        }
    };

    private View.OnClickListener resetListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            result.setText("0");
        }
    };

    private View.OnClickListener addListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String text = result.getText().toString();
            if (!result.getText().toString().equals("0")) result.setText(text+" "+b4.getText().toString()+" ");
        }
    };

    private View.OnClickListener subtractListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String text = result.getText().toString();
            if (!result.getText().toString().equals("0")) result.setText(text+" "+b8.getText().toString()+" ");
        }
    };

    private View.OnClickListener multiplyListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String text = result.getText().toString();
            if (!result.getText().toString().equals("0")) result.setText(text+" "+b12.getText().toString()+" ");
        }
    };

    private View.OnClickListener divideListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String text = result.getText().toString();
            if (!result.getText().toString().equals("0")) result.setText(text+" "+b16.getText().toString()+" ");
        }
    };

    private View.OnClickListener resultLisetener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            String text = result.getText().toString();
            String tabText[] =text.split(" ");
            int resultFinal = 0;
            int var1 = Integer.parseInt(tabText[0]);
            int var2 = Integer.parseInt(tabText[2]);
            if (tabText[1].equals("+"))
                resultFinal = var1+var2;
            else if (tabText[1].equals("-"))
                resultFinal = var1-var2;
            else if (tabText[1].equals("*"))
                resultFinal = var1*var2;
            else if (tabText[1].equals("/")){
                if(var2==0) {
                    resultFinal = 0;
                    popUp("Impossible de diviser par 0");
                }
                else resultFinal = var1/var2;
            }
            if (!result.getText().toString().equals("0")) {
                text = "";
                result.setText(text+resultFinal);
            }

        }
    };

    public void popUp(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
