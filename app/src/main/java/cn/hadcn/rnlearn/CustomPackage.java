package cn.hadcn.rnlearn;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dq
 */
public class CustomPackage implements ReactPackage {
    @Override
    public List<NativeModule> createNativeModules(final ReactApplicationContext reactContext) {
        List<NativeModule> nativeModules = new ArrayList<>();
        nativeModules.add(new TestModule(reactContext));
        return nativeModules;
    }

    @Override
    public List<ViewManager> createViewManagers(final ReactApplicationContext reactContext) {
        List<ViewManager> viewManagers = new ArrayList<>();
        viewManagers.add(new ReactCustomManager());
        return viewManagers;
    }
}
