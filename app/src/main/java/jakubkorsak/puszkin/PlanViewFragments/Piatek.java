package jakubkorsak.puszkin.PlanViewFragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jakubkorsak.puszkin.R;

/**
 * Created by jakub on 11.01.17.
 */

public class Piatek extends Fragment {


    public static Piatek newInstance(int index){
        Piatek p = new Piatek();
        Bundle args = new Bundle();
        args.putInt("index", index);
        p.setArguments(args);

        return p;
    }
    public int getShownIndex() {
        return getArguments().getInt("index", 0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_plan_view, container, false);
    }
}
