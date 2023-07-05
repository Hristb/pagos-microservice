package com.hristb.pagosmicroservice.controller;



import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hristb.pagosmicroservice.DTO.PagoResponseDTO;
import com.hristb.pagosmicroservice.entity.Pago;
import com.hristb.pagosmicroservice.service.IPagos;
import com.hristb.pagosmicroservice.service.PagosFactory;

@RestController
@RequestMapping("/api/pagos")
public class PagoController {


	
	@PostMapping("/update")
	public PagoResponseDTO grabarPago(@RequestBody Pago pago) {
		 
		PagosFactory pagosFactory =  new PagosFactory(); 
		IPagos pagos =pagosFactory.obtenerPago(pago);
		return new PagoResponseDTO(pago,pagos.grabarPago());
	}

}
