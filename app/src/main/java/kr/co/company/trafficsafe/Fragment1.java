package kr.co.company.trafficsafe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.fragment.app.Fragment;

/*애플리케이션 안에서 프래그먼트를 생성하려면, Activity 클래스에서와 마찬가지로, Fragment 클래스를 상속받은 후에 핵심적인
 * 수명주기 메소드들을 재정의하면서 필요한 코드 추가하면 됨*/
public class Fragment1 extends Fragment {

    public Fragment1() {   }

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
    }

    /*프래그먼트는 onCreateView() 콜백 메소드를 이용해 레이아웃 설정함*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState) {
        return inflater.inflate(R.layout.fragment1,container,false);
    }
}