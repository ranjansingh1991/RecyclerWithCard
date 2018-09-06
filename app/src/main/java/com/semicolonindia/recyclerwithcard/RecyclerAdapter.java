package com.semicolonindia.recyclerwithcard;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by RANJAN SINGH on 8/25/2017.
 */
@SuppressWarnings("ALL")
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    List<Pojo> item;
    Context context;
    //
    private boolean isHeartFilled = false;

    public RecyclerAdapter(Context context, List<Pojo> item) {
        this.context = context;
        this.item = item;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerow, null);
        return new ViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        holder.tv_cardText.setText(item.get(position).getName());
        holder.iv_cardImage.setImageResource(item.get(position).getImage());
       /* holder.cardView.setText(item.get(position).getName());
*/
        holder.imgHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isHeartFilled) {
                    holder.imgHeart.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_heart_solid_red_48));
                    isHeartFilled = true;
                } else {
                    holder.imgHeart.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_heart_holo_gray_48));
                    isHeartFilled = false;
                }
            }
        });
        // Button onClick
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (position){
                    case 0:
                        context.startActivity(new Intent(context, TabLayoutSlide.class) );
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_cardText;
        ImageView iv_cardImage;
        ImageView imgHeart;
        CardView cardView;


        public ViewHolder(View itemView) {
            super(itemView);
            tv_cardText = itemView.findViewById(R.id.tv_cardText);
            iv_cardImage = itemView.findViewById(R.id.iv_cardImage);
            imgHeart = itemView.findViewById(R.id.imgHeart);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}


