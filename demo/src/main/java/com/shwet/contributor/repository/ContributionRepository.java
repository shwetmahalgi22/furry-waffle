package com.shwet.contributor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shwet.contributor.models.Contribution;

public interface ContributionRepository extends JpaRepository<Contribution, Long> {
	List<Contribution> findByUserId(String userId);

	@Query(value= "SELECT * FROM contribution t where t.month = ?1 AND t.userid = ?2", nativeQuery = true)
	List<Contribution> findByUserMonth(String month, String userId);

	List<Contribution> findByMonth(String month);
}
