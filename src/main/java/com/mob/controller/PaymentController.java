package com.mob.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.mob.module.Account;
import com.mob.module.Cards;
import com.mob.module.SuccessResponse;

@RestController
public class PaymentController {


	@GetMapping(value="/saved-card")
	public ResponseEntity<Object> initialPayment(@RequestHeader("cem-key ") String cem
			,@RequestHeader("X-Correlation-Id ") String correlationId
			,@RequestHeader("X-Source-Channel") String sourceChannel
			,@RequestHeader("X-Transaction-Id ") String transactionId)
	{	
		// business logic
		Account ac=new Account("966562962084","MSISDN");
		Cards crd=new Cards("YWZBrZRmNy","411111xxxxxx1111","VISA", true);
		Cards crd1=new Cards("YWZBrZRmNy","411111xxxxxx1111","VISA", true);
		List<Cards> cards = new ArrayList<>(Arrays.asList(crd,crd1));
		SuccessResponse sResponse=new SuccessResponse(1,"msisdn",ac,cards);
		return new ResponseEntity<Object>(sResponse,HttpStatus.OK) ;

//		Status status=new Status("MAPI-7001","Validate Merchant Error","N","Validate Merchant Error","Validate Merchant Error");
//		BusinessError  businessError=new BusinessError(status);
//		return new ResponseEntity<Object>(businessError,HttpStatus.OK) ;
	

	}


}
