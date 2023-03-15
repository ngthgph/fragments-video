package com.example.fragmentsvideo;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import java.util.ArrayList;

public class ListFrag extends ListFragment {


    ItemSelected activity;

    public interface ItemSelected {
        void onItemSelected(int index);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity = (ItemSelected) context;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayList<String> data = new ArrayList<>();
        data.add("1. This is item 1");
        data.add("1. This is item 2");
        data.add("1. This is item 3");

        setListAdapter(new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, data));
        //activity.onItemSelected(0);
        // cho nay chua khoi tao dc fragment bn da goi nen no loi
    }


    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        activity.onItemSelected(position);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        activity = null;
    }
}