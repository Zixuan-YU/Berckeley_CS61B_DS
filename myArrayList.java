import java.util.Arrays;

// public class myArrayList<E> implements List<E>{
public class myArrayList<E> {
    private E[] elementData;
    private int size;

    public myArrayList(){
        //elementData = new E[10];
        elementData = (E[]) new Object[10];
        size = 0;
    }

    public void add(E element){
        elementData[size] = element;
        size += 1;
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        //myArrayList<E> list1 = new myArrayList<>();
        myArrayList<Integer> list1 = new myArrayList<Integer>();
        list1.add(7);
        list1.add(9);
        list1.add(12);
        System.out.println(list1.size());
    }

}
