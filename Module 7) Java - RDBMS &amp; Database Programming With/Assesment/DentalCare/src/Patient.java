public class Patient {

    private int patientId;
    private String name;
    private String phone;
    private String insuranceProvider;
    private double insuranceDiscount;

    public Patient(int patientId, String name, String phone,
                   String insuranceProvider, double insuranceDiscount) {

        this.patientId = patientId;
        this.name = name;
        this.phone = phone;
        this.insuranceProvider = insuranceProvider;
        this.insuranceDiscount = insuranceDiscount;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public double getInsuranceDiscount() {
        return insuranceDiscount;
    }
}