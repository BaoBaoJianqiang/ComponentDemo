package jianqiang.com.hotelmodule;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import jianqiang.com.mylibrary.activity.BaseActivity;
import jianqiang.com.mylibrary.utils.Utils;

public class HotelActivity extends BaseActivity {
    Button btnTrain;

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        setContentView(R.layout.activity_hotel);

        btnTrain = (Button)findViewById(R.id.btnTrain);
        btnTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("trainId", 1);
                intent.putExtra("trainName", "和谐号");
                navigateTo(HotelActivityNameConstants.TrainActivity, intent);
            }
        });
    }

    @Override
    protected void loadData() {
        int a = Utils.sum(1,2);
    }
}
