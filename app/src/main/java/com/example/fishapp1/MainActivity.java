package com.example.fishapp1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.fishapp1.InfoApp.InfoActivity;
import com.example.fishapp1.recyclecari.ListIkanActivity;
import com.google.android.material.button.MaterialButton;
import com.makeramen.roundedimageview.RoundedImageView;


public class MainActivity extends AppCompatActivity {

    private ImageButton btnInfo;
    private TextView btnLihatSemua;
    private MaterialButton btnCariBeranda;
    private RoundedImageView btnKategori1, btnKategori2, btnKategori3, btnIkanInvasif, btnBersihAquarium, btnKesehatanIkan;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btnInfo = findViewById(R.id.idInfoBtn);
        btnInfo.setOnClickListener(btnInfoClicked);
        btnLihatSemua = findViewById(R.id.idLihatSemua);
        btnLihatSemua.setOnClickListener(getBtnLihatSemuaClicked);

        btnCariBeranda = findViewById(R.id.btnCari_Beranda);
        btnCariBeranda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListIkanActivity.class);
                startActivity(intent);
            }
        });

        btnKategori1 = findViewById(R.id.kategoriBeranda1);
        btnKategori1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KategoriActivity.class);
                intent.putExtra("kategori", "IkanPopuler");
                startActivity(intent);
            }
        });

        btnKategori2 = findViewById(R.id.kategoriBeranda2);
        btnKategori2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KategoriActivity.class);
                intent.putExtra("kategori", "IkanPemula");
                startActivity(intent);
            }
        });
        btnKategori3 = findViewById(R.id.kategoriBeranda3);
        btnKategori3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KategoriActivity.class);
                intent.putExtra("kategori", "IkanIndo");
                startActivity(intent);
            }
        });

        btnIkanInvasif = findViewById(R.id.idTips2);
        btnIkanInvasif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IkanInvasifActivity.class);
                startActivity(intent);
            }
        });

        btnBersihAquarium = findViewById(R.id.idBersihAquarium);
        btnBersihAquarium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BersihAquariumActivity.class);
                startActivity(intent);
            }
        });

        btnKesehatanIkan = findViewById(R.id.idKesehatanIkan);
        btnKesehatanIkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KesehatanIkanActivity.class);
                startActivity(intent);
            }
        });
    }

    View.OnClickListener btnInfoClicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, InfoActivity.class);
            startActivity(intent);
        }
    };


    View.OnClickListener getBtnLihatSemuaClicked = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SeluruhKategoriActivity.class);
            startActivity(intent);
        }
    };

}