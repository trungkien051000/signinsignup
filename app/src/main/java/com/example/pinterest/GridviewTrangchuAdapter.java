package com.example.pinterest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class GridviewTrangchuAdapter extends BaseAdapter {
    private List<HinhAnh> hinhAnhList;
    private Context context;

    public GridviewTrangchuAdapter(List<HinhAnh> hinhAnhList, Context context) {
        this.hinhAnhList = hinhAnhList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return hinhAnhList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.custom_layout_gridview_trangchu,null);
        TextView txtName = (TextView) convertView.findViewById(R.id.txtNameTrangChu);
        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.imgHinhTrangChu);
        txtName.setText(hinhAnhList.get(position).getTen());
        Glide.with(context).load(hinhAnhList.get(position)
                .getURLHinh())
                .centerCrop()
                .into(imgHinh);
        return convertView;
    }
}
