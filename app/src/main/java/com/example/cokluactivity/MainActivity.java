package com.example.cokluactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cokluactivity.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    private ActivityMainBinding binding;
    public void digerActivity(View view){
        String adiSoyadi = binding.editTextTextAdiSoyadi.getText().toString();
        String telefonNo = binding.editTextTextTelefonNo.getText().toString();
        Intent intent = new Intent(MainActivity.this,BilgiActivity.class);
        intent.putExtra("adiSoyadiKey",adiSoyadi);
        intent.putExtra("telefonNoKey",telefonNo);
        startActivity(intent);
    }
}