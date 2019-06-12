package hantaro.com.tourguideapp;


import android.content.res.Resources;

public class Helper {
    public static final String RESTAURANTS = "restaurat";
    public static final String HOTELS = "hotels";
 

    public static int [] restaurants = {
            R.string.mo_grill,
            R.string.za_pizza,
            R.string.curry_restaurant,
            R.string.good_mong,
            R.string.hot_stup

    };

    public static int [] hotels = {
            R.string.hotel_nikko,
            R.string.fairmont,
            R.string.cow_hollow,
            R.string.argonaut,
            R.string.zoe

    };

    public static int [] hotelImages = {
            R.drawable.nikko,
            R.drawable.fairmont,
            R.drawable.cowhollow,
            R.drawable.argonaut,
            R.drawable.zoe
    };




    public static int[] restaurantsImages = {
            R.drawable.mo,
            R.drawable.za,
            R.drawable.curry,
            R.drawable.goodmong,
            R.drawable.hot
    };

   public static int []  getImage(String type){
            if(type.equals(RESTAURANTS))
                 return restaurantsImages;
            else{
                return hotelImages;
            }
   }

   public static int [] getPlace(String type) {
       if(type.equals(RESTAURANTS))
            return restaurants;
       else
           return hotels;

   }


}
