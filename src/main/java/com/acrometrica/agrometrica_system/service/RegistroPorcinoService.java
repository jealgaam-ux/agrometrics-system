package com.acrometrica.agrometrica_system.service;

import com.acrometrica.agrometrica_system.entity.RegistroPorcino;
import com.acrometrica.agrometrica_system.repository.RegistroPorcinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class RegistroPorcinoService {

    @Autowired
    private RegistroPorcinoRepository registroPorcinoRepository;

    public RegistroPorcino guardarConCalculos(RegistroPorcino registro) {

        double numeroAnimales = valor(registro.getNumeroAnimales());
        double pesoInicial = valor(registro.getPesoInicial());
        double pesoFinal = valor(registro.getPesoFinal());
        double consumoTotal = valor(registro.getConsumoTotal());
        double desperdicio = valor(registro.getDesperdicio());

        double costoAlimento = valor(registro.getCostoAlimento());
        double costoManoObra = valor(registro.getCostoManoObra());
        double costoEnergia = valor(registro.getCostoEnergia());
        double costoOtros = valor(registro.getCostoOtros());
        double costoMedicamentos = valor(registro.getCostoMedicamentos());

        double pesoTotalVenta = valor(registro.getPesoTotalVenta());
        double precioKgVenta = valor(registro.getPrecioKgVenta());

        double pesoGanado = (pesoFinal - pesoInicial) * numeroAnimales;
        double consumoReal = consumoTotal + (consumoTotal * (desperdicio / 100.0));
        double ica = pesoGanado > 0 ? consumoReal / pesoGanado : 0.0;

        double costoTotal = costoAlimento + costoManoObra + costoEnergia + costoOtros + costoMedicamentos;
        double ingreso = pesoTotalVenta * precioKgVenta;
        double utilidad = ingreso - costoTotal;
        double rentabilidad = costoTotal > 0 ? (utilidad / costoTotal) * 100.0 : 0.0;

        registro.setPesoGanado(pesoGanado);
        registro.setIca(ica);
        registro.setCostoTotal(costoTotal);
        registro.setIngreso(ingreso);
        registro.setUtilidad(utilidad);
        registro.setRentabilidad(rentabilidad);
        registro.setFechaRegistro(LocalDateTime.now());

        return registroPorcinoRepository.save(registro);
    }

    public List<RegistroPorcino> obtenerTodos() {
        return registroPorcinoRepository.findAll();
    }

    public RegistroPorcino obtenerPorId(Long id) {
        return registroPorcinoRepository.findById(id).orElse(null);
    }

    public List<RegistroPorcino> filtrar(String nombreGranja, LocalDate fecha) {
        boolean tieneNombre = nombreGranja != null && !nombreGranja.trim().isEmpty();
        boolean tieneFecha = fecha != null;

        if (tieneNombre && tieneFecha) {
            LocalDateTime inicio = fecha.atStartOfDay();
            LocalDateTime fin = fecha.atTime(23, 59, 59);
            return registroPorcinoRepository
                    .findByNombreGranjaContainingIgnoreCaseAndFechaRegistroBetween(nombreGranja, inicio, fin);
        }

        if (tieneNombre) {
            return registroPorcinoRepository.findByNombreGranjaContainingIgnoreCase(nombreGranja);
        }

        if (tieneFecha) {
            LocalDateTime inicio = fecha.atStartOfDay();
            LocalDateTime fin = fecha.atTime(23, 59, 59);
            return registroPorcinoRepository.findByFechaRegistroBetween(inicio, fin);
        }

        return registroPorcinoRepository.findAll();
    }

    private double valor(Number n) {
        return n == null ? 0.0 : n.doubleValue();
    }
}