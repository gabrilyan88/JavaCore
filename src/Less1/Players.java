package Less1;

public class Players {

    private String name;
    private int canRun;
    private int canJump;

    public Players(String name, int canRun, int canJump) {
        this.name = name;
        this.canRun = canRun;
        this.canJump = canJump;
    }

    public void setCanRun(int canRun) {
        this.canRun = canRun;
    }

    public String getName() {
        return name;
    }

    public int getCanRun() {
        return canRun;
    }

    public int getCanJump() {
        return canJump;
    }
}
