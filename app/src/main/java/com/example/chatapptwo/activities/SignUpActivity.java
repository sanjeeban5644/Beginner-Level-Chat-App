package com.example.chatapptwo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.chatapptwo.R;
import com.example.chatapptwo.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.signinback.setOnClickListener(v-> onBackPressed());
    }
}