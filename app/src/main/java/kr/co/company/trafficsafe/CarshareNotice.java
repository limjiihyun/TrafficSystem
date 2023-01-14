package kr.co.company.trafficsafe;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class CarshareNotice extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carsharnotice);

    }
    public void next(View v){
        Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(CarshareNotice.this, Rule.class);
                startActivity(intent);//명시적 인텐트 사용하여 Activity1을 시작
            }
        });
    }

}
