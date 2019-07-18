package com.example.horizontalrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<String> mNames = new ArrayList<>();
    ArrayList<String> mImageUrls = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initImageUrls();
    }
    private void initImageUrls() {
        mImageUrls.add("https://i.redd.it/9c5xhav3rya31.png");
        mNames.add("Night Images1");
        mImageUrls.add("https://preview.redd.it/xgbfgjefpza31.jpg?width=640&crop=smart&auto=webp&s=af837edf274fd7648c24493750e1bd346aafe785");
        mNames.add("Night Images2");
        mImageUrls.add("https://external-preview.redd.it/br4af4yuPWFv2cylwh7iqvgxgjp9UBo0MsjBk0RLGYM.jpg?auto=webp&s=7f3401b995d69047b88ce329553b16aa5d8d415d");
        mNames.add("Night Images3");
        mImageUrls.add("https://i.redd.it/9c5xhav3rya31.png");
        mNames.add("Night Images4");
        mImageUrls.add("https://i.redd.it/6u11x3p35za31.jpg");
        mNames.add("Night Images5");
        mImageUrls.add("https://preview.redd.it/xgbfgjefpza31.jpg?width=640&crop=smart&auto=webp&s=af837edf274fd7648c24493750e1bd346aafe785");
        mNames.add("Night Images6");
        mImageUrls.add("https://i.redd.it/9c5xhav3rya31.png");
        mNames.add("Night Images7");
        initRecyclerView();
    }

    private void initRecyclerView(){

        RecyclerView  recyclerLayoutView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls);
        recyclerLayoutView.setAdapter(adapter);
        recyclerLayoutView.setLayoutManager(layoutManager);
    }

}
