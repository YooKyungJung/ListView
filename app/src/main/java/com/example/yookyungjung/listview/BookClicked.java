package com.example.yookyungjung.listview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by YookyungJung on 2017-11-21.
 */

public class BookClicked extends Activity {
    private int img;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_clicked);
        Intent intent=getIntent();
        ImageView profile =(ImageView)findViewById(R.id.img_prof);
        TextView bookName=(TextView)findViewById(R.id.bookName);
        TextView writer=(TextView)findViewById(R.id.writer);
        TextView publisher=(TextView)findViewById(R.id.publisher);

        img=Integer.parseInt(intent.getStringExtra("profile"));
        profile.setImageResource(img);
        bookName.setText(intent.getStringExtra("bookName"));
        writer.setText(intent.getStringExtra("writer"));
        publisher.setText(intent.getStringExtra("publisher"));
    }
}
