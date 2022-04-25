package ma.test.excel.excel;


import javax.persistence.Entity;

import com.poiji.annotation.*;


@Entity
public class Invoice {
	@ExcelRow                   
    private int rowIndex;
	
	@ExcelCellName("NAME")
	private String name;
	@ExcelCellName("Amount")
	private  Double amount;
	@ExcelCellName("Number")
	private String number;
	@ExcelCellName("ReceivedDate")
	private String receivedDate;
	
	@Override
	public String toString() {
		return "\nInvoiceExcel [ rowIndex=" + rowIndex + ", name=" + name + ", amount=" + amount + ", number=" + number
				+ ", receivedDate=" + receivedDate + "]\n";
	}
	

}
