package abstraction.task5;

public class BaseballPlayer extends Player {
    private Integer atBats;
    private Integer hits;

    public BaseballPlayer() {

    }

    public BaseballPlayer(String sport, String team, String position, String firtname, String lastname, Integer atBats, Integer hits) {
        super(sport, team, position, firtname, lastname);
        this.atBats = atBats;
        this.hits = hits;
    }

    public Integer getAtBats() {
        return atBats;
    }

    public void setAtBats(Integer atBats) {
        this.atBats = atBats;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }
    public Double battingAvarage(){
        return 0.0;
    }


}
