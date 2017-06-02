package com.tc2r.bartsimpson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Tc2r.
 * <p>
 * Bart Simpson School Punishment:
 * Skinner is upset at Bart Simpson again.
 *
 * He must Write lines on the chalk board 500 times!
 *
 *
 * What he doesn't know is Bart has been taking
 * Java Classes
 */
public class MainActivity extends AppCompatActivity {

	public void bartSimpson(){

		int count;

		for(count=1; count < 500; count++)
		{
			Toast.makeText(getApplicationContext(), "I will not write throw paper airplanes in class.", Toast.LENGTH_LONG).show();
		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		bartSimpson();
	}
}
