# iugu-java
## Biblioteca de Java para Iugu.com (Java Library for Iugu.com)
###### Criando um Invoice (Creating a new Invoice)

```
IuguConfiguration iuguConfiguration = new IuguConfiguration("CLIENTTOKEN");
InvoiceResponse response;

try {
	response = new InvoiceService(iuguConfiguration).create(new Invoice("SOMEEMAIL@XXXX.XXXXX", new Date(), new Item("teste", 1, 100)));
	
	// Retorna ID do Invoice criado (Returns the ID of the created invoice)
	System.out.println(response.getId());
}
catch (IuguException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
```

###### Criando um pagamento (Creating a new Payment)
```
	try {
		IuguConfiguration iuguConfiguration = new IuguConfiguration("xxxxxx");
		
		//token cartão
		PaymentToken paymentToken = new PaymentToken();
		paymentToken.setAccountId("xxxxx");
		paymentToken.setPayableWith(PayableWith.CREDIT_CARD);
		
		paymentToken.setTest(Boolean.TRUE);
		paymentToken.setData(new Data("4111111111111111","123","Joao","Mateus","12","2019"));
		
		PaymentTokenResponse paymentTokenResponse = new PaymentTokenService(iuguConfiguration).create(paymentToken);/
	} catch (IuguException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
```

###### Criando um usuário (Creating a new User)
```
	try {
		IuguConfiguration iuguConfiguration = new IuguConfiguration("xxxxxx");
		
		Customer customerIugu = new Customer();
		customerIugu.setEmail("x@me.com");
		customerIugu.setName("Name");
		customerIugu.setNotes("more");
		customerIugu.setCpfCnpj("xxx.xxx.xxx-xx");
		customerIugu.setCcEmails("");
		customerIugu.setZipCode("xxxxx-xxx");
		customerIugu.setNumber(234);
		customerIugu.setStreet("xxxxxxx");
		customerIugu.setCity("xxxxxx");
		customerIugu.setState("xx");
		customerIugu.setDistrict("xxx");
		customerIugu.setComplement("");
		//customerIugu.setCustomVariables();
		
		CustomerResponse customerResponse = new CustomerService(iuguConfiguration).create(customerIugu);
	} catch (IuguException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
```