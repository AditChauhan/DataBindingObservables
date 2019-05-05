package tutorial.adit.com.databindingobservables;

import android.databinding.ObservableField;

public class User  {

	ObservableField<String>  first_name =new ObservableField<>();
	ObservableField<String>  Last_name =new ObservableField<>();

	public User() {
	}


	public ObservableField<String> getFirst_name() {
		return first_name;
	}

	public ObservableField<String> getLast_name() {
		return Last_name;
	}


}
