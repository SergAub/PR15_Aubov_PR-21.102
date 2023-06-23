package com.example.pr15_aubov_pr_21102;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;

/*
 * Main Activity class that loads {@link MainFragment}.
 */
public class SignIn extends FragmentActivity {

    TextView Login, Password;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.main_browse_fragment, new MainFragment())
                    .commitNow();
        }

        Login = (TextView) findViewById(R.id.editTextText);
        Password = (TextView) findViewById(R.id.editTextText2);

    }

    public void GoToAlbums(View view){
        if(Login.getText().length() != 0 && Password.getText().length() != 0)
        {
            Intent intent = new Intent(this, Album.class);
            startActivity(intent);
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Поля обязательны для заполнения!", Toast.LENGTH_SHORT);
            toast.show();
        }
}   }