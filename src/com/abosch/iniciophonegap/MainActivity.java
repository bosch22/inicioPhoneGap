package com.abosch.iniciophonegap;

import android.os.Bundle;
import android.view.Menu;
import org.apache.cordova.*;

public class MainActivity extends DroidGap {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/www/index.html");
	}

	

}
