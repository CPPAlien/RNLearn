package cn.hadcn.rnlearn;

import java.io.Serializable;

/**
 * @author dq
 */
public class TestModel implements Serializable {
    private String mName;

    public String getName() {
        return mName;
    }

    public TestModel setName(final String name) {
        mName = name;
        return this;
    }
}
