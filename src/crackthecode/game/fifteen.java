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

public class fifteen extends Activity 
{
	
	
	EditText e14;
	Button b15;
	private CountDownTimer countDownTimer;
	private boolean timerHasStarted = false;
	public TextView text14;
	private final long startTime = 25 * 1000;
	private final long interval = 1 * 1000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fifteen);
		
		e14=(EditText)findViewById(R.id.editText15);
		b15=(Button)findViewById(R.id.button15);
		text14=(TextView)findViewById(R.id.timer14);
		countDownTimer = new MyCountDownTimer(startTime, interval);
		//text14.setBackgroundColor(Color.YELLOW);
		
		Typeface font15 = Typeface.createFromAsset(getAssets(), "Courneuf-Regular.ttf");
		text14.setTextColor(Color.CYAN);		
	    text14.setTypeface(font15);
		
		 text14.setText(text14.getText() + String.valueOf(startTime / 1000));
		 
		 if (!timerHasStarted) {
			   countDownTimer.start();
			   timerHasStarted = true;
			   //startB.setVisibility(View.GONE);//("STOP");
		 }
	b15.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		
			if(e14.getText().toString().equals("quit"))
			 {countDownTimer.cancel();
			   timerHasStarted = false;
				Intent next5= new Intent(fifteen.this , MainActivity.class);
				 startActivity(next5);
			 }
			else{
			if(e14.getText().toString().equals(""))
			 {
				 			 e14.setError("CAN'T LEFT EMPTY");
			 }
			else{
			if(e14.getText().toString().equals("sedecim"))
			 {
				 countDownTimer.cancel();
				   timerHasStarted = false;
				 Toast.makeText(getApplicationContext(), "CORRECT ANSWER", 1000).show();
				 Intent next= new Intent(fifteen.this , sixteen.class);
				 startActivity(next);
			 }
			 else
			 {
				 countDownTimer.cancel();
				   timerHasStarted = false;
				 Toast.makeText(getApplicationContext(), "WRONG ANSWER... TRY AGAIN !!! ", 1000).show();
				 Intent s  =new Intent(fifteen.this , MainActivity.class);
				 startActivity(s);
			 }

			}
			}
		}
	});
		
		
		
		
		
	}

	 
	public class MyCountDownTimer extends CountDownTimer {
		  public MyCountDownTimer(long startTime, long interval) {
		   super(startTime, interval);
		  }

		  @Override
		  public void onFinish() {
		   text14.setText("Time's up!");
		   Toast.makeText(getApplicationContext(), "YOU HAVE TAKEN TOO LONGER !!!", 1000).show();
		 
		   Intent back= new Intent(fifteen.this , MainActivity.class);
		   startActivity(back);
		  }

		  @Override
		  public void onTick(long millisUntilFinished) {
		   text14.setText("" + millisUntilFinished / 1000);
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
		//fifteen.this.finish();
	}	

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
	  super.onConfigurationChanged(newConfig);
	  setContentView(R.layout.fifteen);
	}
	
	
}
