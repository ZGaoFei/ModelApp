package cn.com.zgfei.modelapp.app;

import android.app.Activity;
import android.app.Application;

import java.util.HashSet;
import java.util.Set;


public class App extends Application {
    public static App instance;
    public Set<Activity> activities;

    //获取Application的实例
    public static synchronized App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

    }

    /**
     * Activity入栈
     * @param activity
     */
    public void addActivity(Activity activity) {
        if (activities == null) {
            activities = new HashSet<>();
        }

        activities.add(activity);
    }

    /**
     * Activity出栈
     * @param activity
     */
    public void removeActivity(Activity activity) {
        if (activities != null) {
            activities.remove(activity);
        }
    }

    /**
     * 关闭App
     */
    public void exitApp() {
        if (activities != null) {
            synchronized (activities) {
                for (Activity act : activities) {
                    act.finish();
                }
            }
        }

        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
}
