package com.hristb.pagosmicroservice.service;


import org.springframework.stereotype.Service;
import com.hristb.pagosmicroservice.entity.Pago;

@Service
public class PagosFactory {
	
	public IPagos obtenerPago(Pago pago) {
		
		if(pago.getTipoTarjeta().equals("PAYPAL")) {
			return new PagosTarjetaPaypal(); 
		}else {
			return new PagosTarjetaCreditoImpl();
		}
		
	}

}
