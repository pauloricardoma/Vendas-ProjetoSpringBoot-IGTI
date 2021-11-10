package com.pauloricardoma.vendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_compras") // create table tb_compras
public class Compras {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // incremento
  private int id;
  private Double totalCompra;
  private LocalDate dataCompra;

  @ManyToOne
  @JoinColumn(name = "cliente_id") // chave estrangeira
  private Cliente cliente; // relacionadas a um cliente

  public Compras(int id, Double totalCompra, LocalDate dataCompra, Cliente cliente) {
    this.id = id;
    this.totalCompra = totalCompra;
    this.dataCompra = dataCompra;
    this.cliente = cliente;
  }
  
  public Compras() {
  }

  public Compras(int id) {

  }

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public Double gettotalCompra() {
    return totalCompra;
  }
  public void settotalCompra(Double totalCompra) {
    this.totalCompra = totalCompra;
  }
  public LocalDate getdataCompra() {
    return dataCompra;
  }
  public void setdataCompra(LocalDate dataCompra) {
    this.dataCompra = dataCompra;
  }
  public Cliente getCliente() {
    return cliente;
  }
  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }
  
}
