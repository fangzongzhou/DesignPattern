public class TurnOffCommand extends Command {
    public TurnOffCommand(Receiver receiver) {
        super(receiver);
    }

    public TurnOffCommand() {
        super(new LightReceiver());
    }

    @Override
    public void execute() {
        super.receiver.action();
        super.receiver.turnOff();
    }
}
