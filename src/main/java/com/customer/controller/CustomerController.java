package com.customer.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entity.CustomerInfo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {

	private static List<CustomerInfo> listCust=new ArrayList<>();
	
	  static {
		  
		  listCust.add(new CustomerInfo("Rahul", "Singh", "rahul","rahul@gmail.com","add"," add2" ,"siwan","Bihar","841506",123254 ));
		  listCust.add(new CustomerInfo("Kausal", "Kishore", " kausal","kausal@gmail.com ","add","add2" ,"siwan","Delhi","841505", 1500245)); 
		 
		  }
	  
	  private static Random random=new Random();
	
	  @PostMapping("/accounts")
		public String createAccount( @RequestBody CustomerInfo custm    ){
			this.listCust.add(custm);
			//System.out.println(listCust);
			// String uid = UUID.randomUUID().toString();
			custm.setAccountNumber(random.nextInt());
			 return "Dear customer congratulations ! you have successfully  completed onboarding and  account Id  "+"BFSNA"+custm.getAccountNumber();
			 
		}

	
	@GetMapping("/creditcheck/{userName}")
	public String  getHistoryCreditCheck(@PathVariable String userName) {
		
		   //System.out.println("***************************************************");
		// System.out.println("backend history score method !!"); 
		   System.out.println(userName);
		Map<String,Integer> creditMap=new LinkedHashMap<>();
	      creditMap.put("mukesh",500);
		  creditMap.put("rahul", 300);
		  creditMap.put("monu",450);
		  
		  if (creditMap.containsKey(userName)) { 
			 
		if(	creditMap.get("mukesh")>300);
			 //  System.out.println("You are allowed to create account");
		 return "You are allowed to create account";
		
		  }else  
			   return "You are not allowed to create account";
		
	   
	}	

	@GetMapping("/address/{pin}")
	public String getAddres(@PathVariable String pin  ){
        System.out.println("validating address using pin");
		System.out.println(pin);
		  if(pin.length()==6) {
			  HashMap<String,String> hm=new HashMap<>();
			  hm.put("k0", "Address is valid");
			 return  hm.get("k0");
		  }
		  else {
			  HashMap<String,String> hm=new HashMap<>();
			  hm.put("k1", "Address is not valid");
			return  hm.get("k1");
		  }	
	}
}
