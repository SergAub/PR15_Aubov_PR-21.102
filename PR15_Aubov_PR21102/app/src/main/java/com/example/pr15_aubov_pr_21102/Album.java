package com.example.pr15_aubov_pr_21102;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.FragmentActivity;

/*
 * Main Activity class that loads {@link MainFragment2}.
 */
public class Album extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.main_browse_fragment, new MainFragment2())
                    .commitNow();
        }
    }
    public void GoToPopSong(View view){
        Intent intent = new Intent(this, PopSongs.class);
        startActivity(intent);
    }
}