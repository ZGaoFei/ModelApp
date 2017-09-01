package cn.com.zgfei.modelapp.base;

import android.view.View;

/**
 * 根Activity
 *
 * 适用于单个负责Activity
 */

public abstract class RootActivity<T extends BasePresenter> extends BaseActivity<T> {

    private static final int STATE_ERROR = 0x00;
    private static final int STATE_LOADING = 0x01;
    private static final int STATE_EMPTY = 0x02;

    private View errorView;
    private View emptyView;

    @Override
    protected void initData() {

    }

    @Override
    public void showErrorView() {
        super.showErrorView();

    }

    @Override
    public void showLoading() {
        super.showLoading();

    }

    @Override
    public void showEmpty() {
        super.showEmpty();

    }

    @Override
    public void showErrorMsg(String errorMsg) {
        super.showErrorMsg(errorMsg);

    }

    @Override
    public void showMain() {
        super.showMain();

    }
}
