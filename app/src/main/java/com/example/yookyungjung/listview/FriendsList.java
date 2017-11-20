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

public class FriendsList extends Activity implements View.OnClickListener{
    private ArrayList<FriendsItem> data=null;
    @SuppressLint("MissingSuperCall")
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends_list);
        ListView listView=(ListView)findViewById(R.id.friends_listview);

        data=new ArrayList<>();

        FriendsItem friends1=new FriendsItem(R.drawable.profile, "정유경 여 유갱","010-6527-5365");
        FriendsItem friends2=new FriendsItem(R.drawable.profile, "유지수 여 슈","010-0000-0000");
        FriendsItem friends3=new FriendsItem(R.drawable.profile, "전하영 여 하용이","010-0000-0000");

        data.add(friends1);
        data.add(friends2);
        data.add(friends3);

        FriendsAdapter adapter=new FriendsAdapter(this, R.layout.friends_item, data);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getApplicationContext(), FriendsClicked.class);
                intent.putExtra("profile", Integer.toString(data.get(position).getProfile()));
                intent.putExtra("info", data.get(position).getInfo());
                intent.putExtra("phone", data.get(position).getPhone());
                startActivity(intent);
            }
        });
    }
    @Override
    public void onClick(View v) {

    }
}
