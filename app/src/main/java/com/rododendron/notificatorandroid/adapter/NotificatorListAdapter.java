package com.rododendron.notificatorandroid.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.rododendron.notificatorandroid.R;
import com.rododendron.notificatorandroid.dto.NotDTO;

import java.util.List;

public class NotificatorListAdapter extends RecyclerView.Adapter<NotificatorListAdapter.NotificatorViewHolder>{

    public static class NotificatorViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        TextView title;
        public NotificatorViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.cardView);
            title =  itemView.findViewById(R.id.title);
        }

    }

    private List<NotDTO> data;

    public NotificatorListAdapter(List<NotDTO> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public NotificatorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notificator_item, parent, false);
        return new NotificatorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificatorViewHolder holder, int position) {
    holder.title.setText(data.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
