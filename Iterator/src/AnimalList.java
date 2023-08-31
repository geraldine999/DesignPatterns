public class AnimalList implements List{

    private Animal[] animals;

    public AnimalList(Animal[] animals){
        this.animals = animals;
    }
    @Override
    public Iterator iterator() {
        return new AnimalIterator(animals);
    }
}
