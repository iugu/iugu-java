# iugu-java
###### Criando um Invoice (Creating a new Invoice)

```
Iugu.init("token do cliente");
InvoiceResponse response;

try {
	response = new InvoiceService().create(new Invoice("rfl.viana@gmail.com", new Date(), new Item("teste", 1, 100)));
	
	// Returns the ID of the created invoice
	System.out.println(response.getId());
}
catch (IuguException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
```