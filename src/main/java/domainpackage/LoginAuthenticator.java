
package domainpackage;

/**
 *
 * Service : check if user and password are correct.
 * 
 * @author franzfallavier
 */
public interface LoginAuthenticator {

	public boolean login(String userName , String password);
}
