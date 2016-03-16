
package tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import loginpackage.LoginAuthenticator;
import loginpackage.LoginController;

/**
 * 
 * @author franzfallavier
 *
 */
public class LoginTest {

	private LoginController		logger;
	private LoginAuthenticator	authenticator;

	@Before
	public void setup() {
		authenticator = mock(LoginAuthenticator.class);
		logger = new LoginController(authenticator);
	}

	@After
	public void after() {
		logger = null;
	}

	@Test
	public void givenValidLoginAndPassword_whenCallValidateLogin_thenReturnSuccess() {
		logger.setName("admin");
		logger.setPassword("admin");
		String expected = "success";
		when(authenticator.login("admin", "admin")).thenReturn(true);
		// execute command action
		String actual = logger.loginClicked();
		assertEquals(expected, actual);
	}

	@Test
	public void givenWrongLoginAndPassword_whenCallValidateLogin_thenReturnFailed() {
		logger.setName("admin");
		logger.setPassword("wrong");
		String expected = "failed";
		when(authenticator.login("admin", "wrong")).thenReturn(false);
		String actual = logger.loginClicked();
		assertEquals(expected, actual);
	}
}
