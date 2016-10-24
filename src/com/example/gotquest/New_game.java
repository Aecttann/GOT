package com.example.gotquest;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class New_game extends Activity {
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_game);
		
//		EditText edit_for_user_name = (EditText) findViewById(R.id.editText1);
	//	String user_name = edit_for_user_name.getText().toString(); // приводим к типу String
		
		
		
		Button button_for_choosing_house = (Button) findViewById(R.id.button_1);
		button_for_choosing_house.getBackground().setAlpha(64);
		button_for_choosing_house.setOnClickListener(new OnClickListener()
		 {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setContentView(R.layout.new_game_2);
				
				
			}
		});
		
		Button button_for_stark_house = (Button) findViewById(R.id.buttonS);
		
		button_for_stark_house.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setContentView(R.layout.new_game);
				}
		});
	}
		
		
		/*
		button_for_choosing_house.setOnClickListener(new OnClickListener()
				{
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						setContentView(R.layout.new_game_2);
					}
					
				});*/
		//TextView text_view_for_house_choosing = (TextView) findViewById(R.id.textView1);
		/*
		String text_view_for_house_choosing_memory = text_view_for_house_choosing.getText().toString();
		String text_view_for_house_choosing_all_in_one = text_view_for_house_choosing_memory + user_name;
		*/
		//text_view_for_house_choosing.setText(text_view_for_house_choosing.getText() + user_name);
		/*
		TextView text_view_for_start_speech = (TextView) findViewById(R.id.textView1);
		text_view_for_start_speech.setTextScaleX((float) 20.1 );
		*/
		
		
		
		/*
		Drawable d = getResources().getDrawable(R.drawable.ic_launcher);
		button_for_stark_house.setBackgroundResource(R.drawable.stark);
		button_for_stark_house.setBackgroundDrawable(d);
		*/
			/*
		button_for_stark_house.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setContentView(R.layout.stark);
				}
});
}*/
}