import java.io.FileWriter;
import java.io.IOException;

public class InvoiceGenerator {

    public void exportInvoice(String patientName, double totalAmount) {

        try {

            FileWriter writer = new FileWriter("invoice.txt");

            writer.write("SmileCare Dental Clinic\n");
            writer.write("Patient Name: " + patientName + "\n");
            writer.write("Total Amount: " + totalAmount);

            writer.close();

        } catch (IOException e) {

            System.out.println("Error generating invoice");
        }
    }
}