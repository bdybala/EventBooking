package data.user;

/**
 * @author BDyb
 *
 */
public class UserService {

	static UserDao dao = new UserDao();
	
	/**
	 * @param login 
	 * @param password 
	 * @return User object when successfull or null
	 */
	public static User login(String login, String password) {
		return dao.login(login, password);
	}
	
	/**
	 * @param login username to check if exists in database
	 * @return User object if login exists or null
	 */
	public static User checkLogin(String login) {
		return dao.checkLogin(login);
	}
}
