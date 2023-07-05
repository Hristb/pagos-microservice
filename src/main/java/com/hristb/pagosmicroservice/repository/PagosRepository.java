package com.hristb.pagosmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hristb.pagosmicroservice.entity.Pago;

public interface PagosRepository extends JpaRepository<Pago, Long> {

}
