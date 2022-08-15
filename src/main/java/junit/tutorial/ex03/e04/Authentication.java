package junit.tutorial.ex03.e04;

public class Authentication {
	
	AccountDao accountDao;
	
	public Account authenticate(String userId, String password) {
		Account account = accountDao.findOrNull(userId);
		if (account != null && account.getPassword() != null) {
			String dbPassword = account.getPassword();
			if (dbPassword.equals(password)) {
				return account;
			}
		}
		return null;
	}

}
