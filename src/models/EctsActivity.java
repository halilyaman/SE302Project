package models;

public class EctsActivity {
    public final String semesterActivity;
    public final int number;
    public final int durationInHours;
    public final int workload;

    public EctsActivity(String semesterActivity, int number, int durationInHours, int workload) {
        this.semesterActivity = semesterActivity;
        this.number = number;
        this.durationInHours = durationInHours;
        this.workload = workload;
    }
}
