import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Program();
    }
    public static void Program() {
        // How much do you make per year according to how many hours you work per week, and your hourly pay

        Scanner in = new Scanner(System.in);


        System.out.println("=== How much do you make per year? ===");

        System.out.print("Enter how many hours you work per week? ");
        double hrsperweek = in.nextDouble();

        System.out.print("Enter how much you make per hour? ");
        double perhr = in.nextDouble();

        double total = (hrsperweek * 52 * perhr);

        System.out.printf("You make %.2f per year ", total);

        // if statements are to calculate how much taxes that the user will have to pay according to https://www.forbes.com/advisor/taxes/taxes-federal-income-tax-bracket/#:~:text=For%20the%202022%20tax%20year,filing%20status%20and%20taxable%20income.

        if(total <= 10275) {
            System.out.print(total*.10);
        } else if(total>10275 && total<=41775) {
            System.out.printf("and will pay %.2f in taxes", total*.12+1027.50);
        } else if(total>41775 && total<=89075) {
            System.out.printf("and will pay %.2f in taxes", total*.22+4807.50);
        } else if(total>89075 && total<=170050) {
            System.out.printf("and will pay %.2f in taxes", total*.24+15213.50);
        } else if(total>170050 && total<=215950) {
            System.out.printf("and will pay %.2f in taxes", total*.32+34647.50);
        } else if(total>215950 && total<=323950) {
            System.out.printf("and will pay %.2f in taxes", total*.35+49335.50);
        } else if(total>323925) {
            System.out.printf("and will pay %.2f in taxes",total*.37+162718);
        }
    }
}



