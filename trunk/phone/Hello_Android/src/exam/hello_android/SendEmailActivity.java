package exam.hello_android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendEmailActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sendemail);
		
		Button btnSend = (Button)findViewById(R.id.btnsend);
		Button btnBackHome = (Button)findViewById(R.id.btnbackhome);
		final EditText txtEmail = (EditText)findViewById(R.id.txtEmail);
		final EditText txtMessages = (EditText)findViewById(R.id.txtMessages);
		
		btnSend.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent emailIntent = new Intent(Intent.ACTION_SEND);
				emailIntent.setType("text/plain");
				emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{txtEmail.getText().toString()});
				emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Subject");
				emailIntent.putExtra(android.content.Intent.EXTRA_TEXT,txtMessages.getText().toString());
				startActivity(Intent.createChooser(emailIntent, "Select email application."));
				
			}
		});
		
		btnBackHome.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent=new Intent(SendEmailActivity.this, HelloAndroidActivity.class);
				startActivity(intent);
			}
		});
	}
	
	
}
