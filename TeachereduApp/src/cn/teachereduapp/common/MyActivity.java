package cn.teachereduapp.common;

import net.tsz.afinal.FinalActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyActivity extends FinalActivity{
	public  void showToast(String strMsg){
		Toast.makeText(this, strMsg, 0).show();
	}
	public void _startActivity(Class<? extends Activity> clazz,Bundle b) {
		Intent intent = new Intent();
		intent.setClass(this, clazz);
		if (b!=null) {
			intent.putExtras(b);
		}
	    startActivity(intent);
	}
}
