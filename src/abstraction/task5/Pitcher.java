package abstraction.task5;

public class Pitcher extends BaseballPlayer {
    private Double inninggs;
    private Integer earnedruins;

    public Pitcher() {

    }

    public Pitcher(String sport, String team, String position, String firtname, String lastname, Integer atBats, Integer hits, Double inninggs, Integer earnedruins) {
        super(sport, team, position, firtname, lastname, atBats, hits);
        this.inninggs = inninggs;
        this.earnedruins = earnedruins;
    }

    public Double getInninggs() {
        return inninggs;
    }

    public void setInninggs(Double inninggs) {
        this.inninggs = inninggs;
    }

    public Integer getEarnedruins() {
        return earnedruins;
    }

    public void setEarnedruins(Integer earnedruins) {
        this.earnedruins = earnedruins;
    }

    public Double earnedRunAvarage(){
        return 0.0;
    }
}
