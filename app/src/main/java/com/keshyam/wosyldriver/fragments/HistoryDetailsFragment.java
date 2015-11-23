package com.keshyam.wosyldriver.fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.keshyam.wosyldriver.R;

/**
 * Created by Liger on 11/19/2015.
 */
public class HistoryDetailsFragment extends Fragment implements View.OnClickListener
{
    public static String TAG = HistoryDetailsFragment.class.getSimpleName();

    ImageView backImageView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.history_details_fragment, container, false);
        backImageView = (ImageView) rootView.findViewById(R.id.back_image_btn);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        backImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {

        switch (v.getId())
        {
            case R.id.back_image_btn:
                getActivity().finish();
                break;

        }
    }
}
