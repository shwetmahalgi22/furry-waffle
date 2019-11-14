package com.shwet.contributor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shwet.contributor.models.Acknowledgement;
import com.sun.xml.bind.v2.model.core.ID;

public interface AcknowledgementRepository extends JpaRepository<Acknowledgement, ID> {
	List<Acknowledgement> findAll();
}
