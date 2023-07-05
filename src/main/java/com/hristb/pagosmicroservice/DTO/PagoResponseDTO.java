package com.hristb.pagosmicroservice.DTO;

import com.hristb.pagosmicroservice.entity.Pago;

public class PagoResponseDTO {

	private Pago datoPago;
	private String respuestaFactory;
	
	
	
	public PagoResponseDTO(Pago datoPago, String respuestaFactory) {
		super();
		this.datoPago = datoPago;
		this.respuestaFactory = respuestaFactory;
	}
	public Pago getDatoPago() {
		return datoPago;
	}
	public void setDatoPago(Pago datoPago) {
		this.datoPago = datoPago;
	}
	public String getRespuestaFactory() {
		return respuestaFactory;
	}
	public void setRespuestaFactory(String respuestaFactory) {
		this.respuestaFactory = respuestaFactory;
	}
	
	
}
