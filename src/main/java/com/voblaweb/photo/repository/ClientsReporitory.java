package com.voblaweb.photo.repository;

import com.voblaweb.photo.model.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsReporitory extends JpaRepository<Clients,Integer> {
}
