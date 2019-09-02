package com.rododendron.notificatorandroid.adapter;

import android.content.Context;
import android.util.ArrayMap;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.rododendron.notificatorandroid.fragments.AbstructTabFragment;
import com.rododendron.notificatorandroid.fragments.BirthdayFragment;
import com.rododendron.notificatorandroid.fragments.HistoryFragment;
import com.rododendron.notificatorandroid.fragments.IdeasFragment;
import com.rododendron.notificatorandroid.fragments.TODOFragment;

public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private ArrayMap<Integer, AbstructTabFragment> tabs;
    private Context context;

    public TabsFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        initTabMap(context);


    }

    private void initTabMap(Context context) {
        tabs = new ArrayMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TODOFragment.getInstance(context));
        tabs.put(3, BirthdayFragment.getInstance(context));
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}
