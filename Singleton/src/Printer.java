public class Printer {

    private static Printer INSTANCE;
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private Printer(){

    }

    //public porque se accede desde cualquier parte de la aplicación
    //synchronized porque nos evita que si hay múltiples hilos se creen múltiples instancias
    public synchronized static Printer getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Printer();
        }

        return INSTANCE;
    }
}
