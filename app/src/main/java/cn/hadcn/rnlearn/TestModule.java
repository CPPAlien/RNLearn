package cn.hadcn.rnlearn;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * @author dq
 */
public class TestModule extends ReactContextBaseJavaModule {

    public TestModule(final ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "PTest";
    }

    @ReactMethod
    public void showToast(String content) {
        Toast.makeText(getReactApplicationContext(), content, Toast.LENGTH_SHORT).show();
    }
}
