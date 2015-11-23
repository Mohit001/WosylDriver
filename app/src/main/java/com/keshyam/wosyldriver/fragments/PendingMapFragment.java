package com.keshyam.wosyldriver.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.keshyam.wosyldriver.R;
import com.keshyam.wosyldriver.util.Utility;

/**
 * Created by Liger on 11/23/2015.
 */
public class PendingMapFragment extends Fragment implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener
{
    public static String TAG = PendingMapFragment.class.getSimpleName();
    private MapFragment mapFragment;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_map, container, false);
        mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.gmap);

        return rootView;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        mapFragment.getMapAsync(this);
        mapFragment.getMap().setOnMarkerClickListener(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap)
    {
        // Add a marker in Sydney, Australia, and move the camera.
        LatLng sydney = new LatLng(-34, 151);
        Marker marker = googleMap.addMarker(new MarkerOptions().position(sydney).title("Markerdemo"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

    }

    @Override
    public boolean onMarkerClick(Marker marker)
    {
        Utility.showAlertMessage(getActivity(), "marker clicked");
        return false;
    }
}
