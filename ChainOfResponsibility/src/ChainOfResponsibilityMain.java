public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        testChainOfResponsibility();
    }

    private static void testChainOfResponsibility(){
        PasswordChecker passwordChecker = new PasswordChecker();

        try{
            passwordChecker.checkPassword("Contraseña1 ");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}