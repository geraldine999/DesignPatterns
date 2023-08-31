public class CommandMain {
    public static void main(String[] args) {
        testCommand();
    }

    private static void testCommand(){

        Remote remote = new Remote();
        TV tv = new TV();

        remote.setCommand(new TurnVolumeUpCommand(tv));
        remote.run();
    }
}