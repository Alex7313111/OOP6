package homework;

public class UserService implements Persistable {
    private final User user;

    public UserService(User user) {
        this.user = user;
    }
    @Override
    public void saving() {
        System.out.println("Cохранен пользователь: " + user.getName());
    }
}
