import java.util.Date;

import com.iugu.Iugu;
import com.iugu.model.Invoice;
import com.iugu.model.Item;
import com.iugu.responses.InvoiceResponse;
import com.iugu.services.InvoiceService;

public class Main {

	public static void main(String[] args) {
		Iugu.init("token do cliente");
		InvoiceResponse response = new InvoiceService().create(new Invoice("rfl.viana@gmail.com", new Date(), new Item("teste", 1, 100)));
		System.out.println(response.getId());
	}

}
