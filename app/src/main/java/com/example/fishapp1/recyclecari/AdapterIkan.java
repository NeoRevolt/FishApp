package com.example.fishapp1.recyclecari;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fishapp1.R;
import com.example.fishapp1.model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class AdapterIkan extends RecyclerView.Adapter<AdapterIkan.AdapterIkanViewHolder> implements Filterable {

    List<ItemModel> list;
    List<ItemModel> listFull;

    public class AdapterIkanViewHolder extends RecyclerView.ViewHolder {
        public ImageView gambar;
        private TextView judul, deskripsi;

        public AdapterIkanViewHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.idImg);
            judul = itemView.findViewById(R.id.idJudul);
            deskripsi = itemView.findViewById(R.id.idDesk);

        }

        public void bind(final ItemModel itemModel, final OnItemClickListener listener) {
            gambar.setImageResource(itemModel.getIdListGambar());
            judul.setText(itemModel.getIdListNama());
            deskripsi.setText(itemModel.getIdListDeskripsi());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) {
                        listener.onItemClicked(itemModel);
                    }
                }
            });
        }
    }

    public interface OnItemClickListener {
        public void onItemClicked(ItemModel itemModel);
    }

    private OnItemClickListener listener;

    public AdapterIkan() {
        list = new ArrayList<>();
        listFull = new ArrayList<>();
    }

    public AdapterIkan(@NonNull List<ItemModel> list) {
        this.list = list;
        listFull = new ArrayList<>(list);
    }

    public AdapterIkan(@NonNull OnItemClickListener listener) {
        list = new ArrayList<>();
        listFull = new ArrayList<>(list);
        this.listener = listener;
    }


    public AdapterIkan(List<ItemModel> list, OnItemClickListener listener) {
        this.list = list;
        listFull = new ArrayList<>(list);
        this.listener = listener;
    }

    public List<ItemModel> getList() {
        return list;
    }

    public List<ItemModel> getListFull() {
        return listFull;
    }

    public void addItem(List<ItemModel> items) {
        list.addAll(items);
        listFull.addAll(items);
    }

    private Filter filter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            final List<ItemModel> filteredList = new ArrayList<>();
            final String str = constraint.toString().toLowerCase();
            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(listFull);
            } else {
                for (ItemModel itemModel : listFull) {
                    if (itemModel.getIdListNama().toLowerCase().contains(str)) {
                        filteredList.add(itemModel);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = filteredList;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            list.clear();
            list.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };

    @Override
    public Filter getFilter() {
        return filter;
    }


    @Override
    public AdapterIkan.AdapterIkanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        AdapterIkanViewHolder holder = new AdapterIkanViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterIkan.AdapterIkanViewHolder itemHolder, int position) {
        ItemModel item = list.get(position);
        itemHolder.bind(item, listener);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
