package com.javatechie.spring.soap.api.loaneligibility.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.spring.soap.api.loaneligibility.Acknowledgement;
import com.javatechie.spring.soap.api.loaneligibility.CustomerRequest;

@Service
public class LoanEligibilityService {
	
	public Acknowledgement checkLoanEligibility(CustomerRequest request){
		
		Acknowledgement acknowledgement = new Acknowledgement();
		
		List<String> mismatchCriterialList = acknowledgement.getCriteriaMismatch();
		
		if(!(request.getAge() > 30 && request.getAge() <= 60)) {
			mismatchCriterialList.add("Person age should in between 30 to 60");
		}
		if(!(request.getYearlyIncome() > 200000)) {
			mismatchCriterialList.add("Minimum income should be more than 200000");
		}
		if(!(request.getCibilScore() > 500)) {
			mismatchCriterialList.add("Low CIBIL Score please try after 6 month");
		}
		
		
		if(mismatchCriterialList.size() > 0) {
			acknowledgement.setApprovedAmount(0);
			acknowledgement.setIsEligible(false);
		}else {
			acknowledgement.setApprovedAmount(request.getAmount());
			acknowledgement.setIsEligible(true);
			mismatchCriterialList.clear();
		}
		
		
		return acknowledgement;
	}

}
