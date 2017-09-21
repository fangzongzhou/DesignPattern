public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new TurnOnCommand());
        invoker.doAction();
        System.out.println("------");
        invoker = new Invoker(new TurnOffCommand());
        invoker.doAction();
    }
}
