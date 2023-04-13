package entity;

import java.util.ArrayList;

public class LoL {
    ArrayList<Team> teams;
    private String StartTime;

    public LoL(ArrayList<Team> teams, String startTime) {
        this.teams = teams;
        StartTime = startTime;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    @Override
    public String toString() {
        return "LoL{" +
                "teams=" + teams +
                ", StartTime='" + StartTime + '\'' +
                '}';
    }

}
