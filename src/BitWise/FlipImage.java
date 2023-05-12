package BitWise;

public class FlipImage {
    public int[][] flipAndInvertImage(int[][] image) {
for(int i = 0; i<image.length; i++)
{
    int arr[] =  image[i];
    int i1 = 0;
    int j1 = arr.length-1;
//reverse the array
    while(i1<j1){
        int temp  = arr[i1]^1;
        arr[i1] = arr[j1]^1;
        arr[j1] =  temp;
        i1++;
        j1--;
    }
    for(int k =0; k<arr.length; k++)
    {
     if(arr[k]==1){
         arr[k] =0;
     }

     else if (arr[k]==0) {
         arr[k]=1;
     }

    }

}
return image;
    }
    public static void main(String[] args) {


    }
}
