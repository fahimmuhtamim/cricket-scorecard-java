public class Bowler extends Cricketer {
    private double overs;
    private int maidens;
    private int runsConceded;
    private int wickets;
    private double economy;

    public Bowler(String name, String team, int matches,
                  double overs, int maidens, int runsConceded, int wickets) {
        super(name, team, matches);
        this.overs = overs;
        this.maidens = maidens;
        this.runsConceded = runsConceded;
        this.wickets = wickets;
        this.economy = calculateEconomy();
    }

    private double calculateEconomy() {
        return (overs > 0) ? (runsConceded / overs) : 0.0;
    }

    // Getters and setters
    public double getOvers() {
        return overs;
    }

    public void setOvers(double overs) {
        this.overs = overs;
        this.economy = calculateEconomy();
    }

    public int getMaidens() {
        return maidens;
    }

    public void setMaidens(int maidens) {
        this.maidens = maidens;
    }

    public int getRunsConceded() {
        return runsConceded;
    }

    public void setRunsConceded(int runsConceded) {
        this.runsConceded = runsConceded;
        this.economy = calculateEconomy();
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public double getEconomy() {
        return economy;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", overs=" + overs +
                ", maidens=" + maidens +
                ", runsConceded=" + runsConceded +
                ", wickets=" + wickets +
                ", economy=" + String.format("%.2f", economy) +
                "}";
    }
}
