public class Allrounder extends Cricketer {
    private Batsman battingStats;
    private Bowler bowlingStats;

    public Allrounder(String name, String team, int matches,
                      int runs, int ballsFaced, int fours, int sixes,
                      double overs, int maidens, int runsConceded, int wickets) {
        super(name, team, matches);
        this.battingStats = new Batsman(name, team, matches, runs, ballsFaced, fours, sixes);
        this.bowlingStats = new Bowler(name, team, matches, overs, maidens, runsConceded, wickets);
    }

    public Batsman getBattingStats() {
        return battingStats;
    }

    public Bowler getBowlingStats() {
        return bowlingStats;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", Batting=" + battingStats.toString() +
                ", Bowling=" + bowlingStats.toString() +
                "}";
    }
}
