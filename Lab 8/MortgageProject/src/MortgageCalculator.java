import java.time.LocalDate;
import java.time.Period;

public class MortgageCalculator {

	public boolean isProfessionDeveloperOrArchitectOrScrumMaster(String profession) {
		if (profession.equals("Developer") || profession.equals("Architect") || profession.equals("Scrum master")) return true;
		return false;
	}
	
	public boolean isProfessionTesterOrSystemAdministratorOrTechnicalWriter(String profession) {
		if (profession.equals("Tester") || profession.equals("System Administrator") || profession.equals("Technical writer")) return true;
		return false;
	}

	public boolean isProfessionDepartmentHeadOrProfessor(String profession) {
		if (profession.equals("Department head") || profession.equals("Professor") ) return true;
		return false;
	}

	public double computeMortgageByProfessionAndIncome(String profession, double income) {
		double result = 0;
		if (2000<=income && income<3000) {
			if (isProfessionDeveloperOrArchitectOrScrumMaster(profession)) result = 160000;
			if (isProfessionTesterOrSystemAdministratorOrTechnicalWriter(profession)) result = 120000;
			if (isProfessionDepartmentHeadOrProfessor(profession)) result = 220000;
		}
		if (3000<=income && income<5000) {
			if (isProfessionDeveloperOrArchitectOrScrumMaster(profession)) result = 180000;
			if (isProfessionTesterOrSystemAdministratorOrTechnicalWriter(profession)) result = 140000;
			if (isProfessionDepartmentHeadOrProfessor(profession)) result = 250000;
		}
		if (5000<=income) {
			if (isProfessionDeveloperOrArchitectOrScrumMaster(profession)) result = 220000;
			if (isProfessionTesterOrSystemAdministratorOrTechnicalWriter(profession)) result = 160000;
			if (isProfessionDepartmentHeadOrProfessor(profession)) result = 280000;
		}
		return result;
	}
	
	public double computeMaxMortgage(int yearOfBirth, int month, int day, double monthlyIncome, boolean married, double monthlyIncomePartner, String profession) {
		double result=0;
		LocalDate today = LocalDate.now();
		LocalDate birthday = LocalDate.of(yearOfBirth, month, day);
		 
		Period p = Period.between(birthday, today);
		int age = p.getYears();

		if (age < 18) return 0;

		if (!married) {
			result = computeMortgageByProfessionAndIncome(profession, monthlyIncome);
			
		} else {
			double totalIncome = monthlyIncome + monthlyIncomePartner * 0.94; 
			result = computeMortgageByProfessionAndIncome(profession, totalIncome);
		}
		
		return result;
	}

}
