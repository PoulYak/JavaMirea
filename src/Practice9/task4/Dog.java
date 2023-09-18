package Practice9.task4;

public class Dog implements MyComparable<Dog> {
    public static void main(String[] args) {
        Dog dog1 = new Dog(12);
        Dog dog2 = new Dog(12);
        System.out.println(dog1.toCompare(dog2));
    }
    int size;

    public Dog(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int toCompare(Dog object) {
        if (this.getSize()>object.getSize()){
            return 1;
        } else if (this.getSize()==object.getSize()) {
            return 0;
        }
        return -1;
    }
}
