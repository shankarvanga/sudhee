package com.example.sudhee;

import com.cbit.sudhee.R;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class About extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		ImageButton gmail=(ImageButton)findViewById(R.id.g);
		ImageButton gitHub=(ImageButton)findViewById(R.id.gith);
		gmail.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
			            "mailto","shankarvanga95gmail.com", null));
			emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Hi Tecstasy2K15");
			emailIntent.putExtra(Intent.EXTRA_TEXT, "Hi");
			startActivity(Intent.createChooser(emailIntent, "Send email..."));
				
				
			}
		});
		gitHub.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse("http://www.github.com/vjnikhil1"));
				startActivity(i);
				
			}
		});			
	}

}