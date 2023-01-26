package kr.co.company.trafficsafe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

/*  informationActivity (도서관 층수 안내) */
public class ParkingBehind extends AppCompatActivity {

    RadioGroup radioGroup,radioGroup2; //radioGroup 생성
    RadioButton rbtn1, rbtn2, rbtn3, rbtn4, rbtn5, rbtn6, rbtn7;
    Button btn1; //btn1 생성
    ImageView image; //image 생성

    @Override  //현재 메소드가 부모 클래스의 메소드를 재정의 하였다는 공간
    protected void onCreate(Bundle savedInstanceState) { //onCreate() 메소드는 엑티비티가 생성되는 순간 딱 한 번 호출
        super.onCreate(savedInstanceState); // 부모 클래스인 AppCompatActivity 클래스의 onCreate()를 호출하는 문장
        setContentView(R.layout.parkingbehind); //setContentView()는 액티비티의 화면을 설정하는 함수
        // information.xml 액티비티 화면으로 하겠다는 의미

        /* findViewById(R.id.선언) = findViewBy 메소드는 id 값을 이용해 특정 뷰를 받아오는 메소드
        Id를 R클래스에서 받아온 것을 의미, 이벤트 처리가 가능한 메소드를 지원*/
        radioGroup = findViewById(R.id.radiogroup);
        rbtn1 = findViewById(R.id.rbtn1);
        rbtn2 = findViewById(R.id.rbtn2);
        rbtn3 = findViewById(R.id.rbtn3);
        rbtn4 = findViewById(R.id.rbtn4);
        rbtn5 = findViewById(R.id.rbtn5);
        rbtn6 = findViewById(R.id.rbtn6);
        rbtn7 = findViewById(R.id.rbtn7);
        btn1 = findViewById(R.id.btn1);
        image = findViewById(R.id.imageView1);

        btn1.setOnClickListener(new View.OnClickListener() {
            /*사용자가 버튼을 터치하면 호출된다*/
            public void onClick(View arg0) {

                switch (radioGroup.getCheckedRadioButtonId()) {
                    case R.id.rbtn1: //switch 문을 사용해 rbtn1버튼을 누르면 도서관 1층 사진 출력
                        image.setImageResource(R.drawable.schoolfull);
                        break;
                    case R.id.rbtn2: //switch 문을 사용해 rbtn2버튼을 누르면 도서관 2층 사진 출력
                        image.setImageResource(R.drawable.park1);
                        break;
                    case R.id.rbtn3: //switch문을 사용해 rbtn3버튼을 누르면 도서관 3층 사진 출력
                        image.setImageResource(R.drawable.park2);
                        break;
                    case R.id.rbtn4: //switch문을 사용해 rbtn4버튼을 누르면 도서관 4층 사진 출력
                        image.setImageResource(R.drawable.park3);
                        break;
                    case R.id.rbtn5: //switch문을 사용해 rbtn4버튼을 누르면 도서관 4층 사진 출력
                        image.setImageResource(R.drawable.outside2);
                        break;
                    case R.id.rbtn6: //switch문을 사용해 rbtn4버튼을 누르면 도서관 4층 사진 출력
                        image.setImageResource(R.drawable.outside3);
                        break;
                    case R.id.rbtn7: //switch문을 사용해 rbtn4버튼을 누르면 도서관 4층 사진 출력
                        image.setImageResource(R.drawable.park5);
                        break;

                }
            }
        });
    }
}