package crackthecode.game;


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

public class one extends Activity{

	EditText e;
	Button b1;
	private CountDownTimer countDownTimer;
	private boolean timerHasStarted = false;
	public TextView text;
	private final long startTime = 30 * 1000;
	private final long interval = 1 * 1000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.one);
	
		e=(EditText)findViewById(R.id.editText1);
		b1=(Button)findViewById(R.id.button1);
		text=(TextView)findViewById(R.id.timer);
		countDownTimer = new MyCountDownTimer(startTime, interval);
		//text.setBackgroundColor(Color.YELLOW);
		
		Typeface font1 = Typeface.createFromAsset(getAssets(), "Courneuf-Regular.ttf");
		text.setTextColor(Color.YELLOW);		
	    text.setTypeface(font1);
		
		 text.setText(text.getText() + String.valueOf(startTime / 1000));
		 
		 if (!timerHasStarted) {
			   countDownTimer.start();
			   timerHasStarted = true;
			   //startB.setVisibility(View.GONE);//("STOP");
		 }
	b1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if(e.getText().toString().equals("quit"))
			 { countDownTimer.cancel();
			   timerHasStarted = false;
				Intent next11= new Intent(one.this , MainActivity.class);
				 startActivity(next11);
			 }else{
			if(e.getText().toString().equals(""))
			 {
				 			 e.setError("CAN'T LEFT EMPTY");
			 }
			else{
			if(e.getText().toString().equals("2"))
			 {
				 countDownTimer.cancel();
				   timerHasStarted = false;
				 Toast.makeText(getApplicationContext(), "CORRECT ANSWER", 1000).show();
				 Intent next= new Intent(one.this , two.class);
				 startActivity(next);
			 }
			 else
			 {  
				 countDownTimer.cancel();
				   timerHasStarted = false;
				 Toast.makeText(getApplicationContext(), "WRONG ANSWER... TRY AGAIN !!! ", 1000).show();
				 Intent a  =new Intent(one.this , MainActivity.class);
				 startActivity(a);
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
		   text.setText("Time's up!");
		   Toast.makeText(getApplicationContext(), "YOU HAVE TAKEN TOO LONGER !!!", 1000).show();
		 
		   Intent back= new Intent(one.this , MainActivity.class);
		   startActivity(back);
		  }

		  @Override
		  public void onTick(long millisUntilFinished) {
		   text.setText("" + millisUntilFinished / 1000);
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
		//one.this.onPause();
		 countDownTimer.cancel();
		 timerHasStarted = false;
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		//one.this.onResume();
		 countDownTimer.start();
		 timerHasStarted = true;
	}



//	@Override
//	public void onConfigurationChanged(Configuration newConfig) {
//	  super.onConfigurationChanged(newConfig);
//	  setContentView(R.layout.one);
////	  countDownTimer.cancel();
////	   timerHasStarted = false;
////	  
////	  if (!timerHasStarted) {
////		   countDownTimer.start();
////		   timerHasStarted = true;
////		   //startB.setVisibility(View.GONE);//("STOP");
////	 }
////	  countDownTimer.cancel();
////	   timerHasStarted = false;
//	  
//	  InitializeUI();
//	  
//	}
}
