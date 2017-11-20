package com.example.yookyungjung.listview;

/**
 * Created by YookyungJung on 2017-11-21.
 */

public class FriendsItem {
    private int profile;
    private String info;
    private String phone;

    public int getProfile() {
        return profile;
    }
    public String getInfo() {
        return info;
    }
    public String getPhone() {
        return phone;
    }
    public FriendsItem(int profile, String info, String phone) {
        this.profile=profile;
        this.info=info;
        this.phone=phone;
    }
}
