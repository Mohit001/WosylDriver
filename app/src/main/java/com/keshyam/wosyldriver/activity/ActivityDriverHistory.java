package com.keshyam.wosyldriver.activity;

import android.app.Activity;
import android.os.Bundle;

import com.keshyam.wosyldriver.R;
import com.keshyam.wosyldriver.fragments.HistoryDetailsFragment;

/**
 * Created by Liger on 11/19/2015.
 */
public class ActivityDriverHistory extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        getFragmentManager()
                .beginTransaction()
                .replace(R.id.content_frame, new HistoryDetailsFragment(), HistoryDetailsFragment.TAG)
                .commit();
    }
}
