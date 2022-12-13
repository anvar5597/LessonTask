package extraTask.invoys;

public class Invoys {
    public static Long counterObj = 0L;
    private final Long id;
    private String paidlyBy;
    private  final String invoysNumber;
    private Double cost;
    private Boolean status;


    public Invoys( String paidlyBy, String invoysNumber, Double cost, Boolean status) {
        counterObj++;
        this.id = counterObj;
        this.paidlyBy = paidlyBy;
        this.invoysNumber = invoysNumber;
        this.cost = cost;
        this.status = status;
    }

    public static Long getCounterObj() {
        return counterObj;
    }

    public static void setCounterObj(Long counterObj) {
        Invoys.counterObj = counterObj;
    }

    public Long getId() {
        return id;
    }

    public String getPaidlyBy() {
        return paidlyBy;
    }

    public void setPaidlyBy(String paidlyBy) {
        this.paidlyBy = paidlyBy;
    }

    public String getInvoysNumber() {
        return invoysNumber;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }





    @Override
    public String toString() {
        return "Invoys{" +
                "id=" + id +
                ", paidlyBy='" + paidlyBy + '\'' +
                ", invoysNumber='" + invoysNumber + '\'' +
                ", cost=" + cost +
                ", status=" + status +
                '}';
    }
}
