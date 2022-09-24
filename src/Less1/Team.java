package Less1;

public class Team {
    private String name;
    private Players[] player;

    public Team(String name, Players[] player) {
        this.name = name;
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public Players[] getPlayer() {
        return player;
    }
}
