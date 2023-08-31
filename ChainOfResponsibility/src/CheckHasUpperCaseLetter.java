public class CheckHasUpperCaseLetter implements CheckPasswordChain{

    private CheckPasswordChain next;

    @Override
    public CheckPasswordChain getNext() {
        return this.next;
    }

    @Override
    public void setNext(CheckPasswordChain next) {
        this.next = next;
    }

    @Override
    public void checkPassword(String password) throws Exception {
        System.out.println("Checking password for upper case letters...");
        if(!(password.chars().anyMatch(Character::isUpperCase))){
            throw new Exception("Password must contain at least 1 upper case letter");
        }

        next.checkPassword(password);
    }
}
