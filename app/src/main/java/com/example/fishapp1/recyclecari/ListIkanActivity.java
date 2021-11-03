package com.example.fishapp1.recyclecari;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fishapp1.DataSeluruhIkan;
import com.example.fishapp1.R;
import com.example.fishapp1.model.ItemModel;

import java.util.List;

public class ListIkanActivity extends AppCompatActivity {

    private AdapterIkan adapterIkan;
    private List<ItemModel> list;
    private LinearLayoutManager linearLayoutManager;
    private boolean isFiltered = false;
    private RecyclerView recyclerView;
    String TAG = "ListIkanActivity";
    private DataSeluruhIkan dataSeluruhIkan;
    TextView textGagal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_ikan);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Cari Ikan");

        final MediaPlayer suaraSplashScreen = MediaPlayer.create(this, R.raw.confirmsfxsatu);

        dataSeluruhIkan = new DataSeluruhIkan();
        list = dataSeluruhIkan.listDataIkan();

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView = findViewById(R.id.idRecycle1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        adapterIkan = new AdapterIkan(list, listener);
        recyclerView.setAdapter(adapterIkan);
        textGagal = findViewById(R.id.idTextGagal);


        final SearchView searchView = (SearchView) findViewById(R.id.idCari2);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Log.d(TAG, "onQueryTextChange: newtext " + newText);
                isFiltered = searchView.getQuery().length() > 0;
                adapterIkan.getFilter().filter(newText);


                Log.d(TAG, "onCreate: List size didalem filter " + adapterIkan.getList().size());
                textGagal.setText("");
                if (adapterIkan.getList().size() < 1) {
                    Toast.makeText(ListIkanActivity.this, "Ikan tidak ditemukan", Toast.LENGTH_SHORT).show();
                    textGagal.setText("Ikan belum tersedia");
                    suaraSplashScreen.start();
                }
                if (newText.equals("") || newText == null) {
                    textGagal.setText("");
                }
                return true;
            }
        });
    }

    private AdapterIkan.OnItemClickListener listener = new AdapterIkan.OnItemClickListener() {
        @Override
        public void onItemClicked(ItemModel itemModel) {
            Intent intent = new Intent(ListIkanActivity.this, TampilDataIkanActivity.class);
            intent.putExtra("id_gambar", itemModel.getIdListGambar());
            intent.putExtra("id_judul", itemModel.getIdListNama());
            intent.putExtra("id_desk", itemModel.getIdListDeskripsi());
            startActivity(intent);

        }
    };
}