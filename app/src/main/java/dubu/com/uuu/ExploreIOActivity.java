package dubu.com.uuu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import dubu.com.uuu.explor.ExploreModel;
import dubu.com.uuu.framework.QueryEnum;
import dubu.com.uuu.ui.BaseActivity;

public class ExploreIOActivity extends BaseActivity {

    private static final String SCREEN_LABEL = "울다웃다윤다";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


//        addPresenterFragment(
//                R.id.explore_library_frag,
//                new ExploreModel(
//                        getApplicationContext()),
//                new QueryEnum[]{
//                        ExploreModel.ExploreQueryEnum.SESSIONS,
//                        ExploreModel.ExploreQueryEnum.TAGS},
//                new ExploreUserActionEnum[]{
//                        ExploreUserActionEnum.RELOAD});

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
