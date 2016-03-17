package com.samset.bottombar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarFragment;
import com.samset.bottombar.fragments.AndroidFragment;
import com.samset.bottombar.fragments.FavoriteFragment;
import com.samset.bottombar.fragments.GalleryFragment;
import com.samset.bottombar.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    private BottomBar bottomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomBar = BottomBar.attach(this, savedInstanceState);
        bottomBar.setFragmentItems(getSupportFragmentManager(), R.id.fragmentContainer,
                new BottomBarFragment(HomeFragment.getInstance(), R.drawable.ic_home, "Home"),
                new BottomBarFragment(AndroidFragment.getInstance(), R.drawable.ic_android, "Android"),
                new BottomBarFragment(FavoriteFragment.getInstance(), R.drawable.ic_favorite, "Favorites"),
                new BottomBarFragment(GalleryFragment.getInstance(), R.drawable.ic_media, "Gallery")

        );

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        bottomBar.onSaveInstanceState(outState);
    }
}
