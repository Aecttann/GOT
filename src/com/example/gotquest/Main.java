package com.example.gotquest;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.Window;
import android.view.WindowManager;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;

public class Main extends ActionBarActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/*
		 * Но вообще так можно!
		setContentView(R.layout.splash);
		SystemClock.sleep(2000);
		*/
		setContentView(R.layout.main);
		/*
		 *Убирает название приложения из шапки.
		 * */
		getSupportActionBar().hide();
		MediaPlayer mp_for_starting_main_theme_in_main_menu = MediaPlayer.create(Main.this, R.raw.main_theme);
//		MediaPlayer mp_for_buttons_click = MediaPlayer.create(Main.this, R.raw.main_theme);
		mp_for_starting_main_theme_in_main_menu.start();
		mp_for_starting_main_theme_in_main_menu.setLooping(true);
		Button button_for_new_game = (Button) findViewById(R.id.button1);
		button_for_new_game.setOnClickListener(new OnClickListener()
		 {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_for_new_game = new Intent (Main.this, New_game.class);
				startActivity(intent_for_new_game);
				
				
			}
		});
		Button button_for_settings = (Button) findViewById(R.id.button3);
		button_for_settings.setOnClickListener(new OnClickListener()
		 {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
			}
		});
		Button button_for_exit = (Button) findViewById(R.id.button5);
		button_for_exit.setOnClickListener(new OnClickListener()
		 {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

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
}