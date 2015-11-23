package com.keshyam.wosyldriver.model;

/**
 * Created by Mohit on 20-Nov-15.
 */
public class History
{
    // use for pending list, historydate list, History/date order list
    String title;
    String count;

    @Override
    public String toString()
    {
        return "History{" +
                "title='" + title + '\'' +
                ", count='" + count + '\'' +
                '}';
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getCount()
    {
        return count;
    }

    public void setCount(String count)
    {
        this.count = count;
    }
}
