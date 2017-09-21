public abstract class Receiver {
    abstract void action();

    public void turnOn() {
        System.out.println("接通电源,开灯...");
    }

    public void turnOff() {
        System.out.println("关闭电源,关灯...");
    }

    public void fetchEnv() {
        System.out.println("从云端获取用户场景");
    }

    public void adjustLight() {
        System.out.println("根据场景调节灯光");
    }
}
