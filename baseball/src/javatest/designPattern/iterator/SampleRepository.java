package javatest.designPattern.iterator;

public class SampleRepository implements Repository{

    public String[] sample;

    public SampleRepository(String[] sample) {
        this.sample = sample;
    }

    @Override
    public Iterator getIterator() {
        return new SampleIterator();
    }

    public class SampleIterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            return index < sample.length;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return sample[index++];
            }
            return null;
        }
    }

}
