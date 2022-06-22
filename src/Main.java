public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double credit = 1_000_000;
        double percent = 9.9;
        int year = 1;
        double payment = service.calculate(credit, percent, year);
        System.out.println("Сумма кредита: " + credit + " Рублей; Ставка: " + percent + " %; Срок кредита:" + year + " Лет");
        System.out.println("Ежемесячный платеж: " + Math.round(payment) + " Рублей");
        System.out.println();

        year = 2;
        payment = service.calculate(credit, percent, year);
        System.out.println("Сумма кредита: " + credit + " Рублей; Ставка: " + percent + " %; Срок кредита:" + year + " Лет");
        System.out.println("Ежемесячный платеж: " + Math.round(payment) + " Рублей");
        System.out.println();

        year = 3;
        payment = service.calculate(credit, percent, year);
        System.out.println("Сумма кредита: " + credit + " Рублей; Ставка: " + percent + " %; Срок кредита:" + year + " Лет");
        System.out.println("Ежемесячный платеж: " + Math.round(payment) + " Рублей");
        System.out.println();
    }
}
