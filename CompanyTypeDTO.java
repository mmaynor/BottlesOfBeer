
public class CompanyTypeDTO {

	private String color;
	private String qty;
	private String size;
	
	public CompanyTypeDTO() {
		
	}
	
	public CompanyTypeDTO(String color, String qty, String size) {
		this.color = color;
		this.qty = qty;
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CompanyTypeDTO [color=");
		builder.append(color);
		builder.append(", qty=");
		builder.append(qty);
		builder.append(", size=");
		builder.append(size);
		builder.append("]");
		return builder.toString();
	}

}
