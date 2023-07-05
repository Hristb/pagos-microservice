package com.hristb.pagosmicroservice.service;


public class PagosTarjetaPaypal implements IPagos {

	@Override
	public String grabarPago() {
		return "PAYPAL";
	}

}
