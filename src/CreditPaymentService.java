class CreditPaymentService {
    public double calculate(double creditAmountRubles, double interestRate, double termOfCreditMonth) {
        double interestRatePerMonth = (interestRate / 100) / 12;
        return creditAmountRubles *
                (interestRatePerMonth * Math.pow(1 + interestRatePerMonth, termOfCreditMonth)) /
                (Math.pow(1 + interestRatePerMonth, termOfCreditMonth) - 1);
    }
}