package com.example.fishapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.makeramen.roundedimageview.RoundedImageView;

public class SeluruhKategoriActivity extends AppCompatActivity {
    private RoundedImageView btnKategoriIkanIndo, btnKategoriIkanTeritorial, btnKategoriIkanPopuler,btnKategoriIkanPemula, btnKategoriIkanLuar, btnKategoriIkanPredator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seluruh_kategori);
        setTitle("Pilih Kategori");

        //TODO

        btnKategoriIkanIndo = findViewById(R.id.btnKategoriIndo);
        btnKategoriIkanIndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeluruhKategoriActivity.this, KategoriActivity.class);
                intent.putExtra("kategori", "IkanIndo");
                startActivity(intent);
            }
        });

        btnKategoriIkanPemula = findViewById(R.id.btnKategoriPemula);
        btnKategoriIkanPemula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeluruhKategoriActivity.this, KategoriActivity.class);
                intent.putExtra("kategori", "IkanPemula");
                startActivity(intent);
            }
        });

        btnKategoriIkanPopuler = findViewById(R.id.btnKategoriPopuler);
        btnKategoriIkanPopuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeluruhKategoriActivity.this, KategoriActivity.class);
                intent.putExtra("kategori", "IkanPopuler");
                startActivity(intent);
            }
        });

        btnKategoriIkanLuar = findViewById(R.id.btnKategoriIkanLuar);
        btnKategoriIkanLuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeluruhKategoriActivity.this, KategoriActivity.class);
                intent.putExtra("kategori", "IkanLuar");
                startActivity(intent);
            }
        });

        btnKategoriIkanTeritorial = findViewById(R.id.btnKategoriTeritorial);
        btnKategoriIkanTeritorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeluruhKategoriActivity.this, KategoriActivity.class);
                intent.putExtra("kategori", "IkanTeritorial");
                startActivity(intent);
            }
        });

        btnKategoriIkanPredator = findViewById(R.id.btnKategoriPredator);
        btnKategoriIkanPredator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SeluruhKategoriActivity.this, KategoriActivity.class);
                intent.putExtra("kategori", "IkanPredator");
                startActivity(intent);
            }
        });
    }
}