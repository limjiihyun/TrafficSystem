package kr.co.company.trafficsafe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void introduce(View view){
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("이 앱은 한받대 인근 교통 환경을 사용하는 사용자에게 더 안전하고 편리한 교통서비스를 제공하기 위해 제작된 한밭대 교통관리 시스템 알림 서비스 입니다.");
        //밭맛소를 소개하는 알림 기능사용
        alertDialogBuilder.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "닫기",Toast.LENGTH_LONG).show();
            }//닫기 버튼을 누르면 방송 수신자로 "닫기"가 화면 하단에 출력됨.
        });
        AlertDialog alertDialog=alertDialogBuilder.create();
        alertDialog.show();
    }
    public void rotarystart(View v){
        Button b=(Button)findViewById(R.id.rotarystart_button);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this, RotaryUse.class);
                startActivity(intent);//명시적 인텐트 사용하여 Activity1을 시작
            }
        });
    }
    public void carshare(View v){
        Button b=(Button)findViewById(R.id.carshare_button);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);//명시적 인텐트 사용하여 Activity1을 시작
            }
        });
    }
    public void park_button(View v){
        Button b=(Button)findViewById(R.id.park_button);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this, ParkingBehind.class);
                startActivity(intent);//명시적 인텐트 사용하여 Activity1을 시작
            }
        });
    }
    public void shuttle_button(View v){
        Button b=(Button)findViewById(R.id.shuttle_button);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this, Shuttle.class);
                startActivity(intent);//명시적 인텐트 사용하여 Activity1을 시작
            }
        });
    }
}