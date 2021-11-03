package com.example.fishapp1.recyclecari;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fishapp1.R;

public class TampilDataIkanActivity extends AppCompatActivity {

    private ImageView gambar;
    private TextView judul, deskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_data_ikan);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(" ");

        gambar = findViewById(R.id.idTampilGambar);
        judul = findViewById(R.id.idJudulTampil);
        deskripsi = findViewById(R.id.idDeskripsiTampil);

        deskripsi.setMovementMethod(LinkMovementMethod.getInstance());

        int idGambar = getIntent().getIntExtra("id_gambar",R.drawable.tips1);
        String idJudul = getIntent().getStringExtra("id_judul");
        int idDesk = getIntent().getIntExtra("id_desk",R.string.deks_default);

        gambar.setImageResource(idGambar);
        judul.setText(idJudul);
        deskripsi.setText(idDesk);
    }
}