package models;

public class EvaluationActivity {
    public final String semesterActivity;
    public final int number;
    public final int weigthing;

    public EvaluationActivity(String semesterActivity, int number, int weigthing) {
        this.semesterActivity = semesterActivity;
        this.number = number;
        this.weigthing = weigthing;
    }
}
