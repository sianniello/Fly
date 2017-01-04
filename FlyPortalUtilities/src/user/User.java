package user;

public class User {

	private String username, password;

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public User (String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
