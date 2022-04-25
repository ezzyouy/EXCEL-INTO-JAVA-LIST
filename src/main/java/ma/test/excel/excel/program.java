package ma.test.excel.excel;

import java.io.File;
import java.util.List;

import com.poiji.bind.Poiji;

public class program {
	public static void main(String[] args) {
		
		File file = new File("./file.xlsx");
		List<Invoice> invoices = Poiji.fromExcel(file, Invoice.class);
		System.out.println("Printing List Data: " +invoices);
	}

}
