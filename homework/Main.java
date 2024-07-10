package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        user.report();
        UserService a = new UserService(user);
        a.saving();
    }
}