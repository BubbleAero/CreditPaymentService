public class Main {
    public static void main(String[] args) {
        double creditAmountRubles = 1_000_000;
        double interestRate = 9.99;
        double termOfCreditMonth = 12;

        CreditPaymentService service = new CreditPaymentService();

        double monthlyPayment = service.calculate(creditAmountRubles, interestRate, termOfCreditMonth);
        System.out.println("Сумма кредита: " + creditAmountRubles + " р.");
        System.out.println("Срок кредита: " + termOfCreditMonth + " месяцев");
        System.out.println("Процентная ставка: " + interestRate + "%");
        System.out.println("Ежемесячный платеж: " + monthlyPayment + " р.");
    }
}


