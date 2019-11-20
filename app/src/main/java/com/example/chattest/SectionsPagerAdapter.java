package com.example.chattest;

import android.app.Fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;



class SectionsPagerAdapter extends FragmentPagerAdapter {
    public SectionsPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public androidx.fragment.app.Fragment getItem(int position) {
        switch (position){
            case 0:
                RequestsFragment requestsFragment = new RequestsFragment();
                return requestsFragment;

            case 1:
                ChatsFragment chatsFragment = new ChatsFragment();
                return chatsFragment;

            case 2:
                FriendsFragment friendsFragment = new FriendsFragment();
                return friendsFragment;

            default:
                return null;
    }

//    public Fragment getItem(int position) {
//
//        switch (position){
//            case 0:
//                RequestsFragment requestsFragment = new RequestsFragment();
//                return requestsFragment;
//
//            case 1:
//                ChatsFragment chatsFragment = new ChatsFragment();
//                return chatsFragment;
//
//            case 2:
//                FriendsFragment friendsFragment = new FriendsFragment();
//                return friendsFragment;
//
//            default:
//                return null;
//
//        }
//    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "REQUESTS";

            case 1:
                return "CHATS";

            case 2:
                return "FRIENDS";

            default:
                return null;
        }
    }
}
