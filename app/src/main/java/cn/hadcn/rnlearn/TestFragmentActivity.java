package cn.hadcn.rnlearn;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import cn.hadcn.rnlearn.base.BaseReactFragmentActivity;
import cn.hadcn.rnlearn.base.RNConvert;

/**
 * @author dq
 */
public class TestFragmentActivity extends BaseReactFragmentActivity<HelloFragment> {

    @Override
    protected HelloFragment returnReactFragment() {
        return new HelloFragment();
    }

    @Override
    public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.test_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        if (item.getItemId() == R.id.send_event) {
            try {
                String json = new Gson().toJson(new TestModel().setName("PT"));
                Log.e("pengtao", "json = " + json);
                sendEvent("nativeCall", RNConvert.convertJsonToMap(new JSONObject(json)));
            } catch (JSONException e) {
                e.printStackTrace();
            }

        }
        return false;
    }
}
