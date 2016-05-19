package com.coolweather.app.util;

/**
 * Created by LG on 2016/5/19 0019.
 */
public interface HttpCallbackListener {

	void onFinish(String response);

	void onError(Exception e);

}
