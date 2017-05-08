package jianqiang.com.mywholeapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import jianqiang.com.ActivityNameConstants;
import jianqiang.com.mylibrary.activity.BaseActivity;
import jianqiang.com.mylibrary.utils.Utils;

public class MainActivity extends BaseActivity {

    Button btnHotel;
    Button btnTrain;

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);

        btnHotel = (Button)findViewById(R.id.btnHotel);
        btnHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                navigateTo(ActivityNameConstants.HotelActivity, intent);
            }
        });

        btnTrain = (Button)findViewById(R.id.btnTrain);
        btnTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                navigateTo(ActivityNameConstants.TrainActivity, intent);
            }
        });
    }

    @Override
    protected void loadData() {
        int a = Utils.sum(1,2);
    }
}
