package com.example.svaswani.csh_automation_android;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nick on 2/23/16.
 */
public class GatekeeperFragment extends Fragment {

    private TextView mExampleView;

    public GatekeeperFragment() {

        mExampleView = new TextView(getContext());
        mExampleView.setText("Hello, Gatekeeper!");
    }

    /**
     * Define how this fragment should appear when it's rendered.
     * @return The view of this fragment.
     */
    @Nullable
    @Override
    public View getView() {
        return mExampleView;
    }
}
