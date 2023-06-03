package com.example.billing.service.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill/service")
public class BillingResource {
	
@GetMapping("/status")
public String status() {
	return "from billingservice";
}
}
