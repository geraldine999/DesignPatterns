public class TurnVolumeUpCommand implements Command{

    TV tv;

    public TurnVolumeUpCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnUpTheVolume();
    }
}
