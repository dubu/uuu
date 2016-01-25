package dubu.com.uuu.framework;

import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by dubuapt on 2016-01-19.
 */
public interface Model {



    /**
     * @return an array of {@link QueryEnum} that can be processed by the model
     */
    public QueryEnum[] getQueries();

    /**
     * Updates the data saved in the model from the {@code cursor} and associated {@code query}.
     *
     * @return true if the data could be read properly from cursor.
     */
    public boolean readDataFromCursor(Cursor cursor, QueryEnum query);

    /**
     * Creates the cursor loader for the given loader id and data source {@code uri}.
     * <p/>
     * The {@code loaderId} corresponds to the id of the query, as defined in {@link QueryEnum}. The
     * {@code args} may contain extra arguments required to create the query.
     * <p/>
     * The returned cursor loader is managed by the {@link android.app.LoaderManager}, as part
     * of the {@link android.app.Fragment}
     *
     * @return the cursor loader.
     */
    public Loader<Cursor> createCursorLoader(int loaderId, Uri uri, Bundle args);

    /**
     * Updates this Model according to a user {@code action} and {@code args}.
     * <p />
     * Add the constants used to store values in the bundle to the Model implementation class as
     * final static protected strings.
     *
     * @return true if successful.
     */
    public boolean requestModelUpdate(UserActionEnum action, @Nullable Bundle args);
}

