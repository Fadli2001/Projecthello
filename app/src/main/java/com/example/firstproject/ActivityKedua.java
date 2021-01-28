package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        TextView tv  =findViewById(R.id.tv_text);
        TextView at  =findViewById(R.id.at_text);

        Bundle ambil = getIntent().getExtras();
        if(ambil==null) {
            return;
        }

        String nama = ambil.getString("nama_key");
        String alamat = ambil.getString("alamat_Key");
        if (nama != null) {
            tv.setText(nama);
        }
        if (alamat != null) {

            at.setText(alamat);
        }
    }
}