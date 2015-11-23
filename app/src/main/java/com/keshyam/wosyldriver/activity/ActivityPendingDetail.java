package com.keshyam.wosyldriver.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.keshyam.wosyldriver.R;

/**
 * Created by Liger on 11/23/2015.
 */
public class ActivityPendingDetail extends Activity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        ((ImageView) findViewById(R.id.back_image_btn)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.back_image_btn:
                this.finish();
                break;
        }
    }
}
