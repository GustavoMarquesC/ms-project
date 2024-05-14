package com.gustavomarques.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gustavomarques.hrpayroll.entities.Worker;

@FeignClient(name = "hr-worker", url = "localhost:8001", path = "/workers")
@Component
public interface WorkerFeignClient {
	
	@GetMapping(value = "/{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id);

}
