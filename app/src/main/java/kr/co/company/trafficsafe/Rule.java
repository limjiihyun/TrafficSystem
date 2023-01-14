package kr.co.company.trafficsafe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class Rule extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carsharenotice);

    }
    public void sure(View v){
        Button b=(Button)findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(Rule.this, Rule2.class);
                startActivity(intent);//명시적 인텐트 사용하여 Activity1을 시작
            }
        });
    }

}