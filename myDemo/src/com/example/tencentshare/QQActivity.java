package com.example.tencentshare;

import com.example.tencentshare.QQShareManager.ShareContentWebpage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class QQActivity extends Activity {


	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
	
	public void qqZoneshare(View view){
		QQShareManager qm = QQShareManager.getInstance(this);
		ShareContentWebpage scw = qm.new ShareContentWebpage("标题", "内容", "http://www.baidu.com",
				"http://img3.cache.netease.com/photo/0005/2013-03-07/8PBKS8G400BV0005.jpg");
		qm.shareByQQ(scw, QQShareManager.QQ_SHARE_TYPE_ZONE);
	}
	
	public void qqshare(View view){
		QQShareManager qm = QQShareManager.getInstance(this);
		ShareContentWebpage scw = qm.new ShareContentWebpage("标题", "内容", "http://www.baidu.com",
				"http://img3.cache.netease.com/photo/0005/2013-03-07/8PBKS8G400BV0005.jpg");
		qm.shareByQQ(scw, QQShareManager.QQ_SHARE_TYPE_TALK);
	}
}
