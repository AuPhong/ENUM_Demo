package view;

import service.user.UserServiceIMPL;

public class LoginView {
    public LoginView() {
        System.out.println("List after adding new user: "+ UserServiceIMPL.userList);
    }
}
