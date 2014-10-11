package com.example.tencentshare;

import java.io.File;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Environment;

public class QQShareUtil {
	private static final File qqSharePic = new File(Environment.getExternalStorageDirectory() + "/share/share.jpg");
	/**
	 * ªÒ»°Œ¢–≈AppId
	 * @param context
	 * @return
	 */
	public static String getQQAppId(Context context){
		try {
			ApplicationInfo appInfo = context.getPackageManager()
                     .getApplicationInfo(context.getPackageName(),
                     PackageManager.GET_META_DATA);
			return String.valueOf(appInfo.metaData.getInt("QQ_APP_ID"));
		} catch (NameNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
