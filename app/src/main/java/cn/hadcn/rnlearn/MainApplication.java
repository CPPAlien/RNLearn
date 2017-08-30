package cn.hadcn.rnlearn;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

/**
 * Created by Chris Peng on 29/08/2017
 */
public class MainApplication extends Application implements ReactApplication {

    private ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
        @Override
        public boolean getUseDeveloperSupport() {
            return true;
        }

        @Override
        protected List<ReactPackage> getPackages() {
            List<ReactPackage> list = new ArrayList<>();
            list.add(new MainReactPackage());
            return list;
        }

        @Nullable
        @Override
        protected String getJSBundleFile() {
            return "assets://jsBundle/main.jsbundle";
        }

        @Override
        protected String getBundleAssetName() {
            return "jsBundle/main.jsbundle";
        }
    };

    @Override
    public ReactNativeHost getReactNativeHost() {
        return mReactNativeHost;
    }
}
