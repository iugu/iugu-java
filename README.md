# iugu-java
## Biblioteca de Java para Iugu.com (Java Library for Iugu.com)
###### Criando um Invoice (Creating a new Invoice)

```
Iugu.init("CLIENTTOKEN"); // Token do Cliente (Client Token)
InvoiceResponse response;

try {
	response = new InvoiceService().create(new Invoice("SOMEEMAIL@XXXX.XXXXX", new Date(), new Item("teste", 1, 100)));
	
	// Retorna ID do Invoice criado (Returns the ID of the created invoice)
	System.out.println(response.getId());
}
catch (IuguException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
```