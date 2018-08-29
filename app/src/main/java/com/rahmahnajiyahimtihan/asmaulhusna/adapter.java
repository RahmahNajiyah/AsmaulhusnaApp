package com.rahmahnajiyahimtihan.asmaulhusna;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by User on 1/16/2018.
 */

public class adapter extends ArrayAdapter {
    private final Activity context;
    private final String nama[];
    private final String arti[];
    private final int gambar[];

    public adapter (Activity context, int[] gambar, String[] nama, String[] arti) { //hrs sm kyk yg di java pas di bag. adapter listview
        super(context, R.layout.listitem, nama);
        this.context = context;
        this.nama = nama;
        this.arti = arti;
        this.gambar = gambar;
    }
    @NonNull
    @Override
    public View getView (int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View v = layoutInflater.inflate (R.layout.listitem, null, true);
        TextView txt = (TextView) v.findViewById(R.id.txtasma);
        TextView txt2 = (TextView) v.findViewById(R.id.txtasma2);
        ImageView img = (ImageView) v.findViewById(R.id.imgasma);

        txt.setText(nama[position]);
        txt2.setText(arti[position]);
        img.setImageResource(gambar[position]);

        return v;


    }

}
