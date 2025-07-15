public class Cricketer {
    private String name;
    private String team;
    private int matches;

    public Cricketer(String name, String team, int matches) {
        this.name = name;
        this.team = team;
        this.matches = matches;
    }

    // Basic getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    @Override
    public String toString() {
        return "Cricketer{name='" + name + "', team='" + team + "', matches=" + matches + "}";
    }
}
