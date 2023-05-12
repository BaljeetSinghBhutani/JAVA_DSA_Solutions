package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Custom_Array_List {

    private int data[];
    private static int DEFAULT_SIZE  = 10;
    private int  size  = 0;

    public Custom_Array_List() {
        this.data =  new int [DEFAULT_SIZE];
        this.size = size;
    }



    public void add(int num){
       if(this.isFull()){
           resize();
       }
       data[size++] =  num;
    }

    private void resize() {
        int temp[] =  new int[data.length * 2];
        for(int i =0; i<data.length; i++)
        {
            temp[i] =  data[i];
        }
        data = temp;
    }

    private boolean isFull() {
      return size == data.length;
    }

    public int remove(){
        int removed =  data[--size];
        return removed;

    }
    public int getIndex(int index){
        return data[index];
    }
    public int size(){
        return size;
    }

    public void set(int index, int value)
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
        Custom_Array_List list = new Custom_Array_List();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        System.out.println(list);
//        list.display();

        for(int i =0; i<14; i++){
          list.add(i);
        }
        System.out.println(list);

        ArrayList list2 =  new ArrayList();
        list2.add("Baljeet");
        list2.add(1234);
        System.out.println(list2);
    }
}
