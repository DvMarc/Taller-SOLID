package clases;

public class PagoPaypal implements Pago{

	private boolean loggedIn;//conexion a cuenta PayPal
	
	@Override
	public void realizarCobro(Factura factura) {
		if(!loggedIn) {
			logIn();
		}
		// cargar el monto de compra del medio de pago
	}
	
	public void logIn() {
		//solicita el logIn de la cuenta
	}
}
