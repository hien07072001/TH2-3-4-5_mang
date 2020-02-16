import java.util.Scanner;

public class thuchanh3 {
    public static void main(String[] args) {
        int[]array;

        int num;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("nhap so luong phan tu:");
            num=scanner.nextInt();
            if (num>20)
                System.out.println("so luong <20.Vui long nhap lai");
        }while (num>20);
        array=new int[num];
        int i=0;
        while (i<array.length){
            System.out.println("phan tu thu"+(i+1));
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.println("ds da nhap:");
        for (int j=0;j<array.length;j++){
            System.out.println(array[j]+"/t");

        }
        int max=array[0];
        int index=1;
        for (int j=0;j<array.length;j++){
            if (max<array[j]){
                max=array[j];
                index=j+1;

            }
        }
        System.out.println("GTLN:"+max+",vtri:"+index);
    }

}
