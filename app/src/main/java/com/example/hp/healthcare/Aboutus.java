package com.example.hp.healthcare;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Aboutus extends AppCompatActivity {

    private ViewPager nSlideViewPager;
    private LinearLayout nDotLayout;
    private SliderAdapter sliderAdapter;
    private TextView[] ndots;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        nSlideViewPager=(ViewPager)findViewById(R.id.slide);
        nDotLayout=(LinearLayout)findViewById(R.id.dotlayout);
        sliderAdapter=new SliderAdapter(this);
        nSlideViewPager.setAdapter(sliderAdapter);
        addDotsIndicator(0);
        nSlideViewPager.addOnPageChangeListener(viewlistener);
    }


    public void addDotsIndicator(int position){
        ndots=new TextView[3];
        for(int i=0;i<ndots.length;i++){
            ndots[i]=new TextView(this);
            ndots[i].setText(Html.fromHtml ("&#8226;"));
            ndots[i].setTextSize(35);
            ndots[i].setTextColor(getResources().getColor(R.color.transparentewhite));

            nDotLayout.addView(ndots[i]);
        }


        if(ndots.length>0)
        {ndots[position].setTextColor(getResources().getColor(R.color.white));}



    }

    ViewPager.OnPageChangeListener viewlistener=new ViewPager.OnPageChangeListener(){

        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };



}
