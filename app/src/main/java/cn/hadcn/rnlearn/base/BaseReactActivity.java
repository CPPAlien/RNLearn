package cn.hadcn.rnlearn.base;

import android.os.Bundle;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.modules.core.DeviceEventManagerModule;

import cn.hadcn.rnlearn.MainApplication;

/**
 * @author dq
 */
public class BaseReactActivity extends ReactActivity {
    private ReactInstanceManager mReactInstanceManager;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mReactInstanceManager =
                ((MainApplication) getApplication()).getReactNativeHost().getReactInstanceManager();
    }

    protected void sendEvent(String eventName, Object data) {
        if (mReactInstanceManager != null && mReactInstanceManager.getCurrentReactContext() !=
                null) {
            mReactInstanceManager.getCurrentReactContext()
                    .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)
                    .emit(eventName, data);
        }
    }
}
