package tutorial.adit.com.databindingobservables;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tutorial.adit.com.databindingobservables.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


	ActivityMainBinding activityMainBinding;
	User user;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		//ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

		activityMainBinding =  DataBindingUtil.setContentView(this,R.layout.activity_main);
		user = new User();
		user.first_name.set("Adit");
		user.Last_name.set("Chauhan");
		activityMainBinding.setUser(user);





	}
}
