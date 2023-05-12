package Generics;

import java.util.Arrays;

public class Custom_Gen_Array_List<T> {
    private Object data[];
    private static int DEFAULT_SIZE  = 10;
    private int  size  = 0;

    public Custom_Gen_Array_List() {
        this.data =  new Object [DEFAULT_SIZE];
        this.size = size;
    }



    public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size++] =  num;
    }

    private void resize() {
        Object temp[] =  new Object[data.length * 2];
        for(int i =0; i<data.length; i++)
        {
            temp[i] =  data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        T removed =  (T)data[--size];
        return removed;

    }
    public T getIndex(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }

    public void set(int index, T value)
    {
        data[index] = value;
    }

    public void display(){
        for(int i =0; i<size; i++)
        {
            System.out.print(data[i] + " ");
        }
    }

    @Override
    public String toString() {
        return "Custom_Array_List{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Custom_Gen_Array_List<String> list = new Custom_Gen_Array_List<>();
        list.add("Thor");
        list.add("Captain America");
        list.add("Hawkye");
        list.add("Hulk");
        list.add("Iron - Man");
        System.out.println(list);
    }

}
