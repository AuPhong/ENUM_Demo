import view.RegisterView;

import java.util.Scanner;

public class Main {

    public Main() {
        System.out.println("================MY NAVBAR================");
        System.out.println("1.Register");
        System.out.println("2.Login");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                new RegisterView();
                break;
            case 2:
                System.out.println("Login");
                break;
        }
    }

    public static void main(String[] args) {
        new Main();
    }


}
