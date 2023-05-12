package Stacks_and_Queues;

public class DynamicStack extends Custom_Stack {
    public DynamicStack(){
        super();
    }

 public DynamicStack(int size)
 {
    super(size);
 }

    @Override
    public boolean push(int item) {
       if(this.isEmpty())
       {
           int temp[] = new int[data.length * 2];
//           int i =0;
           for(int i = 0; i<data.length;i++)
           {
               temp[i] =  data[i];
           }
              data = temp;
       }
//       insert Item now
        return super.push(item);
    }
}
