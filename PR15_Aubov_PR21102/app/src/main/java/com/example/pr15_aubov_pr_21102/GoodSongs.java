package com.example.pr15_aubov_pr_21102;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

/*
 * Main Activity class that loads {@link MainFragment3}.
 */
public class GoodSongs extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_songs);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.main_browse_fragment, new MainFragment3())
                    .commitNow();
        }
    }

}