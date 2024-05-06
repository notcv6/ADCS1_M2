/**
 * Name/Programmer: Andrew Hernandez
 * Date: April 30, 2024
 * Assignment: 7.1.1 Classes & Objects Introduction
 * Purpose: Introduction to Classes & Objects
 */

public class DreamVacation
{
    private String destination;
    private double cost;
    private int duration;
    private String theme;
    private Boolean reality;

    public DreamVacation(String ds, double cs, int dr, String th, Boolean rl) {
        destination = ds;
        cost = cs;
        duration = dr;
        theme = th;
        reality = rl;
    }

    public DreamVacation() {
        destination = "unspecified";
        cost = 0.0;
        duration = 0;
        theme = "unknown";
        reality = false;
    }
    
    public String getDestination() {
        return destination;
    }

    public double getCost() {
        return cost;
    }

    public int getDuration() {
        return duration;
    }

    public String getTheme() {
        return theme;
    }

    public Boolean getReality() {
        return reality;
    }

    public void setDestination(String d) {
        destination = d;
    }

    public void setCost(double c) {
        cost = c;
    }

    public void setDuration(int d) {
        duration = d;
    }

    public void setTheme(String t) {
        theme = t;
    }

    public void setReality(Boolean r) {
        reality = r;
    }

    // toString; Returns a formatted string with the information of a person.
    public String toString() {
        return "Vacation "+destination+":"+
            "\n\tCost - "+cost+
            "\n\tDuration - "+duration+
            "\n\tTheme - "+theme+
            "\n\tReality - "+reality;
    }
}