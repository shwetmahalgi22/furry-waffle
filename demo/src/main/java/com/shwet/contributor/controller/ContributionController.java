package com.shwet.contributor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.shwet.contributor.models.Acknowledgement;
import com.shwet.contributor.models.Contribution;
import com.shwet.contributor.repository.AcknowledgementRepository;
import com.shwet.contributor.repository.ContributionRepository;

@RestController
@RequestMapping("/pay")
public class ContributionController {

	@Autowired
	private ContributionRepository contriRepo;

	@Autowired
	private AcknowledgementRepository ackRepo;

	@GetMapping
	public List<Contribution> findAll() {
		return contriRepo.findAll();
	}

	@GetMapping("/user/{userId}")
	public List<Contribution> findByUserId(@PathVariable String userId) {
		return contriRepo.findByUserId(userId);
	}

	@GetMapping("/user/month/{userId}/{month}")
	public List<Contribution> findByUserMonth(@PathVariable String month, String userId) {
		return contriRepo.findByUserMonth(month, userId);
	}

	@GetMapping("/month/{month}")
	public List<Contribution> findByMonth(@PathVariable String month) {
		return contriRepo.findByMonth(month);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Contribution create(@RequestBody Contribution contribution) {
		System.out.println("Here is something");
		Contribution contri = contriRepo.save(contribution);
		Acknowledgement ack = new Acknowledgement();
		ack.setTransId(contri.getTransId());
		queueForAcknowledgement(ack);
		return contri;
	}

	private void queueForAcknowledgement(Acknowledgement ack) {
		ackRepo.save(ack);
	}
}
