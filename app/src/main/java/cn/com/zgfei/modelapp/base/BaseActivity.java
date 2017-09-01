package cn.com.zgfei.modelapp.base;

/**
 * 包含有MVP模式的Activity
 *
 * 适用于包含有Fragment的Activity
 * 里面的异常交由Fragment处理
 */

public abstract class BaseActivity<T extends BasePresenter> extends SimpleActivity implements BaseView {
    protected T mPresenter;

    protected abstract T getPresenter();

    @Override
    protected void onViewCreated() {
        super.onViewCreated();
        mPresenter = getPresenter();
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    @Override
    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        super.onDestroy();
    }

    @Override
    public void showErrorMsg(String errorMsg) {
        //统一处理错误信息提示
    }

    @Override
    public void showEmpty() {
        //统一处理空数据布局显示
    }

    @Override
    public void showLoading() {
        //统一处理加载布局显示
    }

    @Override
    public void showErrorView() {
        //统一处理错误布局显示
    }

    @Override
    public void showMain() {
        //正常显示
    }
}
