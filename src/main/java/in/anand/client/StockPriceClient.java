package in.anand.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import in.anand.entity.StockPriceApiResponse;

@FeignClient(name="STOCK-PRICE-API")
public interface StockPriceClient {
	
	@GetMapping("/price/{CompanyName}")
	public StockPriceApiResponse getStockPrice(@PathVariable String CompanyName);

}
