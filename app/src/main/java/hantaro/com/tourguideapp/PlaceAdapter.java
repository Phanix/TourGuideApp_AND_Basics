package hantaro.com.tourguideapp;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.PlaceAdapterViewHolder> {


    String type = "";
    Context mContext;

    public PlaceAdapter(String type) {
        this.type = type;
    }

    @NonNull
    @Override
    public PlaceAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        mContext = viewGroup.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.place, viewGroup, false);
        return new PlaceAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceAdapterViewHolder placeAdapterViewHolder, int i) {
        placeAdapterViewHolder.bind(i);
    }

    @Override
    public int getItemCount() {
        return Helper.getPlace(type).length;
    }

    public class PlaceAdapterViewHolder extends RecyclerView.ViewHolder{

        TextView tvTitle;
        TextView tvAddress;
        ImageView placeImage;



        public PlaceAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvAddress = itemView.findViewById(R.id.tv_address);
            placeImage = itemView.findViewById(R.id.iv_place);
        }

        public void bind(int  position){

            String [] placeDescription = mContext.getResources().getString(Helper.getPlace(type)[position]).split(":");
            tvTitle.setText(placeDescription[0]);
            tvAddress.setText(placeDescription[1]);
            placeImage.setImageResource(Helper.getImage(type)[position]);
        }
    }
}
