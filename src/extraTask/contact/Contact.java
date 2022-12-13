package extraTask.contact;

public class Contact {
    public static Long countObj = 0L;
    private final Long id;
    private String number;
    private User user;
    private Boolean isHas=false;

    public Contact() {
        countObj++;
        id = countObj;
        this.isHas = true;
    }

    public Contact(String number, User user) {
        countObj++;
        this.id = countObj;
        this.number = number;
        this.user = user;
        this.isHas = true;
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserName(String name) {
        this.user.setName(name);
    }

    public void setUserAddress(String address) {
        this.user.setAddress(address);
    }

    public void setUserMail(String mail) {
        this.user.setEmail(mail);
    }

    public Boolean getHas() {
        return isHas;
    }

    public void setHas(Boolean has) {
        isHas = has;
    }

    @Override
    public String toString() {
        return
                "id: " + id +
                        ", Ismi: " + user.getName() +
                        ", Nomeri: " + number +
                        ", Manzili: " + user.getAddress() +
                        ", Mail: " + user.getEmail();
    }
}
