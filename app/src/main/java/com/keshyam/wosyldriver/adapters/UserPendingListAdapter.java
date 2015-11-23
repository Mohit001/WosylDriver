package com.keshyam.wosyldriver.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.keshyam.wosyldriver.R;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Liger on 11/18/2015.
 */
public class UserPendingListAdapter extends ArrayAdapter<String>
{
    private Context mContext;
    private ArrayList<String> arrayList;
    private LayoutInflater inflater;
    private int resourceid;

    public UserPendingListAdapter(Context context, int resource, ArrayList<String> objects, LayoutInflater inflater)
    {
        super(context, resource, objects);

        mContext = context;
        resourceid = resource;
        arrayList = objects;
        this.inflater = inflater;
    }

    @Override
    public void add(String object)
    {
        super.add(object);
    }

    @Override
    public void addAll(Collection<? extends String> collection)
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

            convertView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.orderIDTextView.setText("Order ID : " + getItem(position));
        return convertView;
    }


    private class ViewHolder
    {
        TextView orderIDTextView;
    }


    @Override
    public String getItem(int position)
    {
        return super.getItem(position);
    }

    @Override
    public int getPosition(String item)
    {
        return super.getPosition(item);
    }
}
