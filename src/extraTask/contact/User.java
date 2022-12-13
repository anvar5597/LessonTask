package extraTask.contact;

public class User {
    public static Long countObj = 0L;
    private final Long id;
    private String name;
    private String email;
    private String address;

    public User() {
        countObj++;
        id = countObj;
    }

    public User(String name, String email, String address) {
        countObj++;
        this.id = countObj;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public static Long getCountObj() {
        return countObj;
    }

    public static void setCountObj(Long countObj) {
        User.countObj = countObj;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
