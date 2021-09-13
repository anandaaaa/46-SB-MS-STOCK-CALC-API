package in.anand.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.anand.entity.StockCalcApiResponse;
import in.anand.service.StockCalcService;

@RestController
public class StockCalcApiRestController {
	
	@Autowired
	private StockCalcService service;
	
	@GetMapping("/calc/{CompanyName}/{Quantity}")
	public StockCalcApiResponse getTotalStockPrice(@PathVariable String CompanyName,@PathVariable Integer Quantity )
	{
		return service.getTotalPrice(CompanyName, Quantity);
		
	}

}
