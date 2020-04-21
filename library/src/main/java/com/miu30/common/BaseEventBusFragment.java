package com.miu30.common;

import android.os.Bundle;

import org.simple.eventbus.EventBus;

public abstract class BaseEventBusFragment extends BaseFragment {


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		EventBus.getDefault().register(this);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		EventBus.getDefault().unregister(this);
	}

}
