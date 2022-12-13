package abstraction.task5;

public class Goaline  extends SoccerPlayer{
    private Integer goalsAllowed;

    public Goaline() {
    }

    public Goaline(String sport, String team, String position, String firtname, String lastname, int minutes, int goal, Integer goalsAllowed) {
        super(sport, team, position, firtname, lastname, minutes, goal);
        this.goalsAllowed = goalsAllowed;
    }

    public Integer getGoalsAllowed() {
        return goalsAllowed;
    }

    public void setGoalsAllowed(Integer goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }

}
