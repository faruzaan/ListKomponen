package com.example.listkomponenkomputer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listKomponen;
    List<DataKomponen> itemList = new ArrayList<DataKomponen>();
    AdapterKomponen adapterKomponen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listKomponen = findViewById(R.id.listKomponen);
        adapterKomponen = new AdapterKomponen(this,itemList);
        listKomponen.setAdapter(adapterKomponen);
        loadData();

        listKomponen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, DetailActivity.class);

                i.putExtra("NAMA", itemList.get(position).getNama());
                i.putExtra("JENIS", itemList.get(position).getJenis());
                i.putExtra("DESC", itemList.get(position).getDesc());
                i.putExtra("FOTO", itemList.get(position).getFoto());
                startActivity(i);
            }
        });
    }
    private void loadData()
    {
        itemList.clear();
        itemList.add(new DataKomponen("CPU","Intel/AMD","CPU CPU CPU CPU CPU CPU CPU CPU CPU CPU ",R.drawable.cpu));
        itemList.add(new DataKomponen("RAM","DDR","RAM RAM RAM RAM RAM RAM RAM RAM RAM RAM  ",R.drawable.ram));
        itemList.add(new DataKomponen("GPU","AMD/Nvidia","GPU GPU GPU GPU GPU GPU GPU GPU GPU GPU ",R.drawable.gpu));
        itemList.add(new DataKomponen("Storage","HDD/SSD","HDD HDD HDD HDD HDD HDD HDD HDD HDD HDD ",R.drawable.hdd));
    }
}
