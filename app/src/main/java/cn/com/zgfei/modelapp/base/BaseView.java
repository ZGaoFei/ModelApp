package cn.com.zgfei.modelapp.base;

/**
 * 根据实际需求而定，表示一般的状态
 *
 * 错误提示
 * 错误布局、网络异常布局（支持点击重试）
 * 空布局
 * 加载中布局
 *
 * 可以考虑加入的：
 * 夜间模式等
 *
 */
public interface BaseView {

    void showErrorMsg(String errorMsg);

    void showEmpty();

    void showLoading();

    void showErrorView();

    void showMain();
}
