package models;

public class Clopq {
    // Clopq = "Course Learning Outcome and Program Qualification"
    final public String outcome;
    final public Integer contributionLevel;

    public Clopq(String outcome, Integer contributionLevel) {
        this.outcome = outcome;
        this.contributionLevel = contributionLevel;
    }
}
