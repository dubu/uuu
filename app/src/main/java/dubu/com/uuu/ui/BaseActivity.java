package dubu.com.uuu.ui;

import android.support.v7.app.AppCompatActivity;

import dubu.com.uuu.util.LoginAndHelper;

import static dubu.com.uuu.util.LogUtils.LOGD;
import static dubu.com.uuu.util.LogUtils.makeLogTag;

/**
 * Created by dubuapt on 2016-01-11.
 */
public abstract class BaseActivity extends AppCompatActivity implements LoginAndHelper.Callbacks {

    private static final String TAG = makeLogTag(BaseActivity.class);

    @Override
    public void onAuthSuccess(String accountName, boolean newlyAuthenticated) {
        LOGD(TAG, "AAAA");
    }

    @Override
    public void onPlusInfoLoaded(String accountName) {
        LOGD(TAG, "BBB");
    }

    @Override
    public void onAuthFailure(String accountName) {
        LOGD(TAG, "CCC");

    }

}
