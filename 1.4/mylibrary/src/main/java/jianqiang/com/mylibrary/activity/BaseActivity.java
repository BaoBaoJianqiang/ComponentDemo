package jianqiang.com.mylibrary.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public abstract class BaseActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		initVariables();
		initViews(savedInstanceState);
		loadData();
	}

	protected abstract void initVariables();

	protected abstract void initViews(Bundle savedInstanceState);

	protected abstract void loadData();

	public void navigateTo(final String activityName,
						   final Intent intent) {

		Class<?> clazz = null;
		try {
			clazz = Class.forName(activityName);
			if (clazz != null) {
				intent.setClass(this, clazz);
				this.startActivity(intent);
			}
		} catch (final ClassNotFoundException e) {
			return;
		}
	}
}