package com.example.layouts; 
import android.os.Bundle; 
import androidx.appcompat.app.AppCompatActivity; 
public class MainActivity extends AppCompatActivity { 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
// Change layout to test 
setContentView(R.layout.activity_linear); 
// setContentView(R.layout.activity_relative); 
// setContentView(R.layout.activity_table); 
} 
}