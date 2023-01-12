package kr.co.company.trafficsafe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.viewpager.widget.PagerAdapter;

import java.util.Objects;

public class MyViewPager extends PagerAdapter {

    Context context; //context 생성
    int[] images;
    LayoutInflater layoutInflater;

    public MyViewPager(Context context, int[] images) {
        this.context = context;
        this.images = images;
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    /*항목을 표시하는 이미지 뷰를 생성하여 반환한다*/
    @Override
    public Object instantiateItem(ViewGroup container, final int poistion) {
        View itemView = layoutInflater.inflate(R.layout.item,container,false);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);
        imageView.setImageResource(images[poistion]);
        Objects.requireNonNull(container).addView(itemView); //컨테이너에 뷰를 추가함
        return itemView;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    } }


