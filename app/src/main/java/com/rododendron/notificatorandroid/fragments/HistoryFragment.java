package com.rododendron.notificatorandroid.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rododendron.notificatorandroid.R;
import com.rododendron.notificatorandroid.adapter.NotificatorListAdapter;
import com.rododendron.notificatorandroid.dto.NotDTO;

import java.util.ArrayList;
import java.util.List;

public class HistoryFragment extends AbstructTabFragment {
    private static  final int LAYOUT = R.layout.fragment_history;

    public static HistoryFragment getInstance(Context context){
        Bundle args = new Bundle();
        HistoryFragment fragment = new HistoryFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_history));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        RecyclerView recyclerView = view.findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new NotificatorListAdapter(createMockNotificatorListData()));//сюда будут прилетать данные с сервера. Пока мок.
        return view;
    }

    private List<NotDTO> createMockNotificatorListData() { //заглушка
        List<NotDTO> mokData = new ArrayList<>();
        mokData.add(new NotDTO("Item1"));
        mokData.add(new NotDTO("Item2"));
        mokData.add(new NotDTO("Item3"));
        mokData.add(new NotDTO("Item4"));
        mokData.add(new NotDTO("Item5"));
        mokData.add(new NotDTO("Item6"));
        return mokData;
    }


    public void setContext(Context context) {
        this.context = context;
    }

}
