package com.example.unnamed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	enum State {
		Activated, Deactivated
	}

	State state = State.Deactivated;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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

	public void de_activate(View view) {
		Button action_button = (Button) findViewById(R.id.de_activate);
		if (state == State.Activated) {
			action_button.setText(R.string.deactivate);
			state = State.Deactivated;
		}

		else {
			action_button.setText(R.string.activate);
			state = State.Activated;
		}
	}

	public void options(View view) {
		Intent intent = new Intent(this, OptionsActivity.class);
		startActivity(intent);
	}
}
