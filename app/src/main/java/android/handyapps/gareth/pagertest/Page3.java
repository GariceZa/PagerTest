package android.handyapps.gareth.pagertest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Gareth on 2014-12-03.
 */
public class Page3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (inflater.inflate(R.layout.fragment_page_three,container,false));
    }

}
