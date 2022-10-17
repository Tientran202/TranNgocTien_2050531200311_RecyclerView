package com.example.tranngoctien_2050531200311_recycleview;

import android.content.Context;
import android.view.ContentInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MayTinhAdapter extends RecyclerView.Adapter<MayTinhAdapter.MaytinhView>{
    private Context mContext;
    private List<MayTinh> mayTinhList;

    public MayTinhAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<MayTinh> list){
        this.mayTinhList = list;
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public MaytinhView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_maytinh,parent,false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MaytinhView holder, int position) {
        MayTinh maytinh = mayTinhList.get(position);
        if(maytinh == null){
            return;
        }
        holder.anhMayTinh.setImageResource(maytinh.getIdImage());
        holder.tenMayTinh.setText(maytinh.getTenMay());
    }

    @Override
    public int getItemCount() {
        if(mayTinhList != null){
            return mayTinhList.size();
        }
        return 0;
    }

    public class MaytinhView extends RecyclerView.ViewHolder {

        private ImageView anhMayTinh;
        private TextView tenMayTinh;

        public MaytinhView(@NonNull View itemView) {
            super(itemView);
            anhMayTinh = itemView.findViewById(R.id.imageMayTinh);
            tenMayTinh = itemView.findViewById(R.id.textMayTinh);


        }
    }
}
