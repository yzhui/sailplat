package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:19 by Hibernate Tools 5.2.11.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblGoodsReturn generated by hbm2java
 */
@Entity
@Table(name = "tbl_goods_return", catalog = "sailplat")
public class TblGoodsReturn implements java.io.Serializable {

	private Long id;
	private TblOrderform tblOrderform;
	private TblUser tblUser;
	private Date addTime;
	private boolean deleteStatus;
	private String returnId;
	private String returnInfo;
	private Set<TblGoodsReturnlog> tblGoodsReturnlogs = new HashSet<TblGoodsReturnlog>(0);
	private Set<TblGoodsReturnitem> tblGoodsReturnitems = new HashSet<TblGoodsReturnitem>(0);

	public TblGoodsReturn() {
	}

	public TblGoodsReturn(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public TblGoodsReturn(TblOrderform tblOrderform, TblUser tblUser, Date addTime, boolean deleteStatus,
			String returnId, String returnInfo, Set<TblGoodsReturnlog> tblGoodsReturnlogs,
			Set<TblGoodsReturnitem> tblGoodsReturnitems) {
		this.tblOrderform = tblOrderform;
		this.tblUser = tblUser;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.returnId = returnId;
		this.returnInfo = returnInfo;
		this.tblGoodsReturnlogs = tblGoodsReturnlogs;
		this.tblGoodsReturnitems = tblGoodsReturnitems;
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
	@JoinColumn(name = "of_id")
	public TblOrderform getTblOrderform() {
		return this.tblOrderform;
	}

	public void setTblOrderform(TblOrderform tblOrderform) {
		this.tblOrderform = tblOrderform;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	public TblUser getTblUser() {
		return this.tblUser;
	}

	public void setTblUser(TblUser tblUser) {
		this.tblUser = tblUser;
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

	@Column(name = "return_id")
	public String getReturnId() {
		return this.returnId;
	}

	public void setReturnId(String returnId) {
		this.returnId = returnId;
	}

	@Column(name = "return_info")
	public String getReturnInfo() {
		return this.returnInfo;
	}

	public void setReturnInfo(String returnInfo) {
		this.returnInfo = returnInfo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblGoodsReturn")
	public Set<TblGoodsReturnlog> getTblGoodsReturnlogs() {
		return this.tblGoodsReturnlogs;
	}

	public void setTblGoodsReturnlogs(Set<TblGoodsReturnlog> tblGoodsReturnlogs) {
		this.tblGoodsReturnlogs = tblGoodsReturnlogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblGoodsReturn")
	public Set<TblGoodsReturnitem> getTblGoodsReturnitems() {
		return this.tblGoodsReturnitems;
	}

	public void setTblGoodsReturnitems(Set<TblGoodsReturnitem> tblGoodsReturnitems) {
		this.tblGoodsReturnitems = tblGoodsReturnitems;
	}

}