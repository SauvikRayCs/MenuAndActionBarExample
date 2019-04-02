package com.ray.sauvik.menuandactionbarexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mMenuInflater = getMenuInflater();
        mMenuInflater.inflate(R.menu.menu_main,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {   String msg = "";
        switch (item.getItemId())
        {
            case R.id.menu_Favorite:
                msg = "Favourite";
        }
        switch (item.getItemId())
        {
            case R.id.menu_First:
                msg = "First";
        }
        switch (item.getItemId())
        {
            case R.id.menu_Location:
                msg = "Location";
        }
        switch (item.getItemId())
        {
            case R.id.menu_Logout:
                msg = "Logout";
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}
