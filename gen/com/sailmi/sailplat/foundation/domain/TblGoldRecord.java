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
 * TblGoldRecord generated by hbm2java
 */
@Entity
@Table(name = "tbl_gold_record", catalog = "sailplat")
public class TblGoldRecord implements java.io.Serializable {

	private Long id;
	private TblUser tblUserByGoldAdminId;
	private TblUser tblUserByGoldUserId;
	private Date addTime;
	private boolean deleteStatus;
	private String goldAdminInfo;
	private Date goldAdminTime;
	private int goldCount;
	private String goldExchangeInfo;
	private int goldMoney;
	private int goldPayStatus;
	private String goldPayment;
	private String goldSn;
	private int goldStatus;
	private Set<TblGoldLog> tblGoldLogs = new HashSet<TblGoldLog>(0);

	public TblGoldRecord() {
	}

	public TblGoldRecord(boolean deleteStatus, int goldCount, int goldMoney, int goldPayStatus, int goldStatus) {
		this.deleteStatus = deleteStatus;
		this.goldCount = goldCount;
		this.goldMoney = goldMoney;
		this.goldPayStatus = goldPayStatus;
		this.goldStatus = goldStatus;
	}

	public TblGoldRecord(TblUser tblUserByGoldAdminId, TblUser tblUserByGoldUserId, Date addTime, boolean deleteStatus,
			String goldAdminInfo, Date goldAdminTime, int goldCount, String goldExchangeInfo, int goldMoney,
			int goldPayStatus, String goldPayment, String goldSn, int goldStatus, Set<TblGoldLog> tblGoldLogs) {
		this.tblUserByGoldAdminId = tblUserByGoldAdminId;
		this.tblUserByGoldUserId = tblUserByGoldUserId;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.goldAdminInfo = goldAdminInfo;
		this.goldAdminTime = goldAdminTime;
		this.goldCount = goldCount;
		this.goldExchangeInfo = goldExchangeInfo;
		this.goldMoney = goldMoney;
		this.goldPayStatus = goldPayStatus;
		this.goldPayment = goldPayment;
		this.goldSn = goldSn;
		this.goldStatus = goldStatus;
		this.tblGoldLogs = tblGoldLogs;
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
	@JoinColumn(name = "gold_admin_id")
	public TblUser getTblUserByGoldAdminId() {
		return this.tblUserByGoldAdminId;
	}

	public void setTblUserByGoldAdminId(TblUser tblUserByGoldAdminId) {
		this.tblUserByGoldAdminId = tblUserByGoldAdminId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gold_user_id")
	public TblUser getTblUserByGoldUserId() {
		return this.tblUserByGoldUserId;
	}

	public void setTblUserByGoldUserId(TblUser tblUserByGoldUserId) {
		this.tblUserByGoldUserId = tblUserByGoldUserId;
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

	@Column(name = "gold_admin_info")
	public String getGoldAdminInfo() {
		return this.goldAdminInfo;
	}

	public void setGoldAdminInfo(String goldAdminInfo) {
		this.goldAdminInfo = goldAdminInfo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "gold_admin_time", length = 19)
	public Date getGoldAdminTime() {
		return this.goldAdminTime;
	}

	public void setGoldAdminTime(Date goldAdminTime) {
		this.goldAdminTime = goldAdminTime;
	}

	@Column(name = "gold_count", nullable = false)
	public int getGoldCount() {
		return this.goldCount;
	}

	public void setGoldCount(int goldCount) {
		this.goldCount = goldCount;
	}

	@Column(name = "gold_exchange_info")
	public String getGoldExchangeInfo() {
		return this.goldExchangeInfo;
	}

	public void setGoldExchangeInfo(String goldExchangeInfo) {
		this.goldExchangeInfo = goldExchangeInfo;
	}

	@Column(name = "gold_money", nullable = false)
	public int getGoldMoney() {
		return this.goldMoney;
	}

	public void setGoldMoney(int goldMoney) {
		this.goldMoney = goldMoney;
	}

	@Column(name = "gold_pay_status", nullable = false)
	public int getGoldPayStatus() {
		return this.goldPayStatus;
	}

	public void setGoldPayStatus(int goldPayStatus) {
		this.goldPayStatus = goldPayStatus;
	}

	@Column(name = "gold_payment")
	public String getGoldPayment() {
		return this.goldPayment;
	}

	public void setGoldPayment(String goldPayment) {
		this.goldPayment = goldPayment;
	}

	@Column(name = "gold_sn")
	public String getGoldSn() {
		return this.goldSn;
	}

	public void setGoldSn(String goldSn) {
		this.goldSn = goldSn;
	}

	@Column(name = "gold_status", nullable = false)
	public int getGoldStatus() {
		return this.goldStatus;
	}

	public void setGoldStatus(int goldStatus) {
		this.goldStatus = goldStatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblGoldRecord")
	public Set<TblGoldLog> getTblGoldLogs() {
		return this.tblGoldLogs;
	}

	public void setTblGoldLogs(Set<TblGoldLog> tblGoldLogs) {
		this.tblGoldLogs = tblGoldLogs;
	}

}