package designpatterns.behaviorial.template;

import java.util.ArrayList;
import java.util.List;

public abstract class Network<T> {

	String userName;
	String password;

	public Network() {
	}

	public List<T> getCurrentTimeline(final String message) {
		if (logIn(this.userName, this.password)) {
			final List<T> result = getTimeline();
			logOut();
			return result;
		}
		return new ArrayList<T>();

	}

	abstract boolean logIn(String userName, String password);
	abstract List<T> getTimeline();
	abstract void logOut();

}
