package com.blueserial;

import android.app.Application;

public class Global extends Application {
	private byte plantType = 0;
	
	public byte get_plantType() {
		return plantType;
	}
	
	public void set_plantType(byte plantType) {
		this.plantType = plantType;
	}
}
