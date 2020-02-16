import java.util.Scanner;

public class thuchanh2 {
    public static void main(String[] args) {

        String[]studen={"loi","dung","anh"};

        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap ten hs:");
        String name=scanner.nextLine();
        boolean isExits=false;
        for (int i=0;i<studen.length;i++){
            if (studen[i].equals(name)){
                System.out.println("vi tri"+name+"la:"+(i+1));
                isExits=true;
                break;
            }
        }
        if (!isExits)
            System.out.println("khong thay"+name+"trong danh sach");

    }
}
