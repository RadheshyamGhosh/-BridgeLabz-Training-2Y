package methodsreferance;

import java.util.*;

class Invoice {
    String transactionId;
    Invoice(String id) { this.transactionId = id; }
    public String toString() { return "Invoice for Transaction: " + transactionId; }
}

public class InvoiceCreation {
    public static void main(String[] args) {
        List<String> ids = Arrays.asList("TXN1001", "TXN1002", "TXN1003");

        System.out.println("-- Generated Invoices --");
        ids.stream().map(Invoice::new).forEach(System.out::println);
    }
}
