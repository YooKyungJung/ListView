package com.example.yookyungjung.listview;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by YookyungJung on 2017-11-21.
 */

public class BookList extends Activity implements View.OnClickListener{
    private ArrayList<BookItem> data=null;
    @SuppressLint("MissingSuperCall")
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_list);
        ListView listView=(ListView)findViewById(R.id.book_listview);

        data=new ArrayList<>();

        BookItem b1=new BookItem(R.drawable.profile, "나미야 잡화점의 기적","히가시노 게이고 저/양운옥 역","출판사1");
        BookItem b2=new BookItem(R.drawable.profile, "공허한 십자가","히가시노게이고 저/이선화역","모르겠는데요");

        data.add(b1);
        data.add(b2);

        BookAdapter adapter=new BookAdapter(this, R.layout.book_item, data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(), BookClicked.class);
                intent.putExtra("profile", Integer.toString(data.get(position).getProfile()));
                intent.putExtra("BookName", data.get(position).getBookName());
                intent.putExtra("writer", data.get(position).getWriter());
                intent.putExtra("publisher", data.get(position).getPublisher());

                startActivity(intent);
            }
        });
    }
    @Override
    public void onClick(View v) {

    }
}
