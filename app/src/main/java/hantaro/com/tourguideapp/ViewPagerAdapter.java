package hantaro.com.tourguideapp;

import android.support.annotation.Nullable;
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
                    placeList.setPlace(Helper.ATTRACTIONS);
                }
                else if(i == 1){
                    placeList.setPlace(Helper.RESTAURANTS);
                }else if(i == 2){
                    placeList.setPlace(Helper.PARKS);
                }else if(i == 3){
                    placeList.setPlace(Helper.HOTELS);
                }
                return placeList;

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return Helper.getName(position);
    }

    @Override
    public int getCount() {
        return 4;
    }
}
