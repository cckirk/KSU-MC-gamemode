package edu.Kennesaw.EsportsMC;

import java.util.List;

public class Speedrun {

    Main plugin;

    private long seed;
    private int border;
    private int timeLimit;
    private int spawnRadius;
    private List<String> objectives;
    private List<String> gamerules;

    public Speedrun(Main plugin) {
        this.plugin = plugin;
    }

    public void setSeed(long seed) {
        this.seed = seed;
    }

    public long getSeed() {
        return seed;
    }

}
