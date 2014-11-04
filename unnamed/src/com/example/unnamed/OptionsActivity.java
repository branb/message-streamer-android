package com.example.unnamed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class OptionsActivity extends Activity {

	enum SMS_State {
		Activated, Deactivated
	}

	SMS_State sms = SMS_State.Deactivated;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_options);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.options, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void contacts(View view) {
		View b = findViewById(R.id.checkBox6);
		View c = findViewById(R.id.checkBox7);
		if (sms == SMS_State.Deactivated) {
			b.setVisibility(View.VISIBLE);
			c.setVisibility(View.VISIBLE);
			sms = SMS_State.Activated;
		}
		else if (sms == SMS_State.Activated) {
			b.setVisibility(View.GONE);
			c.setVisibility(View.GONE);
			sms = SMS_State.Deactivated;
		}
		
	}
}
