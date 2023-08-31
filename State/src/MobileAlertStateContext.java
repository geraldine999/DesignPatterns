public class MobileAlertStateContext {

    private MobileAlertState currentState;

    public MobileAlertStateContext() {
        this.currentState = new Sound(); //default
    }

    public void setCurrentState(MobileAlertState currentState) {
        this.currentState = currentState;
    }

    public void alert(){
        currentState.alert(this);
    }
}
