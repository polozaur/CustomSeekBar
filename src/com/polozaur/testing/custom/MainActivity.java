package com.polozaur.testing.custom;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	SeekBar mainSeekbar;
	TextView progressTextView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(LayoutParams.FLAG_FULLSCREEN,
				LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		
		progressTextView = (TextView) findViewById(R.id.progressTextView);
		mainSeekbar = (SeekBar) findViewById(R.id.mainSeekBar);
		mainSeekbar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			public void onStopTrackingTouch(SeekBar seekBar) {
				//TO DO something fancy here
			}
			
			public void onStartTrackingTouch(SeekBar seekBar) {
				//TO DO something fancy here
			}
			
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				progressTextView.setText(String.valueOf(progress) + '%');
			}
		});
		
	}

}
