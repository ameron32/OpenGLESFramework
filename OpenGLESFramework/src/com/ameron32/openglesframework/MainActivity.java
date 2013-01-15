package com.ameron32.openglesframework;

import android.os.Bundle;

import android.app.Activity;
import android.view.Menu;
import android.opengl.GLSurfaceView;

public class MainActivity extends Activity {

	GLSurfaceView glSurface;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		glSurface = new GLSurfaceView(this);		
		setContentView(glSurface);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
