package com.rododendron.notificatorandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private static  final int LAYOUT = R.layout.activity_main;

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppDefoult);
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);

        initToolbar();
        initNavigationView();
    }

    private void initToolbar() {
    toolbar =  findViewById(R.id.toolbar);
    toolbar.setTitle(R.string.app_name);
    toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            return false;
        }
    });
    toolbar.inflateMenu(R.menu.menu);
    }

    private void initNavigationView() {
    drawerLayout = findViewById(R.id.drawerLayout);

    }
}
