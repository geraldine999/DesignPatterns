public class AnimalIterator implements Iterator{

    private Animal[] animals;
    private int position;

    public AnimalIterator(Animal[] animals) {
        this.animals = animals;
        this.position= 0;
    }

    @Override
    public boolean hasNext() {
        if(position >= animals.length){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return animals[position++];

    }

    @Override
    public Object currentItem() {
        return animals[position];
    }
}
