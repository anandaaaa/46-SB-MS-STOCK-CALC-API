package in.anand.entity;

public class StockCalcApiResponse {
	
	private String CompanyName;
	private Double totalPrice;
	private Integer port;
	private Integer Quantity;
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public Integer getQuantity() {
		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "StockCalcApiResponse [CompanyName=" + CompanyName + ", totalPrice=" + totalPrice + ", port=" + port
				+ ", Quantity=" + Quantity + "]";
	}
	
	

}
