public class MementoMain {
    public static void main(String[] args) {
        testMemento();
    }

    private static void testMemento(){
        Caretaker caretaker = new Caretaker();
        Article article = new Article("Geraldine", "Initial text");

        caretaker.addMemento(article.createMemento());

        article.setText("Edited text");

        article.restoreMemento(caretaker.retrieveMemento(0));

        System.out.println(article.getText());

    }
}