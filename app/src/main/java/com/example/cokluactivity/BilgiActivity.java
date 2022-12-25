package com.example.cokluactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.cokluactivity.databinding.ActivityBilgiBinding;


public class BilgiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBilgiBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Intent intent = getIntent();
        String bilgiAdiSoyadi = intent.getStringExtra("adiSoyadiKey");
        String bilgiTelefonNo = intent.getStringExtra("telefonNoKey");
        binding.textViewAdiSoyadi.setText(bilgiAdiSoyadi);
        binding.textViewTelefonNo.setText(bilgiTelefonNo);
    }

    private ActivityBilgiBinding binding;
}