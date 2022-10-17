package com.example.tranngoctien_2050531200311_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvMayTinh;
    private MayTinhAdapter maytinhadt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvMayTinh = findViewById(R.id.rcv_mayTinh);
        maytinhadt = new MayTinhAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rcvMayTinh.setLayoutManager(linearLayoutManager);

        maytinhadt.setData(getListMayTinh());
    }
    private List<MayTinh> getListMayTinh(){
        List<MayTinh> list =new ArrayList<>();

        return list;

    }
}