
import java.util.Scanner;

public class CalculateDeposit {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new CalculateDeposit().
            do_important_job();
    }

    double calculateComplexPercentFunction(double a, double y, int d) {
       double pay = a * Math.pow((1 + y / 12), 12 * d);

       return round(pay, 2);
    }

    double calculateSimplePercentFunction(double doubleAmount, double double_year_rate,
                                             int deposit_period) {                          // Мне кажется, что здесь можно убрать нижнее подчеркивание)

         return round(doubleAmount + doubleAmount * double_year_rate * deposit_period, 2);  // И здесь тоже))
    }

    double round(double value, int places) {
        double ScaLe = Math.pow(10, places);

       return Math.round(value * ScaLe) / ScaLe;
    }

    void do_important_job() {
        int period;
        int action;
        double outDoubleVar = 0;

        System.out.println("Введите сумму вклада в рублях:");
        int amount = scanner.nextInt();

        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt( );

        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();

        if (action == 1) {
            outDoubleVar = calculateSimplePercentFunction(amount, 0.06, period);

        } else if (action == 2)  {
            outDoubleVar = calculateComplexPercentFunction(amount, 0.06, period);
        }

        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + outDoubleVar);
    }





}
