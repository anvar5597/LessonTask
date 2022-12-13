package abstraction.task5;

public class Player {
   public static Long objcount = 0L;
   private final Long id;
    private String sport;
    private String team;
    private String position;
    private String firtname;
    private String lastname;

    public Player() {
        objcount++;
        this.id = objcount;
    }

    public Player( String sport, String team, String position, String firtname, String lastname) {
        objcount++;
        this.id = objcount;
        this.sport = sport;
        this.team = team;
        this.position = position;
        this.firtname = firtname;
        this.lastname = lastname;
    }

    public Long getId() {
        return id;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFirtname() {
        return firtname;
    }

    public void setFirtname(String firtname) {
        this.firtname = firtname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", sport='" + sport + '\'' +
                ", team='" + team + '\'' +
                ", position='" + position + '\'' +
                ", firtname='" + firtname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
