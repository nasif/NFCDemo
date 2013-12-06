package com.example.nfcdemo.activty;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;

import com.example.nfcdemo.IDemoNFC;
import com.example.nfcdemo.NFCBeamDemo;
import com.example.nfcdemo.NFCTagDemo;
import com.example.nfcdemo.R;

public class DemoListNameActivity extends ListActivity {


	private IDemoNFC[] mNFC = new IDemoNFC[] { new NFCBeamDemo(),new NFCTagDemo()};
	private String[] mTitle;
	private String[] mDescription;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		int length=mNFC.length;
		mTitle=new String[length];
		mDescription=new String[length];
		for (int i = 0; i < mNFC.length; i++) {
			mTitle[i] = mNFC[i].getName();
			mDescription[i] = mNFC[i].getDesc();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.demo_list_name, menu);
		return true;
	}

}
