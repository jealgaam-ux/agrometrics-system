package com.acrometrica.agrometrica_system.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "registros_porcinos")
public class RegistroPorcino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreGranja;
    private LocalDateTime fechaRegistro;

    // Producción
    private Integer numeroAnimales;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double pesoInicial;
    private Double pesoFinal;
    private Integer muertos;
    private Integer vendidosProduccion;

    // Alimentación
    private Double consumoTotal;
    private Double consumoDiario;
    private Double precioKgAlimento;
    private Double desperdicio;

    // Sanidad
    private Integer enfermos;
    private Integer tratamientos;
    private Double costoMedicamentos;

    // Reproducción
    private Integer cerdas;
    private Integer partos;
    private Integer lechonesVivos;

    // Costos
    private Double costoAlimento;
    private Double costoManoObra;
    private Double costoEnergia;
    private Double costoOtros;

    // Ventas
    private Integer vendidosVenta;
    private Double pesoTotalVenta;
    private Double precioKgVenta;

    // Resultados
    private Double pesoGanado;
    private Double ica;
    private Double costoTotal;
    private Double ingreso;
    private Double utilidad;
    private Double rentabilidad;

    public RegistroPorcino() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreGranja() {
        return nombreGranja;
    }

    public void setNombreGranja(String nombreGranja) {
        this.nombreGranja = nombreGranja;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getNumeroAnimales() {
        return numeroAnimales;
    }

    public void setNumeroAnimales(Integer numeroAnimales) {
        this.numeroAnimales = numeroAnimales;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getPesoInicial() {
        return pesoInicial;
    }

    public void setPesoInicial(Double pesoInicial) {
        this.pesoInicial = pesoInicial;
    }

    public Double getPesoFinal() {
        return pesoFinal;
    }

    public void setPesoFinal(Double pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    public Integer getMuertos() {
        return muertos;
    }

    public void setMuertos(Integer muertos) {
        this.muertos = muertos;
    }

    public Integer getVendidosProduccion() {
        return vendidosProduccion;
    }

    public void setVendidosProduccion(Integer vendidosProduccion) {
        this.vendidosProduccion = vendidosProduccion;
    }

    public Double getConsumoTotal() {
        return consumoTotal;
    }

    public void setConsumoTotal(Double consumoTotal) {
        this.consumoTotal = consumoTotal;
    }

    public Double getConsumoDiario() {
        return consumoDiario;
    }

    public void setConsumoDiario(Double consumoDiario) {
        this.consumoDiario = consumoDiario;
    }

    public Double getPrecioKgAlimento() {
        return precioKgAlimento;
    }

    public void setPrecioKgAlimento(Double precioKgAlimento) {
        this.precioKgAlimento = precioKgAlimento;
    }

    public Double getDesperdicio() {
        return desperdicio;
    }

    public void setDesperdicio(Double desperdicio) {
        this.desperdicio = desperdicio;
    }

    public Integer getEnfermos() {
        return enfermos;
    }

    public void setEnfermos(Integer enfermos) {
        this.enfermos = enfermos;
    }

    public Integer getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(Integer tratamientos) {
        this.tratamientos = tratamientos;
    }

    public Double getCostoMedicamentos() {
        return costoMedicamentos;
    }

    public void setCostoMedicamentos(Double costoMedicamentos) {
        this.costoMedicamentos = costoMedicamentos;
    }

    public Integer getCerdas() {
        return cerdas;
    }

    public void setCerdas(Integer cerdas) {
        this.cerdas = cerdas;
    }

    public Integer getPartos() {
        return partos;
    }

    public void setPartos(Integer partos) {
        this.partos = partos;
    }

    public Integer getLechonesVivos() {
        return lechonesVivos;
    }

    public void setLechonesVivos(Integer lechonesVivos) {
        this.lechonesVivos = lechonesVivos;
    }

    public Double getCostoAlimento() {
        return costoAlimento;
    }

    public void setCostoAlimento(Double costoAlimento) {
        this.costoAlimento = costoAlimento;
    }

    public Double getCostoManoObra() {
        return costoManoObra;
    }

    public void setCostoManoObra(Double costoManoObra) {
        this.costoManoObra = costoManoObra;
    }

    public Double getCostoEnergia() {
        return costoEnergia;
    }

    public void setCostoEnergia(Double costoEnergia) {
        this.costoEnergia = costoEnergia;
    }

    public Double getCostoOtros() {
        return costoOtros;
    }

    public void setCostoOtros(Double costoOtros) {
        this.costoOtros = costoOtros;
    }

    public Integer getVendidosVenta() {
        return vendidosVenta;
    }

    public void setVendidosVenta(Integer vendidosVenta) {
        this.vendidosVenta = vendidosVenta;
    }

    public Double getPesoTotalVenta() {
        return pesoTotalVenta;
    }

    public void setPesoTotalVenta(Double pesoTotalVenta) {
        this.pesoTotalVenta = pesoTotalVenta;
    }

    public Double getPrecioKgVenta() {
        return precioKgVenta;
    }

    public void setPrecioKgVenta(Double precioKgVenta) {
        this.precioKgVenta = precioKgVenta;
    }

    public Double getPesoGanado() {
        return pesoGanado;
    }

    public void setPesoGanado(Double pesoGanado) {
        this.pesoGanado = pesoGanado;
    }

    public Double getIca() {
        return ica;
    }

    public void setIca(Double ica) {
        this.ica = ica;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Double getIngreso() {
        return ingreso;
    }

    public void setIngreso(Double ingreso) {
        this.ingreso = ingreso;
    }

    public Double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(Double utilidad) {
        this.utilidad = utilidad;
    }

    public Double getRentabilidad() {
        return rentabilidad;
    }

    public void setRentabilidad(Double rentabilidad) {
        this.rentabilidad = rentabilidad;
    }
}