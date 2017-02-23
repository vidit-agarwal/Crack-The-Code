package crackthecode.game;

import crackthecode.game.three.MyCountDownTimer;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class eight extends Activity 
{
	
	
	EditText e7;
	Button b8;
	private CountDownTimer countDownTimer;
	private boolean timerHasStarted = false;
	public TextView text7;
	private final long startTime = 30 * 1000;
	private final long interval = 1 * 1000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eight);
		
		e7=(EditText)findViewById(R.id.editText8);
		b8=(Button)findViewById(R.id.button8);
		text7=(TextView)findViewById(R.id.timer7);
		countDownTimer = new MyCountDownTimer(startTime, interval);
		//text7.setBackgroundColor(Color.YELLOW);
		
		Typeface font8 = Typeface.createFromAsset(getAssets(), "Courneuf-Regular.ttf");
		text7.setTextColor(Color.YELLOW);		
	    text7.setTypeface(font8);
		
		 text7.setText(text7.getText() + String.valueOf(startTime / 1000));
		 
		 if (!timerHasStarted) {
			   countDownTimer.start();
			   timerHasStarted = true;
			   //startB.setVisibility(View.GONE);//("STOP");
		 }
	b8.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		
			if(e7.getText().toString().equals("quit"))
			 {countDownTimer.cancel();
			   timerHasStarted = false;
				Intent next2= new Intent(eight.this , MainActivity.class);
				 startActivity(next2);
			 }
			else{
			if(e7.getText().toString().equals(""))
			 {
				 			 e7.setError("CAN'T LEFT EMPTY");
			 }
			else{
			if(e7.getText().toString().equals("pluto"))
			 {
				 countDownTimer.cancel();
				   timerHasStarted = false;
				 Toast.makeText(getApplicationContext(), "CORRECT ANSWER", 1000).show();
				 Intent next= new Intent(eight.this , nine.class);
				 startActivity(next);
			 }
			 else
			 {countDownTimer.cancel();
			   timerHasStarted = false;
				 Toast.makeText(getApplicationContext(), "WRONG ANSWER... TRY AGAIN !!! ", 1000).show();
				 Intent s  =new Intent(eight.this , MainActivity.class);
				 startActivity(s);
			 }

			}}
			
		}
	});
		
		
		
		
		
	}

	 
	public class MyCountDownTimer extends CountDownTimer {
		  public MyCountDownTimer(long startTime, long interval) {
		   super(startTime, interval);
		  }

		  @Override
		  public void onFinish() {
		   text7.setText("Time's up!");
		   Toast.makeText(getApplicationContext(), "YOU HAVE TAKEN TOO LONGER !!!", 1000).show();
		 
		   Intent back= new Intent(eight.this , MainActivity.class);
		   startActivity(back);
		  }

		  @Override
		  public void onTick(long millisUntilFinished) {
		   text7.setText("" + millisUntilFinished / 1000);
		  }
		 }

	
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub


		final AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(this);
	    alertDialogBuilder.setTitle("WARNING !!!");
        alertDialogBuilder.setIcon(R.drawable.x);
		alertDialogBuilder.setMessage("U R NOT ALLOWED TO GO BACK !!!");
	
		alertDialogBuilder.setPositiveButton("OK !",new DialogInterface.OnClickListener()
		{

			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
				
			}
			
			});
		AlertDialog alertDialog=alertDialogBuilder.create();
		alertDialog.show();
	}



	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		//eight.this.finish();
	}	

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
	  super.onConfigurationChanged(newConfig);
	  setContentView(R.layout.eight);
	}
	
	
}
