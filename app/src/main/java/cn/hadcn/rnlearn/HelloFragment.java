package cn.hadcn.rnlearn;

import cn.hadcn.rnlearn.base.ReactFragment;

public class HelloFragment extends ReactFragment {

    @Override
    public String getMainComponentName() { 
        return "FirstApp"; // name of our React Native component we've registered
    }
}