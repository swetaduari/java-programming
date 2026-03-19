import java.time.LocalDateTime;

public class Appointment {

    private int appointmentId;
    private Patient patient;
    private String serviceType;
    private LocalDateTime appointmentDate;
    private double estimatedCost;
   

    public Appointment(int appointmentId, Patient patient,
                       String serviceType, LocalDateTime appointmentDate,
                       double estimatedCost) {

        this.appointmentId = appointmentId;
        this.patient = patient;
        this.serviceType = serviceType;
        this.appointmentDate = appointmentDate;
        this.estimatedCost = estimatedCost;
    }

    public String getServiceType() {
        return serviceType;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }
}