package com.example.resourcesapp.ui.moreTools.sub;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.resourcesapp.R;
import com.example.resourcesapp.views.listingAdapter;
import com.example.resourcesapp.views.listingModel;

import java.util.ArrayList;

public class SketchingFragment extends Fragment {

    ArrayList<listingModel> lists;
    RecyclerView rv;
    listingAdapter adapter;

    public static SketchingFragment newInstance() {
        return new SketchingFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sketching, container, false);
        rv = view.findViewById(R.id.recyclerView_sketching);
        listings();
        return view;
    }

    public void listings(){
        lists =  new ArrayList<listingModel>();
/*        sample here
        lists.add(new listingModel("", "", ""));
*/

        lists.add(new listingModel("Responsive Sketchsheets", "offers responsive pre-design templates. These will automatically adapt their layout to any screen size and include neat features.", "https://zurb.com/playground/responsive-sketchsheets"));

        lists.add(new listingModel("Sketchsheets", "an open source project dedicated to providing free printable templates of the latest devices and platforms for wireframing designs.", "https://sketchsheets.com/"));

        lists.add(new listingModel("Sneakpeekit", "print note taking grids and devices frames.", "https://sneakpeekit.com/"));

        lists.add(new listingModel("Sketchize", "just choose any of the sketch sheets that fits your project, print it out and start to sketch your dream.", "https://sketchize.com/"));


        adapter = new listingAdapter(getContext(), lists);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(adapter);
    }


}