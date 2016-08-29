# iugu-java
Iugu.init("token do cliente");
InvoiceResponse response;
try {
	response = new InvoiceService().create(new Invoice("rfl.viana@gmail.com", new Date(), new Item("teste", 1, 100)));
	System.out.println(response.getId());
} catch (IuguException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}