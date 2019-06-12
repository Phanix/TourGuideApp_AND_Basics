package hantaro.com.tourguideapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int i) {
                PlaceList placeList = PlaceList.create();
                if(i == 0){
                    placeList.setPlace(Helper.RESTAURANTS);
                }
                else if(i == 1){
                    placeList.setPlace(Helper.HOTELS);
                }
                return placeList;

    }

    @Override
    public int getCount() {
        return 2;
    }
}
