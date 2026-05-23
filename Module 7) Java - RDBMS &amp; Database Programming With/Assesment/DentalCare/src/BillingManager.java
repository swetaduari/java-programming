
public class BillingManager {

    public void generateInvoice(Bill bill) {

        double total = bill.calculateTotal();

        System.out.println("Invoice Generated");
        System.out.println("Total Amount: " + total);
    }
}
