package com.example.fragmentsvideo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ListFrag.ItemSelected {

    private ListFrag listFrag;
    private DetailFrag detailFrag;

    ArrayList<String> descriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listFrag = new ListFrag();
        detailFrag = new DetailFrag();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.listFrag, listFrag)
                .replace(R.id.detailFrag, detailFrag)
                .commit();

        descriptions = new ArrayList<>();
        descriptions.add("Description for item 1");
        descriptions.add("Description for item 2");
        descriptions.add("Description for item 3");
    }
    @Override
    public void onItemSelected(int position) {
        detailFrag.updateAsSelected(descriptions, position);
    }
}
