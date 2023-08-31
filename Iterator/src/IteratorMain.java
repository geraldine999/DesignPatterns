
public class IteratorMain {
    public static void main(String[] args) {
        testIterator();
    }

    private static void  testIterator(){
       Animal[] animals = new Animal[3];

        animals[0] = new Animal("Owl");
        animals[1] = new Animal("Dog");
        animals[2] = new Animal("Duck");

        List list =  new AnimalList(animals);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            Animal animal = (Animal) iterator.next();
            System.out.println(animal.getName());
        }
    }
}