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

public class FriendsClicked extends Activity {
    private int img;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_clicked);
        Intent intent=getIntent();
        ImageView profile =(ImageView)findViewById(R.id.img_prof);
        TextView info=(TextView)findViewById(R.id.tv_info);
        TextView phone=(TextView)findViewById(R.id.tv_pn);

        img=Integer.parseInt(intent.getStringExtra("profile"));
        profile.setImageResource(img);
        info.setText(intent.getStringExtra("info"));
        phone.setText(intent.getStringExtra("phone"));
    }
}
