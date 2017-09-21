public class TurnOnCommand extends Command {
    public TurnOnCommand(Receiver receiver) {
        super(receiver);
    }

    public TurnOnCommand() {
        super(new LightReceiver());
    }

    @Override
    public void execute() {
        super.receiver.action();
        super.receiver.turnOn();
        super.receiver.fetchEnv();
        super.receiver.adjustLight();
    }
}
