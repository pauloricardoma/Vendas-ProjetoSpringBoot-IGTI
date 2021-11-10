package com.pauloricardoma.vendas.DTO;

import java.time.LocalDate;

import com.pauloricardoma.vendas.entities.Compras;

public class ComprasDTO {
  
  private int id;
  private Double total_compra;
  private LocalDate data_compra;
  
  public ComprasDTO(int id, Double total_compra, LocalDate data_compra) {
    this.id = id;
    this.total_compra = total_compra;
    this.data_compra = data_compra;
  }

  public ComprasDTO(Compras entidade) {
    this.id = entidade.getId();
    this.total_compra = entidade.getTotal_compra();
    this.data_compra = entidade.getData_compra();
  }

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public Double getTotal_compra() {
    return total_compra;
  }
  public void setTotal_compra(Double total_compra) {
    this.total_compra = total_compra;
  }
  public LocalDate getData_compra() {
    return data_compra;
  }
  public void setData_compra(LocalDate data_compra) {
    this.data_compra = data_compra;
  }

}
