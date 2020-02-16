public class thuchanh5 {
    public static int minNumber(int[]array){
        int min=array[0];
        int index=0;
        for (int i=0;i<array.length;i++){
            if (min>array[i]){
                min=array[i];
                index=i;

            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[]arr={1,4,3,9};
        int index=minNumber(arr);
        System.out.println("phan tu nho nhat trong mang:"+arr[index]);
    }
}
