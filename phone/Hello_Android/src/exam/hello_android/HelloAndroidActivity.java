package exam.hello_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelloAndroidActivity extends Activity{
	
@Override
public void onCreate(Bundle savedInstanceState){
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main);
	Button btnCall = (Button)findViewById(R.id.btncallphone);
	Button btnSend = (Button)findViewById(R.id.btnsendemail);
	
	btnCall.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			Intent intent=new Intent(HelloAndroidActivity.this, CallPhoneActivity.class);
			startActivity(intent);
		}
	});
	
	btnSend.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			Intent intent=new Intent(HelloAndroidActivity.this, SendEmailActivity.class);
			startActivity(intent);
		}
	});
}


}
