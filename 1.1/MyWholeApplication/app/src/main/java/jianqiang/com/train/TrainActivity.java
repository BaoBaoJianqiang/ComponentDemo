package jianqiang.com.train;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import jianqiang.com.mywholeapplication.R;

public class TrainActivity extends Activity {

    TextView tvTrainName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train);

        Intent intent=getIntent();
        int trainId = intent.getIntExtra("trainId", 0);
        String trainName = intent.getStringExtra("trainName");

        tvTrainName = (TextView)findViewById(R.id.tvTrainName);
        tvTrainName.setText(trainName);
    }
}
