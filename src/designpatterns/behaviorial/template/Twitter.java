package designpatterns.behaviorial.template;

import java.util.ArrayList;
import java.util.List;

public class Twitter<T> extends Network<T> {
	
    public Twitter(final String userName, final String password) {
    	super();
        this.userName = userName;
        this.password = password;
    }

	@Override
	public boolean logIn(final String userName, final String password) {
		System.out.println("LogIn success on Twitter");
		return true;
	}

	@Override
	public List<T> getTimeline() {
		return new ArrayList<T>();
	}

	@Override
	public void logOut() {
		System.out.println("Logout success on Twitter");
	}

}
