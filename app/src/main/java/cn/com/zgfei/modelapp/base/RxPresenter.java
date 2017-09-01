package cn.com.zgfei.modelapp.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * 基于Rx的Presenter封装,控制订阅的生命周期
 */
public class RxPresenter<T extends BaseView> implements BasePresenter<T> {

    private T view;
    private CompositeDisposable compositeDisposable;

    @Override
    public void attachView(T view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
        unSubscribe();
    }

    private void addSubscribe(Disposable subscription) {
        if (compositeDisposable == null) {
            compositeDisposable = new CompositeDisposable();
        }

        if (subscription != null) {
            compositeDisposable.add(subscription);
        }
    }

    private void unSubscribe() {
        if (compositeDisposable != null) {
            compositeDisposable.clear();
        }
    }
}
