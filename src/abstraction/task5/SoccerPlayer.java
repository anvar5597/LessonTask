package abstraction.task5;

public class SoccerPlayer extends Player{
    private int minutes;
    private int goal;

    public SoccerPlayer() {
    }

    public SoccerPlayer(String sport, String team, String position, String firtname, String lastname, int minutes, int goal) {
        super(sport, team, position, firtname, lastname);
        this.minutes = minutes;
        this.goal = goal;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public Double goalsPerGame(){
        return 0.0;
    }
}
