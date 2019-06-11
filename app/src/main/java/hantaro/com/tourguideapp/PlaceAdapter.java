package hantaro.com.tourguideapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceAdapterViewHolder> {

    @NonNull
    @Override
    public PlaceAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceAdapterViewHolder placeAdapterViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class PlaceAdapterViewHolder extends RecyclerView.ViewHolder{


        public PlaceAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
