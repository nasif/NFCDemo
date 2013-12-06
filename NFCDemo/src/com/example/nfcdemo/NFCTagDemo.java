package com.example.nfcdemo;

import com.example.nfcdemo.activity.BeamDemoActivity;
import com.example.nfcdemo.activity.NFCTagDemoActivity;

import android.content.Context;
import android.content.Intent;

public class NFCTagDemo extends AbstractDemoNFC {

	@Override
	public String getName() {
		return "Demo for Showing NFC TAG";
	}

	@Override
	public String getDesc() {
		return "This Demo will describe read from and write to NFC Tags and can do necessary action based on nfc content";
	}

	@Override
	public Intent execute(Context context) {
		// TODO Auto-generated method stub
		return new Intent(context, NFCTagDemoActivity.class);
	}

}
