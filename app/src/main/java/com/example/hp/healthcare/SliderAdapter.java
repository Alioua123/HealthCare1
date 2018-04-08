package com.example.hp.healthcare;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by HP on 28/03/2018.
 */

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
    this.context=context;
       }

       public int[] slide_images={R.mipmap.healthcare,R.mipmap.medic,R.mipmap.doct1};
    public String[] slide_heading={"HealthCare","Meds Management","Take care"};
    public String [] description={"is free medicine reminder app which helps you organise your medicines and " +
            "your infants and elderly parents who are dependent on you for their well being.The more information you provide for your profile, medicines and health conditions the more HealthCare" +
            " can help you take control of your medicines and your health."
            ,"is for you to remind you to take the pills, supplements, and vitamins, and stay safe with your medicines." +
            "It let you add, remove, update your medications list and reminds you to take each one in time.",
            "helps to track your Medication Schedule, Medical History and Healthy Living and helps you to take care of health and well being of you and your loved " +
            "ones for free by storing informations related to your " +
            "care"};


    @Override
    public int getCount() {
        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==(RelativeLayout)object;


    }

    public Object instantiateItem(ViewGroup container,int position)
    {
        layoutInflater= (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slide_layout,container,false);
        ImageView slideImageView=(ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading=(TextView) view.findViewById(R.id.slide_heading);
        TextView slideDescription=(TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_heading[position]);
        slideDescription.setText(description[position]);
        container.addView(view);
        return view;
    }


public void destroyItem(ViewGroup container,int position,Object object)

{
    container.removeView((RelativeLayout)object);
}










}
