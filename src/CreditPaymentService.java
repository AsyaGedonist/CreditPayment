public class CreditPaymentService {
    public double calculate(double credit, double percent, int year) {
        double index = ((percent / (100 * 12) * Math.pow((1 + (percent / (100 * 12))), year * 12))) / (Math.pow((1 + (percent / (100 * 12))), year * 12) - 1);
        double payment = credit * index;
        return payment;
    }
}
