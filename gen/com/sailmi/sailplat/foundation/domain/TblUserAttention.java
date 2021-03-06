package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:19 by Hibernate Tools 5.2.11.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblUserAttention generated by hbm2java
 */
@Entity
@Table(name = "tbl_user_attention", catalog = "sailplat")
public class TblUserAttention implements java.io.Serializable {

	private Long id;
	private TblUser tblUserByToUserId;
	private TblUser tblUserByFromUserId;
	private Date addTime;
	private boolean deleteStatus;

	public TblUserAttention() {
	}

	public TblUserAttention(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public TblUserAttention(TblUser tblUserByToUserId, TblUser tblUserByFromUserId, Date addTime,
			boolean deleteStatus) {
		this.tblUserByToUserId = tblUserByToUserId;
		this.tblUserByFromUserId = tblUserByFromUserId;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "toUser_id")
	public TblUser getTblUserByToUserId() {
		return this.tblUserByToUserId;
	}

	public void setTblUserByToUserId(TblUser tblUserByToUserId) {
		this.tblUserByToUserId = tblUserByToUserId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fromUser_id")
	public TblUser getTblUserByFromUserId() {
		return this.tblUserByFromUserId;
	}

	public void setTblUserByFromUserId(TblUser tblUserByFromUserId) {
		this.tblUserByFromUserId = tblUserByFromUserId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "addTime", length = 19)
	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	@Column(name = "deleteStatus", nullable = false)
	public boolean isDeleteStatus() {
		return this.deleteStatus;
	}

	public void setDeleteStatus(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

}
