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

public class five extends Activity 
{
	
	
	EditText e4;
	Button b5;
	private CountDownTimer countDownTimer;
	private boolean timerHasStarted = false;
	public TextView text4;
	private final long startTime = 30 * 1000;
	private final long interval = 1 * 1000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.five);
		
		e4=(EditText)findViewById(R.id.editText5);
		b5=(Button)findViewById(R.id.button5);
		text4=(TextView)findViewById(R.id.timer4);
		countDownTimer = new MyCountDownTimer(startTime, interval);
		//text4.setBackgroundColor(Color.YELLOW);
		
		Typeface font5 = Typeface.createFromAsset(getAssets(), "Courneuf-Regular.ttf");
		text4.setTextColor(Color.YELLOW);		
	    text4.setTypeface(font5);
		
		 text4.setText(text4.getText() + String.valueOf(startTime / 1000));
		 
		 if (!timerHasStarted) {
			   countDownTimer.start();
			   timerHasStarted = true;
			   //startB.setVisibility(View.GONE);//("STOP");
		 }
	b5.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		
			if(e4.getText().toString().equals("quit"))
			 {
				countDownTimer.cancel();
				   timerHasStarted = false;
				Intent next6= new Intent(five.this , MainActivity.class);
				 startActivity(next6);
			 }
			else{
			if(e4.getText().toString().equals(""))
			 {
				 			 e4.setError("CAN'T LEFT EMPTY");
			 }
			else{
			if(e4.getText().toString().equals("xxiiss"))
			 {
				 countDownTimer.cancel();
				   timerHasStarted = false;
				 Toast.makeText(getApplicationContext(), "CORRECT ANSWER", 1000).show();
				 Intent next= new Intent(five.this , six.class);
				 startActivity(next);
			 }
			 else
			 {
				 
				 countDownTimer.cancel();
				   timerHasStarted = false;
				 Toast.makeText(getApplicationContext(), "WRONG ANSWER... TRY AGAIN !!! ", 1000).show();
				 Intent s  =new Intent(five.this , MainActivity.class);
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
		   text4.setText("Time's up!");
		   Toast.makeText(getApplicationContext(), "YOU HAVE TAKEN TOO LONGER !!!", 1000).show();
		 
		   Intent back= new Intent(five.this , MainActivity.class);
		   startActivity(back);
		  }

		  @Override
		  public void onTick(long millisUntilFinished) {
		   text4.setText("" + millisUntilFinished / 1000);
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
		//five.this.finish();
	}	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
	  super.onConfigurationChanged(newConfig);
	  setContentView(R.layout.five);
	}
	
	
	
}
