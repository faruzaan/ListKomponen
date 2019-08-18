package com.example.listkomponenkomputer;

public class DataKomponen {
    private String nama,jenis,desc;
    private int foto;

    public DataKomponen(String nama, String jenis, String desc, int foto) {
        this.nama = nama;
        this.jenis = jenis;
        this.desc = desc;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
