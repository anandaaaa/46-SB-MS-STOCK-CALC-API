package in.anand.entity;

public class StockPriceApiResponse {
	
	
	
	private String CompanyName;
	private Double StockPrice;
	private Integer port;
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public Double getStockPrice() {
		return StockPrice;
	}
	public void setStockPrice(Double stockPrice) {
		StockPrice = stockPrice;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	@Override
	public String toString() {
		return "StockPriceApiResponse [CompanyName=" + CompanyName + ", StockPrice=" + StockPrice + ", port=" + port
				+ "]";
	}
	
	
}
