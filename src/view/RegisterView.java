package view;

import model.Role;
import model.RoleName;
import model.User;
import service.user.UserServiceIMPL;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RegisterView {
    public RegisterView() {
        UserServiceIMPL userServiceIMPL = new UserServiceIMPL();
        Scanner sc = new Scanner(System.in);
        System.out.println("FORM REGISTER");
        int id = UserServiceIMPL.userList.size()+1;
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter username: ");
        String userName = sc.nextLine();
        System.out.println("Enter password: ");
        String passWord = sc.nextLine();
        System.out.println("Enter role: ");
        String role = sc.nextLine();
        Set<Role> roleSet = new HashSet<>();
        switch (role){
            case "admin":
                roleSet.add(new Role(1, RoleName.ADMIN));
                break;
            case "pm":
                roleSet.add(new Role(2, RoleName.PM));
                break;
            case "user":
                roleSet.add(new Role(3, RoleName.USER));
                break;
        }
        User user = new User(id,name,userName,passWord,roleSet);
        userServiceIMPL.save(user);
        new LoginView();
    }
}
