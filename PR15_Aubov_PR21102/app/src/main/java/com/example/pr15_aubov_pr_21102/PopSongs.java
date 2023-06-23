package com.example.pr15_aubov_pr_21102;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.FragmentActivity;

/*
 * Main Activity class that loads {@link MainFragment4}.
 */
public class PopSongs extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_songs);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.main_browse_fragment, new MainFragment4())
                    .commitNow();
        }
    }

    public void GoToSong(View view){
        Intent intent = new Intent(this, GoodSongs.class);
        startActivity(intent);
    }
}