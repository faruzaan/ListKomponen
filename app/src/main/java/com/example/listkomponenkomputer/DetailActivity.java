package com.example.listkomponenkomputer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView txtNama,txtJenis,txtDesc;
    ImageView imgFoto;
    String nama,jenis,desc;
    int foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nama = getIntent().getStringExtra("NAMA");
        jenis = getIntent().getStringExtra("JENIS");
        desc = getIntent().getStringExtra("DESC");
        foto = getIntent().getIntExtra("FOTO",0);

        imgFoto = (ImageView) findViewById(R.id.imgFoto);
        txtNama = (TextView) findViewById(R.id.txtNama);
        txtJenis = (TextView) findViewById(R.id.txtJenis);
        txtDesc = (TextView) findViewById(R.id.txtDesc);

        imgFoto.setImageResource(foto);
        txtNama.setText(nama);
        txtJenis.setText(jenis);
        txtDesc.setText(desc);
    }
}
