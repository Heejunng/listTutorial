package com.example.listtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Menu2Activity extends AppCompatActivity {

    private List<String> mData;
    private ArrayAdapter<String> mAdapter;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);


        initData(); // list 데이터 준비
        initAdapter(); //adapter 준비
        initListView();
    }


    private void initData(){
        mData = new ArrayList<> ();
        for(int i=0; i<=20; i++)
        {
            mData.add("Item "+i);
        }

    }

    private void initAdapter(){
        mAdapter = new ArrayAdapter<> (this,
                android.R.layout.simple_list_item_1,mData);
    }

    private void initListView(){
        mListView = (ListView)findViewById (R.id.list_view);
        mListView.setAdapter(mAdapter);
    }



    public void onBackButtonClicked(View v){
        Toast.makeText(this, "돌아가기", Toast.LENGTH_LONG).show();

        finish();
        //화면을 없애주는 역할
    }
}
