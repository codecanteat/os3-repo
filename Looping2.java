//Kyaw Thura
class Looping2 {
	public static void main(String[] args) {
		float tuitionFeePerSemester = 6000;
		float semesterPerYear = 2;
		float annualFee;
		float interestRate = 1.02f;

		for(int i = 0 ; i < 5 ; i++)
		{
			if(i == 0){

			System.out.println("Tuition Fee for year "+ (i+1)+
				" is :: "+
				 (annualFee=
				 	(tuitionFeePerSemester*semesterPerYear)));
			}
			else{

			System.out.println("Tuition Fee for year "+ (i+1)+
				" is :: "+
				 (annualFee=
				 	(tuitionFeePerSemester*semesterPerYear*
				 		interestRate)));
			tuitionFeePerSemester = annualFee;
			}
		}
	}
}
