public class CheckHasNoWhiteSpaces implements CheckPasswordChain{


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
        System.out.println("Checking password for white-space characters...");
        if(password.chars().anyMatch(Character::isSpaceChar)){
            throw new Exception("Password must not contain any white-space character");
        }

    }
}
