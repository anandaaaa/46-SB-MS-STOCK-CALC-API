package in.anand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.anand.client.StockPriceClient;
import in.anand.entity.StockCalcApiResponse;
import in.anand.entity.StockPriceApiResponse;

@Service
public class StockCalcService {
	
	@Autowired
	private StockPriceClient client;
	
	public StockCalcApiResponse getTotalPrice(String CompanyName,Integer Quantity)
	{
		System.out.println("CompanyName"+CompanyName);
		StockPriceApiResponse stockPrice = client.getStockPrice(CompanyName);
		Double TotalCost= stockPrice.getStockPrice() * Quantity;
		StockCalcApiResponse stockcalresponse = new StockCalcApiResponse();
		stockcalresponse.setCompanyName(CompanyName);
		stockcalresponse.setTotalPrice(TotalCost);
		stockcalresponse.setQuantity(Quantity);
		stockcalresponse.setPort(stockPrice.getPort());
		
		return stockcalresponse;
		
		
		
	}

}
