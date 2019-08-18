package com.example.listkomponenkomputer;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterKomponen extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    List<DataKomponen> itemlist;

    public AdapterKomponen(Activity activity, List<DataKomponen> itemlist) {
        this.activity = activity;
        this.itemlist = itemlist;
    }

    @Override
    public int getCount() {
        return itemlist.size();
    }

    @Override
    public Object getItem(int position) {
        return itemlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null)
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.item_komponen, null);
        TextView txtNama = (TextView) convertView.findViewById(R.id.txtNama);
        TextView txtJenis = (TextView) convertView.findViewById(R.id.txtJenis);
        //TextView txtDesc = (TextView) convertView.findViewById(R.id)
        ImageView imgFoto = (ImageView) convertView.findViewById(R.id.imgFoto);

        DataKomponen data = itemlist.get(position);
        txtNama.setText(data.getNama());
        txtJenis.setText(data.getJenis());
        imgFoto.setImageResource(data.getFoto());
        return convertView;
    }
}
