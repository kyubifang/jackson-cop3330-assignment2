package oop.assignment2.ex26;

public class PaymentCalculator {
    public String calculateMonthsUntilPaidOff(double b, double i, double p) {
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        i /= 365.0;
        i = Math.round(i);
        double x = (1.0/30.0);
        x = -x;
        double y = b/p;
        double temp = 1 + i;
        double z = Math.log(temp);
        temp = Math.pow(temp, 30.0);
        temp = 1.0 - temp;
        y *= temp;
        y += 1.0;
        y = Math.log(y);
        temp = x * y;
        z = (temp / z);
        String months = Double.toString(z);
        if(z % 1 == 0) {
            months = String.format("%.0f", z);
        }
        return months;
    }
}
