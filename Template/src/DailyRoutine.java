public abstract class DailyRoutine {

    abstract void getUp();

    abstract void eatBreakfast();

    abstract void work();

    public final void dailyRoutine(){
        getUp();
        eatBreakfast();
        work();
    }
}
