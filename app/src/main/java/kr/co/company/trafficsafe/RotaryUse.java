package kr.co.company.trafficsafe;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class RotaryUse extends AppCompatActivity {
    ViewPager viewPager; //viewPager 생성

    int[] images = {R.drawable.rotary, R.drawable.rotary1, R.drawable.rotary2, R.drawable.rotary3, R.drawable.rotary4, R.drawable.rotary5, R.drawable.rotary6}; //R.drawable 안에있는 main1, main2, main3 이미지 가져옴
    MyViewPager myPagerAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rotaryuse);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        myPagerAdapter = new MyViewPager(RotaryUse.this, images);
        viewPager.setAdapter(myPagerAdapter);
    }

}
