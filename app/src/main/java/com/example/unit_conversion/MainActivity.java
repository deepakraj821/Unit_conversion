package com.example.unit_conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button miles_to_km, km_to_miles;
    private EditText miles_edit, km_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnbButton();
    }

    private void addListenerOnbButton() {
        miles_edit = findViewById(R.id.miles_edit);
        km_edit = findViewById(R.id.km_edit);
        miles_to_km = findViewById(R.id.miles_to_km);
        km_to_miles = findViewById(R.id.km_to_miles);

        miles_to_km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String value1 = miles_edit.getText().toString();
                Log.i("deepak", "here it is"+value1);
                if(value1.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Enter Value First",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double temp =  (Double.parseDouble(value1)*1.6);
                    km_edit.getText().clear();
                    km_edit.setText(String.valueOf(String.format("%.2f",temp)));
                }
            }
        });

        km_to_miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String  value2 =km_edit.getText().toString();
                Log.i("deepak", "here it is"+value2);
                if(value2.isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Enter Value First",Toast.LENGTH_LONG).show();
                }
                else
                {
                    double temp =  (Double.parseDouble(value2)/1.6);
                    miles_edit.getText().clear();
                    miles_edit.setText(String.valueOf(String.format("%.2f",temp)));
                }
            }
        });
    }
}
