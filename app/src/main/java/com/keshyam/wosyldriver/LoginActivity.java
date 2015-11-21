package com.keshyam.wosyldriver;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.keshyam.wosyldriver.util.Utility;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        findViewById(R.id.login_btn).setOnClickListener(this);
        findViewById(R.id.create_account).setOnClickListener(this);
        findViewById(R.id.need_help).setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.login_btn:
                Utility.showAlertMessage(this, "Login clicked");
                startActivity(new Intent(this, IdentityConfirmActivity.class));
                LoginActivity.this.finish();
                break;

            case R.id.create_account:
                Utility.showAlertMessage(this, "Create Account clicked");
//                startActivity(new Intent(this, UserSignupActivity.class));
                break;

            case R.id.need_help:
                Utility.showAlertMessage(this, "Help clicked");
                break;
        }
    }
}
