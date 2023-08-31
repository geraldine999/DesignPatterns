import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<ArticleMemento> mementos = new ArrayList<>();

    public void addMemento(ArticleMemento memento){
        mementos.add(memento);
    }

    public ArticleMemento retrieveMemento(int index){
        return mementos.get(index);
    }
}
