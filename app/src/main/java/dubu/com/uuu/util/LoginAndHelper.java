package dubu.com.uuu.util;

/**
 * Created by dubuapt on 2016-01-11.
 */
public class LoginAndHelper {

    public interface Callbacks {
        void onPlusInfoLoaded(String accountName);
        void onAuthSuccess(String accountName, boolean newlyAuthenticated);
        void onAuthFailure(String accountName);
    }
}
