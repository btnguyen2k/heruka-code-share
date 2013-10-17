package exam.hello_android;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CallPhoneActivity extends Activity{
@Override
public void onCreate(Bundle savedInstanceState){
	super.onCreate(savedInstanceState);
	setContentView(R.layout.callphone);
	Button btnCall = (Button)findViewById(R.id.btncall);
	Button btnBackHome = (Button)findViewById(R.id.btnbackhome);
	final EditText txtNumber = (EditText)findViewById(R.id.txtPhoneNumber);
	btnCall.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			Intent callIntent=new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel: " + txtNumber.getText().toString()));
			startActivity(callIntent);}});
	btnBackHome.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			Intent intent=new Intent(CallPhoneActivity.this, HelloAndroidActivity.class);
			startActivity(intent);
		}
	});
}


}
