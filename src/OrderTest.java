public class OrderTest {
    public static void main(String[] args) {
        Order order = new OrderAction();
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        InvoiceGenerator invoiceService = new InvoiceService();
        invoiceService.generateInvoice("order_123.pdf");

        EmailNotifier emailService = new EmailService();
        emailService.sendEmailNotification("johndoe@example.com");
    }
}