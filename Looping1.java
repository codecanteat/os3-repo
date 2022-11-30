
import java.util.Scanner;

class Looping1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		int workYear;
		int annualSaving;
		double interestRatePerYear = 0.03;
		int spendAnnually;
		double balance = 0.0;
		int remainingYear = 0;

		System.out.println();
		System.out.print("Enter remaining working years! :: ");
		workYear = sc.nextInt();

		System.out.print("Enter annual saving amount :: ");
		annualSaving = sc.nextInt();

		System.out.print("How much money you will spend in your retire life annually :: ");
		spendAnnually = sc.nextInt();
		System.out.println();

		for(int i = 0; i < workYear ; i++){
			if(i == 0){
				balance = annualSaving;
			}
			else{
				balance = (balance+(annualSaving*(1+interestRatePerYear)));
			}
			System.out.println("Year "+(i+1)+" saving :: "+balance);
		}
		System.out.println("Total saving is :: "+balance);
		System.out.println();

		do{
			balance = balance - spendAnnually;
			balance = balance*(1+interestRatePerYear);
			remainingYear++;
			if(balance > 0){

			System.out.println("Retire Year "+remainingYear+" balance is :: "+balance);
			}
			else {
				System.out.println();
			}

		}
		while(balance % spendAnnually > 0);
		System.out.println("You got "+(remainingYear-1)+" years of saving.");

	}
}
