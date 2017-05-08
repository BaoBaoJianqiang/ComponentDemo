package jianqiang.com.hotel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import jianqiang.com.mywholeapplication.R;
import jianqiang.com.train.TrainActivity;

public class HotelActivity extends Activity {
    Button btnTrain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);


        btnTrain = (Button)findViewById(R.id.btnTrain);
        btnTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HotelActivity.this, TrainActivity.class);
                intent.putExtra("trainId", 1);
                intent.putExtra("trainName", "和谐号");
                startActivity(intent);
            }
        });
    }
}
