public class Level {
    private boolean goalReached;
    private int points;

    public boolean goalReached()
    {
        return goalReached;
    }
    public void reachGoal()
    {
        goalReached = true;
    }
}
