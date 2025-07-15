public class Batsman extends Cricketer {
    private int runs;
    private int ballsFaced;
    private int fours;
    private int sixes;
    private double strikeRate;

    public Batsman(String name, String team, int matches,
                   int runs, int ballsFaced, int fours, int sixes) {
        super(name, team, matches);
        this.runs = runs;
        this.ballsFaced = ballsFaced;
        this.fours = fours;
        this.sixes = sixes;
        this.strikeRate = calculateStrikeRate();
    }

    private double calculateStrikeRate() {
        return (ballsFaced > 0) ? (runs * 100.0 / ballsFaced) : 0.0;
    }

    // Getters and setters
    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
        this.strikeRate = calculateStrikeRate();
    }

    public int getBallsFaced() {
        return ballsFaced;
    }

    public void setBallsFaced(int ballsFaced) {
        this.ballsFaced = ballsFaced;
        this.strikeRate = calculateStrikeRate();
    }

    public int getFours() {
        return fours;
    }

    public void setFours(int fours) {
        this.fours = fours;
    }

    public int getSixes() {
        return sixes;
    }

    public void setSixes(int sixes) {
        this.sixes = sixes;
    }

    public double getStrikeRate() {
        return strikeRate;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", runs=" + runs +
                ", ballsFaced=" + ballsFaced +
                ", fours=" + fours +
                ", sixes=" + sixes +
                ", strikeRate=" + String.format("%.2f", strikeRate) +
                "}";
    }
}

