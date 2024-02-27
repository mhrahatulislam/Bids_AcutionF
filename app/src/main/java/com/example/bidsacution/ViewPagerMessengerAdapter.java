package com.example.bidsacution;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerMessengerAdapter extends FragmentPagerAdapter {
    public ViewPagerMessengerAdapter(@NonNull FragmentManager fm) {super(fm);}

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new All_fragment();
        } else if (position == 1) {
            return new WomenFashion();
        } else if (position == 2) {
            return new Health_Beauty();
        }
        else {
            return new Health_Bea();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "All";
        } else if (position==1)
        {
            return "Women Fashion";
        }else if(position==2) {
            return "Health_Beauty";
        } else
        {
            return "Health Bea";
        }
    }

}
