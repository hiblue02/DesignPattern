package javatest.designPattern.iterator;

public class Main {
    public static void main(String[] args) {
        Repository repository = new SampleRepository(new String[]{"A", "B", "c", "d", "e"});
        Iterator iterator = repository.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
