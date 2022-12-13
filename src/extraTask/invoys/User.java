package extraTask.invoys;

public class User {
    public static Long counterObj = 0L;
    private final Long id;
    private String name;
    private String login;
    private String pasword;

    public User( String name , String login, String pasword) {
        counterObj++;
        this.id = counterObj;
        this.name = name;
        this.login = login;
        this.pasword = pasword;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
}
