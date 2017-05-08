package jianqiang.com.trainmodule;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import jianqiang.com.mylibrary.activity.BaseActivity;

public class TrainActivity extends BaseActivity {

    TextView tvTrainName;
    int trainId;
    String trainName;

    @Override
    protected void initVariables() {
        Intent intent=getIntent();
        trainId = intent.getIntExtra("trainId", 0);
        trainName = intent.getStringExtra("trainName");
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        setContentView(R.layout.activity_train);

        tvTrainName = (TextView)findViewById(R.id.tvTrainName);
        tvTrainName.setText(trainName);
    }

    @Override
    protected void loadData() {

    }
}
