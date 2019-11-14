package com.shwet.contributor.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ack_pending")
public class Acknowledgement {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ackId;

	@Column(nullable = false)
	private long transId;

	public long getAckId() {
		return ackId;
	}

	public void setAckId(long ackId) {
		this.ackId = ackId;
	}

	public long getTransId() {
		return transId;
	}

	public void setTransId(long transId) {
		this.transId = transId;
	}

}
