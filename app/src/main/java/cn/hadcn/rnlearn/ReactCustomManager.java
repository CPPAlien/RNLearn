package cn.hadcn.rnlearn;

import android.support.v4.content.ContextCompat;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

/**
 * @author dq
 */
public class ReactCustomManager extends SimpleViewManager<CustomView> {
    @Override
    public String getName() {
        return "PTView";
    }

    @Override
    protected CustomView createViewInstance(final ThemedReactContext reactContext) {
        CustomView customView = new CustomView(reactContext);
        customView.setBackgroundColor(ContextCompat.getColor(reactContext, android.R.color.holo_green_light));
        customView.setColor(ContextCompat.getColor(reactContext, R.color.colorPrimary));
        customView.setText("测测");
        return customView;
    }

    @ReactProp(name="FontColor")
    public void setFontColor(CustomView v,int color){
        v.setColor(color);
    }

    @ReactProp(name="Text")
    public void setText(CustomView v, String text) {
        v.setText(text);
    }
}
