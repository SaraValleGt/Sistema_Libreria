package com.example.librarysystem.service;

import com.example.librarysystem.model.Prestamo;
import com.example.librarysystem.repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrestamoService {
    @Autowired
    private PrestamoRepository prestamoRepository;

    public List<Prestamo> getAllPrestamos() {
        return prestamoRepository.findAll();
    }

    public Optional<Prestamo> getPrestamoById(Long id) {
        return prestamoRepository.findById(id);
    }

    public Prestamo savePrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    public void deletePrestamo(Long id) {
        prestamoRepository.deleteById(id);
    }
}

