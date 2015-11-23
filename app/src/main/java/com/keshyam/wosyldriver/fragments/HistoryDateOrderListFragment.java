package com.keshyam.wosyldriver.fragments;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


import com.keshyam.wosyldriver.R;
import com.keshyam.wosyldriver.adapters.UserHistoryListAdapter;
import com.keshyam.wosyldriver.model.History;

import java.util.ArrayList;

/**
 * Created by Liger on 11/18/2015.
 */
public class HistoryDateOrderListFragment extends Fragment implements AdapterView.OnItemClickListener
{
    public static String TAG = HistoryDateOrderListFragment.class.getSimpleName();
    private ArrayList<History> arrayList;
    private ListView pendingListView;
    private UserHistoryListAdapter adapter;
    private Context mContext;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fragment_pending_list, container, false);
        pendingListView = (ListView) rootView.findViewById(R.id.user_pending_listview);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        mContext = getActivity();
        pendingListView.setOnItemClickListener(this);
        new GetPendingRequestAsync().execute();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
//        Utility.showAlertMessage(mContext, "order "+position+" clicked");
//        startActivity(new Intent(getActivity(), ActivityUserHistory.class));
    }

    private class GetPendingRequestAsync extends AsyncTask<Void, Void, String>
    {
        @Override
        protected void onPreExecute()
        {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(Void... params)
        {
            return null;
        }

        @Override
        protected void onPostExecute(String s)
        {
            super.onPostExecute(s);

            if(isCancelled())
            {
                return;
            }

            arrayList = new ArrayList<>();
            History history;
            for(int i=0; i<5; i++)
            {
                history = new History();
                history.setTitle("datetime"+i);
                history.setCount(""+i);
                arrayList.add(history);
            }

            adapter = new UserHistoryListAdapter(mContext, R.layout.user_pending_listview_raw, arrayList, getActivity().getLayoutInflater());
            pendingListView.setAdapter(adapter);

        }


    }
}
