package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGoods;
    CustomGoodsAdapter adt;
    ArrayList<Goods> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoods=findViewById(R.id.lvGoods);

        arrayList=new ArrayList<>();
        arrayList.add(new Goods("Ca nấu lẩu,nấu mì mini..","Shop devang",
                R.drawable.xa_can_cau));
        arrayList.add(new Goods("Đồ choei dạng mô hình, mini..","Shop devang",
                R.drawable.do_choi_dang_mo_hinh));
        arrayList.add(new Goods("Gà bó tỏi,bó tỏi mini..","Shop devang",
                R.drawable.ga_bo_toi));
        arrayList.add(new Goods("Lanh dao gian don..","Shop devang",
                R.drawable.lanh_dao_gian_don));



        adt=new CustomGoodsAdapter(this,R.layout.item_listview,arrayList);
        lvGoods.setAdapter(adt);

    }
}