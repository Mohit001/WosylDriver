package com.keshyam.wosyldriver.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import com.keshyam.wosyldriver.R;
import com.keshyam.wosyldriver.model.History;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Liger on 11/18/2015.
 */
public class UserHistoryListAdapter extends ArrayAdapter<History>
{
    private Context mContext;
    private ArrayList<History> arrayList;
    private LayoutInflater inflater;
    private int resourceid;

    public UserHistoryListAdapter(Context context, int resource, ArrayList<History> objects, LayoutInflater inflater)
    {
        super(context, resource, objects);

        mContext = context;
        resourceid = resource;
        arrayList = objects;
        this.inflater = inflater;
    }

    @Override
    public void add(History object)
    {
        super.add(object);
    }

    @Override
    public void addAll(Collection<? extends History> collection)
    {
        super.addAll(collection);
    }


    @Override
    public void clear()
    {
        super.clear();
    }

    @Override
    public void notifyDataSetChanged()
    {
        super.notifyDataSetChanged();
    }

    @Override
    public int getCount()
    {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder holder;
        if(convertView == null)
        {
            holder = new ViewHolder();
            convertView = inflater.inflate(resourceid, parent, false);
            holder.orderIDTextView = (TextView) convertView.findViewById(R.id.user_pending_listview_raw_orderid_content);
            holder.countTextView = (TextView) convertView.findViewById(R.id.user_pending_listview_raw_count_content);

            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.orderIDTextView.setText(getItem(position).getTitle());
        holder.countTextView.setText(getItem(position).getCount());
        return convertView;
    }


    private class ViewHolder
    {
        TextView orderIDTextView;
        TextView countTextView;

    }


    @Override
    public History getItem(int position)
    {
        return super.getItem(position);
    }

    @Override
    public int getPosition(History item)
    {
        return super.getPosition(item);
    }
}
