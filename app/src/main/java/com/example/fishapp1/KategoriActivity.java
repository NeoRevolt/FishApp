package com.example.fishapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.fishapp1.model.ItemModel;
import com.example.fishapp1.recyclecari.TampilDataIkanActivity;
import com.example.fishapp1.recyclekategori.AdapterKategori;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class KategoriActivity extends AppCompatActivity {
    private RoundedImageView gambarKategoriStatic1;
    private List<ItemModel> list;
    private DataSeluruhIkan dataSeluruhIkan;
    private AdapterKategori adapterKategori;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerView recyclerView;
    String TAG = "KategoriActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);
        dataSeluruhIkan = new DataSeluruhIkan();
        gambarKategoriStatic1 = findViewById(R.id.idGambarKategoriStatic);
        setTitle(" ");


        //TODO
        String kategori = getIntent().getStringExtra("kategori");
        if (kategori.equalsIgnoreCase("IkanPopuler")) {
            gambarKategoriStatic1.setImageResource(R.drawable.kategori_smallfish);
            list = dataSeluruhIkan.lisDataIkanSmallFish();
        } else if (kategori.equalsIgnoreCase("IkanPemula")) {
            gambarKategoriStatic1.setImageResource(R.drawable.kategori_goldfish);
            list = dataSeluruhIkan.lisDataIkanGoldFish();
        } else if (kategori.equalsIgnoreCase("IkanIndo")) {
            gambarKategoriStatic1.setImageResource(R.drawable.kategori_lele);
            list = dataSeluruhIkan.listDataIkanCatfish();
        } else if (kategori.equalsIgnoreCase("IkanLuar")) {
            gambarKategoriStatic1.setImageResource(R.drawable.kategori_cichlid);
            list = dataSeluruhIkan.listDataIkanCichlid();
        } else if (kategori.equalsIgnoreCase("IkanTeritorial")) {
            gambarKategoriStatic1.setImageResource(R.drawable.kategori_teritorialdua);
            list = dataSeluruhIkan.listDataIkanTeritorial();
        } else if (kategori.equalsIgnoreCase("IkanPredator")) {
            gambarKategoriStatic1.setImageResource(R.drawable.kategori_predatordua);
            list = dataSeluruhIkan.listDataIkanPredator();
        }

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView = findViewById(R.id.idRecycleKategori);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        adapterKategori = new AdapterKategori(list, listener);
        recyclerView.setAdapter(adapterKategori);

    }

    private AdapterKategori.OnItemClickListener listener = new AdapterKategori.OnItemClickListener() {
        @Override
        public void onItemClicked(ItemModel itemModel) {
            Intent intent = new Intent(KategoriActivity.this, TampilDataIkanActivity.class);
            intent.putExtra("id_gambar", itemModel.getIdListGambar());
            intent.putExtra("id_judul", itemModel.getIdListNama());
            intent.putExtra("id_desk", itemModel.getIdListDeskripsi());
            startActivity(intent);

        }
    };
}