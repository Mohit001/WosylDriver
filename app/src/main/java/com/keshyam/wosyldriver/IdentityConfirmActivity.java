package com.keshyam.wosyldriver;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.keshyam.wosyldriver.activity.MainActivity;

/**
 * Created by Liger on 11/22/2015.
 */
public class IdentityConfirmActivity extends Activity implements View.OnClickListener
{
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity_confirm);

        mContext = this;

        ((Button) findViewById(R.id.go_online_btn)).setOnClickListener(this);
        ((TextView) findViewById(R.id.notu_lbl)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.go_online_btn:
//                Utility.showAlertMessage(mContext, "Go online");

                startActivity(new Intent(this, MainActivity.class));
                this.finish();

                break;
            case R.id.notu_lbl:
//                Utility.showAlertMessage(mContext, "Not U");

                //do code to Logout in background and redirect to login screen
                startActivity(new Intent(mContext, LoginActivity.class));
                IdentityConfirmActivity.this.finish();
                break;
        }
    }
}
