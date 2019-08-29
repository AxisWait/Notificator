package com.rododendron.notificatorandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends Activity {
private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
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
}
