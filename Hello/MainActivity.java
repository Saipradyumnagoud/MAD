package com.example.helloprogram; 
import androidx.appcompat.app.AppCompatActivity; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.TextView; 
public class MainActivity extends AppCompatActivity { 
Button buttonHello; 
TextView textViewHello; 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_main); 
buttonHello = findViewById(R.id.buttonHello); 
textViewHello = findViewById(R.id.textViewHello); 
buttonHello.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View view) { 
textViewHello.setText("Hello World!"); 
            } 
        }); 
    } 
}