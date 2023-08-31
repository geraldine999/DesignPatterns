public interface CheckPasswordChain {

    CheckPasswordChain getNext();
    void setNext(CheckPasswordChain next);
    void checkPassword(String password) throws Exception;
}
