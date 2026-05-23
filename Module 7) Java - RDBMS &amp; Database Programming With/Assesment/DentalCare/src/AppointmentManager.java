import java.util.ArrayList;

public class AppointmentManager {

    private ArrayList<Appointment> appointments = new ArrayList<>();

    public void bookAppointment(Appointment appointment) {

        appointments.add(appointment);
        System.out.println("Appointment booked successfully.");
    }

    public void showAppointments() {

        for (Appointment a : appointments) {
            System.out.println(a.getServiceType() + " - " + a.getAppointmentDate());
        }
    }
}