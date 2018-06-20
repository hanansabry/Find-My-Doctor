package com.hanan.and.udacity.meetyourdoctor.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Button;

import com.hanan.and.udacity.meetyourdoctor.R;

import static com.hanan.and.udacity.meetyourdoctor.utilities.Constants.EDIT_PROFILE;
import static com.hanan.and.udacity.meetyourdoctor.utilities.Constants.SIGNIN;
import static com.hanan.and.udacity.meetyourdoctor.utilities.Constants.SIGNUP;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //if the activity opened from edit_profile button, set the activity title to "Edit Profile"
        if(getIntent().getStringExtra(EDIT_PROFILE)!=null){
            getSupportActionBar().setTitle(getIntent().getStringExtra(EDIT_PROFILE));
            ((Button)findViewById(R.id.signup_button)).setText("Save");
        }else{
            getSupportActionBar().setTitle(SIGNUP);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            onBackPressed(); // close this activity and return to preview activity (if there is any)
        }
        return super.onOptionsItemSelected(item);
    }
}