package dubu.com.uuu.explor;

import android.content.Context;

import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import dubu.com.uuu.framework.Model;
import dubu.com.uuu.framework.QueryEnum;
import dubu.com.uuu.framework.UserActionEnum;

/**
 * Created by dubuapt on 2016-01-19.
 */
public class ExploreModel implements Model {
    public ExploreModel(Context applicationContext) {
    }

    @Override
    public QueryEnum[] getQueries() {
        return new QueryEnum[0];
    }

    @Override
    public boolean readDataFromCursor(Cursor cursor, QueryEnum query) {
        return false;
    }

    @Override
    public Loader<Cursor> createCursorLoader(int loaderId, Uri uri, Bundle args) {
        return null;
    }

    @Override
    public boolean requestModelUpdate(UserActionEnum action, @Nullable Bundle args) {
        return false;
    }

    /**
     * User: kingkingdubu
     * Date: 2016-01-26
     * Time: 오전 8:10
     */
    public static enum ExploreQueryEnum {
    }
}
