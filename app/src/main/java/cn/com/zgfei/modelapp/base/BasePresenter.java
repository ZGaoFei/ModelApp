package cn.com.zgfei.modelapp.base;


/**
 * 绑定视图
 * 解绑视图
 * @param <T>
 */
public interface BasePresenter<T extends BaseView> {

    void attachView(T view);

    void detachView();
}
