package com.example.fishapp1.model;

public class ItemModel {
    private int idListGambar;
    private String idListNama;
    private int idListDeskripsi;

    public ItemModel(int idListGambar, String idListNama, int idListDeskripsi) {
        this.idListGambar = idListGambar;
        this.idListNama = idListNama;
        this.idListDeskripsi = idListDeskripsi;
    }

    public int getIdListGambar() {
        return idListGambar;
    }

    public void setIdListGambar(int idListGambar) {
        this.idListGambar = idListGambar;
    }

    public String getIdListNama() {
        return idListNama;
    }

    public void setIdListNama(String idListNama) {
        this.idListNama = idListNama;
    }

    public int getIdListDeskripsi() {
        return idListDeskripsi;
    }

    public void setIdListDeskripsi(int idListDeskripsi) {
        this.idListDeskripsi = idListDeskripsi;
    }
}
