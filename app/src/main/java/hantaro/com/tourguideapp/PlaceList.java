package hantaro.com.tourguideapp;


import android.os.Bundle;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlaceList extends Fragment {

    public static PlaceList create(){
        return new PlaceList();
    }

    private String place;

    public void setPlace(String place){
        this.place = place;
    }

    public PlaceList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_place_list, container, false);


        RecyclerView recyclerView = view.findViewById(R.id.rv_place);
        PlaceAdapter placeAdapter = new PlaceAdapter(place);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(placeAdapter);


        return view;
    }

}
