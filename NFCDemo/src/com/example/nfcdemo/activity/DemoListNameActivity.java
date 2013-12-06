package com.example.nfcdemo.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

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
		 setListAdapter(new SimpleAdapter(this, getListValues(), android.R.layout.simple_list_item_2,
			        new String[] { IDemoNFC.NAME, IDemoNFC.DESC }, new int[] { android.R.id.text1,
			            android.R.id.text2 }));
	}
	private List<Map<String, String>> getListValues() {
	    List<Map<String, String>> values = new ArrayList<Map<String, String>>();
	    int length = mTitle.length;
	    for (int i = 0; i < length; i++) {
	      Map<String, String> v = new HashMap<String, String>();
	      v.put(IDemoNFC.NAME, mTitle[i]);
	      v.put(IDemoNFC.DESC, mDescription[i]);
	      values.add(v);
	    }
	    return values;
	  }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.demo_list_name, menu);
		return true;
	}
	
	 @Override
	  protected void onListItemClick(ListView l, View v, int position, long id) {
	    super.onListItemClick(l, v, position, id);
	    Intent intent = mNFC[position].execute(this);
	    startActivity(intent);
	  }

}
