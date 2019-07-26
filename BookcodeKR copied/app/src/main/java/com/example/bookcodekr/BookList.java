package com.example.bookcodekr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class BookList extends AppCompatActivity {

    private ArrayList<HashMap<String, String>> Data = new
            ArrayList<HashMap<String, String>>();
    private HashMap<String, String> InputData1 = new HashMap<>();
    private HashMap<String, String> InputData2 = new HashMap<>();
    private HashMap<String, String> InputData3 = new HashMap<>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);
        listView = (ListView)findViewById(R.id.List_view);

        //데이터 초기화
        InputData1.put("title", "BIGVOCA core(빅보카 코어)");
        InputData1.put("genre", "외국어");
        Data.add(InputData1);

        InputData2.put("title", "가장 빨리 만나는 유니티 AR/VR");
        InputData2.put("genre", "컴퓨터/IT");
        Data.add(InputData2);

        InputData2.put("title", "가장 빨리 만나는 유니티 AR/VR");
        InputData2.put("genre", "컴퓨터/IT");
        Data.add(InputData3);

        //simpleAdapter 생성
        SimpleAdapter simpleAdapter = new
                SimpleAdapter(this, Data, android.R.layout.simple_list_item_2, new
                String[]{"title", "genre"}, new int[]
                {android.R.id.text1, android.R.id.text2});
        listView.setAdapter(simpleAdapter);
    }
}
