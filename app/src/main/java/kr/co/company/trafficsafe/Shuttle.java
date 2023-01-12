package kr.co.company.trafficsafe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

/*  noticeActivity (공지사항 안내) */
public class Shuttle extends AppCompatActivity{

    @Override //현재 메소드가 부모 클래스의 메소드를 재정의 하였다는 공간
    public void onCreate(Bundle saveInstanceState) { //onCreate() 메소드는 엑티비티가 생성되는 순간 딱 한 번 호출
        super.onCreate(saveInstanceState); // 부모 클래스인 AppCompatActivity 클래스의 onCreate()를 호출하는 문장
        setContentView(R.layout.shuttle); //setContentView()는 액티비티의 화면을 설정하는 함수
        // notice.xml 액티비티 화면으로 하겠다는 의미
    }
    /*사용자가 버튼을 터치하면 호출된다*/
    public void setFrag1(View v) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        //사용자가 버튼을 누르면 fragment1 출력
        ft.replace(R.id.frame, new Fragment1(),"one");
        ft.commitAllowingStateLoss();
    }

    /*사용자가 버튼을 터치하면 호출된다*/
    public void setFrag2(View v) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        //사용자가 버튼을 누르면 fragment2 출력
        ft.replace(R.id.frame, new Fragment2(),"two");
        ft.commitAllowingStateLoss();
    }
}