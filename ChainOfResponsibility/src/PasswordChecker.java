public class PasswordChecker implements CheckPasswordChain{
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
        CheckHasNumber checkHasNumber = new CheckHasNumber();
        CheckHasUpperCaseLetter checkHasUpperCaseLetter = new CheckHasUpperCaseLetter();
        CheckHasNoWhiteSpaces checkHasNoWhiteSpaces = new CheckHasNoWhiteSpaces();

        //seteo el orden de la cadena
        next = checkHasNumber;
        checkHasNumber.setNext(checkHasUpperCaseLetter);
        checkHasUpperCaseLetter.setNext(checkHasNoWhiteSpaces);

        next.checkPassword(password);
    }
}
