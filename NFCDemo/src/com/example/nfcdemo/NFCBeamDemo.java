package com.example.nfcdemo;

import com.example.nfcdemo.activity.BeamDemoActivity;
import com.example.nfcdemo.activity.NFCTagDemoActivity;

import android.content.Context;
import android.content.Intent;


public class NFCBeamDemo extends AbstractDemoNFC {

	@Override
	public String getName() {
		return "Demo for Showing NFC Beam";
	}

	@Override
	public String getDesc() {
		return "By using NFC beam we can ransfer data from one NFC compatible devices to another";
	}

	@Override
	public Intent execute(Context context) {
		// TODO Auto-generated method stub
		return new Intent(context, BeamDemoActivity.class);
	}

}
