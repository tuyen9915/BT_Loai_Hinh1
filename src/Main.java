import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int n;
        do {
        // Hiển thị menu lựa chọn
            Scanner sc = new Scanner(System.in);
            System.out.println("\t\tMENU");
            System.out.println("1: In hình chữ nhật");
            System.out.println("2: In hình tam giác vuông ở 4 góc khác nhau:");
            System.out.println("\t a: Trên cùng bên trái");
            System.out.println("\t b: Trên cùng bên phải");
            System.out.println("\t c: Dưới cùng bên trái");
            System.out.println("\t d: Dưới cùng bên phải");
            System.out.println("3: In tam giác cân");
            System.out.println("4: Thoát");
        // nhập lựa chọn
            System.out.print("Xin mời bạn nhập lựa chọn: ");
            n = sc.nextInt();
        // Điều kiện
            if(n == 1){
                int dai, rong;

                System.out.println("Bạn muốn in hình chữ nhật kích thước bao nhiêu?");
                System.out.print("Xin mời bạn nhập chiều dài: ");
                dai = sc.nextInt();
                System.out.print("Xin mời bạn nhập chiều rộng: ");
                rong = sc.nextInt();
                System.out.println();
                System.out.println("\tĐây là hình chữ nhật của bạn");
                System.out.println();
                for (int i =1; i <= dai; i++){
                    for (int j = 1; j <= rong ; j++){
                            System.out.print("\t$");
                    }
                    System.out.println();
                }
                System.out.println();
            }else if (n ==2) {
                System.out.println("Tam giác vuông có 4 loại bạn chọn kiểu nào?");
                System.out.println("\t a: Trên cùng bên trái");
                System.out.println("\t b: Trên cùng bên phải");
                System.out.println("\t c: Dưới cùng bên trái");
                System.out.println("\t d: Dưới cùng bên phải");
                System.out.print("Lựa chọn của bạn: ");
                String tamGiac;
                tamGiac = sc.next();
                int dong;
                switch (tamGiac) {
                    case "a":
                        System.out.print("Mời bạn nhập kích thước 1 cạnh tam giác: ");
                        dong = sc.nextInt();
                        System.out.println("Dưới đây là tam giác có góc vuông trên cùng bên trái ");
                        System.out.println();
                        for (int i = dong; i >= 1; --i) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("\t$");
                            }
                            System.out.println();
                        }
                        System.out.println();
                        break;
                    case "b":
                        System.out.print("Mời bạn nhập kích thước 1 cạnh tam giác: ");
                        dong = sc.nextInt();
                        System.out.println("\tDưới đây là tam giác có góc vuông trên cùng bên phải ");
                        System.out.println();
                        for (int i = 1; i <= dong; i++) {
                            for (int c = 1; c <= i; c++)
                                System.out.print("\t");
                            for (int j = 1; j <= dong - i + 1; j++)
                                System.out.print("$\t");
                            System.out.println();
                        }
                        System.out.println();
                        break;
                    case "c":
                        System.out.print("Mời bạn nhập kích thước 1 cạnh tam giác: ");
                        dong = sc.nextInt();
                        System.out.println("Dưới đây là tam giác có góc vuông dưới cùng bên trái ");
                        int q = 0;
                        System.out.println();
                        for (int i = 1; i <= dong; ++i) {
                            for (int j = 1; j <= i; ++j) {
                                System.out.print("\t$");
                            }
                            System.out.println("\t");
                        }
                        System.out.println();
                        break;
                    case "d":
                        System.out.print("Mời bạn nhập kích thước 1 cạnh tam giác: ");
                        dong = sc.nextInt();
                        System.out.println("\tDưới đây là tam giác có góc vuông dưới cùng bên phải");
                        for (int i = 1; i <= dong; i++) {
                            for (int c = 1; c <= dong - i; c++)
                                System.out.print("\t");
                            for (int j = 1; j <= i; j++)
                                System.out.print("$\t");
                            System.out.println();
                        }
                        System.out.println();
                        break;
                }
            }else if (n == 3) {
                System.out.print("Mời bạn nhập kích thước tam giác cân: ");
                int canh;
                int k = 0;
                canh = sc.nextInt();
                System.out.println("\tDưới đây là hình tam gia cân của bạn");
                System.out.println();
                for (int i = 1; i <= canh; ++i, k = 0) {
                    for (int j = 1; j <= canh - i; ++j) {
                        System.out.print("\t");
                    }

                    while (k != 2 * i - 1) {
                        System.out.print("$\t");
                        ++k;
                    }

                    System.out.println();
                }
                System.out.println();
            }
        } while (n != 4);
            System.out.println("\t Hẹn gặp lại bạn!");
    }
}