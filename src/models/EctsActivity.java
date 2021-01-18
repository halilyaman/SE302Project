package models;

public class EctsActivity {
    public final Integer number;
    public final Integer durationInHours;
    public final Integer workload;

    public EctsActivity(Integer number, Integer durationInHours, Integer workload) {
        this.number = number;
        this.durationInHours = durationInHours;
        this.workload = workload;
    }
}
