package cn.com.zgfei.modelapp.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.com.zgfei.modelapp.app.App;

/**
 * 没有MVP模式的Activity
 *
 * 适用于比较简单的Activity
 *
 */

public abstract class SimpleActivity extends AppCompatActivity {
    protected Activity mActivity;
    private Unbinder unbinder;

    protected abstract int getLayout();
    protected abstract void initData();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        unbinder = ButterKnife.bind(this);
        mActivity = this;
        onViewCreated();
        App.getInstance().addActivity(this);
        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
        App.getInstance().removeActivity(this);
    }

    protected void onViewCreated() {

    }
}
