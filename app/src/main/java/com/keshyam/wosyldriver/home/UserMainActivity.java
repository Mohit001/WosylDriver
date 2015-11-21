package com.keshyam.wosyldriver.home;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.keshyam.wosyldriver.R;
import com.keshyam.wosyldriver.util.Utility;

import cn.tovi.CustomMenu;

public class UserMainActivity extends Activity implements View.OnClickListener
{
    private static final String TAG = UserMainActivity.class.getSimpleName();

    CustomMenu customMenu;

    ImageView leftMenuImageView, currantLocationImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        Window window = getWindow();
        window.setFlags(
                WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION,
                WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        customMenu = new CustomMenu(this);
        customMenu.setContentView(R.layout.home_activity);
        setContentView(customMenu);

        customMenu.setLeftShadow(R.drawable.shadow_left);
        customMenu.setLeftMenu(R.layout.left_menu);


        ((ImageView) findViewById(R.id.left_menu)).setOnClickListener(this);
        ((TextView) findViewById(R.id.home_lbl)).setOnClickListener(this);
        ((TextView) findViewById(R.id.pending_lbl)).setOnClickListener(this);
        ((TextView) findViewById(R.id.complected_lbl)).setOnClickListener(this);
        ((TextView) findViewById(R.id.setting_lbl)).setOnClickListener(this);
        ((TextView) findViewById(R.id.logout_lbl)).setOnClickListener(this);

        /*getFragmentManager()
                .beginTransaction()
                .replace(R.id.content_frame, new UserNewRideFragment(), UserNewRideFragment.TAG)
                .commit();*/

    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.left_menu:
//                Utility.showAlertMessage(this, "Left Menu click");
                leftMenu();
                break;

            case R.id.home_lbl:
//                Utility.showAlertMessage(this, "home click");
                /*if(getFragmentManager().findFragmentByTag(UserNewRideFragment.TAG) == null)
                {

                    getFragmentManager()
                            .beginTransaction()
                            .replace(R.id.content_frame, new UserNewRideFragment(), UserNewRideFragment.TAG)
                            .commit();
                }
                customMenu.closeMenu();*/
                break;
            case R.id.pending_lbl:
//                Utility.showAlertMessage(this, "pending click");
                /*getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content_frame, new PendingListFragment(), PendingListFragment.TAG)
                        .commit();*/
                customMenu.closeMenu();
                break;

            case R.id.complected_lbl:
//                Utility.showAlertMessage(this, "pending click");
                /*getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.content_frame, new HistoryDateListFragment(), HistoryDateListFragment.TAG)
                        .commit();
                customMenu.closeMenu();*/
                break;

            case R.id.setting_lbl:
                Utility.showAlertMessage(this, "setting click");
                customMenu.closeMenu();
                break;
            case R.id.logout_lbl:
                Utility.showAlertMessage(this, "logout click");
                customMenu.closeMenu();
                break;

        }
    }

    private void leftMenu()
    {
        if (customMenu.getState() == CustomMenu.State.CLOSE_MENU)
        {
            customMenu.openLeftMenuIfPossible();
        } else if (customMenu.getState() == CustomMenu.State.LEFT_MENU_OPENS)
        {
            customMenu.closeMenu();
        } else
        {
            Log.e(TAG, "CustomMenu State:" + customMenu.getState());
        }
    }
}
