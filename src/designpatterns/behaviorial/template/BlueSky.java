package designpatterns.behaviorial.template;

import java.util.ArrayList;
import java.util.List;

public class BlueSky<T> extends Network<T> {

	@Override
	public boolean logIn(final String userName, final String password) {
		System.out.println("LogIn success on BlueSky");
		return true;
	}

	@Override
	public List<T> getTimeline() {
		return new ArrayList<T>();
	}

	@Override
	public void logOut() {
		System.out.println("Logout success on BlueSky");
	}

}
