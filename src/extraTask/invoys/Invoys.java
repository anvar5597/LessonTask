package extraTask.invoys;

public class Invoys {
    public static Long counterObj = 0L;
    private final Long id;
    private Integer cost;
    private Boolean status;
    private final String invoysNumber;

    private User paidlBy;

    public Invoys( String invoysNumber, int cost, Boolean status , User paidlBy) {
        counterObj++;
        this.id = counterObj;
        this.invoysNumber = invoysNumber;
        this.cost = cost;
        this.status = status;
        this.paidlBy = paidlBy;
    }

    public Long getId() {
        return id;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getInvoysNumber() {
        return invoysNumber;
    }

    public User getPaidlBy() {
        return paidlBy;
    }

    public void setPaidlBy(User paidlBy) {
        this.paidlBy = paidlBy;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", Ismi: "+ paidlBy.getName() +
                ", Logini: " + paidlBy.getLogin()+
                ", Paroli: " + paidlBy.getPasword()+
                ", To`lov summasi: " + cost +
                ", Statusi: " + status +
                ", InvoysNumber='" + invoysNumber ;
    }
}
