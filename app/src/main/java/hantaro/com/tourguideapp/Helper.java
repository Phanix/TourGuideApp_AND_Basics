package hantaro.com.tourguideapp;


import android.content.res.Resources;

public class Helper {
    public static final String RESTAURANTS = "restaurat";
    public static final String HOTELS = "hotels";
    public static final String PARKS = "parks";
    public static final String ATTRACTIONS = "attractions";
 

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

    public static int[] parksImages = {
            R.drawable.presidio,
            R.drawable.goldengatepark,
            R.drawable.ina,
            R.drawable.grandview,
            R.drawable.buena
    };

    public static int [] parks = {
            R.string.presidio,
            R.string.golden_gate_park,
            R.string.ina,
            R.string.grandview,
            R.string.buena_vista
    };

    public static int [] attractions = {
            R.string.golden_gate,
            R.string.alcatraz,
            R.string.ferry,
            R.string.alamo,
            R.string.cable
    };
    public static int [] attractionsImages = {
            R.drawable.goldengate,
            R.drawable.alcatraz,
            R.drawable.ferry,
            R.drawable.alamo,
            R.drawable.cacle
    };

   public static int []  getImage(String type){
            if(type.equals(RESTAURANTS))
                 return restaurantsImages;
            else if(type.equals(HOTELS)){
                return hotelImages;
            }else if(type.equals(PARKS)){
                return parksImages;
            }else{
                return attractionsImages;
            }
   }

   public static int [] getPlace(String type) {
       if(type.equals(RESTAURANTS))
            return restaurants;
       else if(type.equals(HOTELS))
           return hotels;
       else if(type.equals(PARKS)){
           return parks;
       }else{
           return attractions;
       }

   }


   public static String getName(int position){

       switch (position){
           case 0:
               return "Attractions";
           case 1:
               return "Restaurants";
           case 2:
               return "Parks";
           case 3:
               return "Hotels";
           default:
               return "";

       }
   }


}
