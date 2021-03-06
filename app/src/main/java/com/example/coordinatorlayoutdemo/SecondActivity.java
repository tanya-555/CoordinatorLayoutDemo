package com.example.coordinatorlayoutdemo;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.coordinatorlayoutdemo.custombtn.CustomButton;
import com.google.android.material.snackbar.Snackbar;

public class SecondActivity extends AppCompatActivity {

    CustomButton btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        btn = (CustomButton) findViewById(R.id.btn);
        setListener();
    }

    private void setListener() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Button clicked!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
