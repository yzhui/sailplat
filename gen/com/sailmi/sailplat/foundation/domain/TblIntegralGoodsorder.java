package com.sailmi.sailplat.foundation.domain;
// Generated 2019-3-19 16:57:19 by Hibernate Tools 5.2.11.Final

import java.math.BigDecimal;
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
 * TblIntegralGoodsorder generated by hbm2java
 */
@Entity
@Table(name = "tbl_integral_goodsorder", catalog = "sailplat")
public class TblIntegralGoodsorder implements java.io.Serializable {

	private Long id;
	private TblAddress tblAddress;
	private TblUser tblUser;
	private Date addTime;
	private boolean deleteStatus;
	private String igoMsg;
	private String igoOrderSn;
	private String igoPayMsg;
	private Date igoPayTime;
	private String igoPayment;
	private String igoShipCode;
	private String igoShipContent;
	private Date igoShipTime;
	private int igoStatus;
	private int igoTotalIntegral;
	private BigDecimal igoTransFee;
	private Set<TblIntegralGoodscart> tblIntegralGoodscarts = new HashSet<TblIntegralGoodscart>(0);

	public TblIntegralGoodsorder() {
	}

	public TblIntegralGoodsorder(boolean deleteStatus, int igoStatus, int igoTotalIntegral) {
		this.deleteStatus = deleteStatus;
		this.igoStatus = igoStatus;
		this.igoTotalIntegral = igoTotalIntegral;
	}

	public TblIntegralGoodsorder(TblAddress tblAddress, TblUser tblUser, Date addTime, boolean deleteStatus,
			String igoMsg, String igoOrderSn, String igoPayMsg, Date igoPayTime, String igoPayment, String igoShipCode,
			String igoShipContent, Date igoShipTime, int igoStatus, int igoTotalIntegral, BigDecimal igoTransFee,
			Set<TblIntegralGoodscart> tblIntegralGoodscarts) {
		this.tblAddress = tblAddress;
		this.tblUser = tblUser;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.igoMsg = igoMsg;
		this.igoOrderSn = igoOrderSn;
		this.igoPayMsg = igoPayMsg;
		this.igoPayTime = igoPayTime;
		this.igoPayment = igoPayment;
		this.igoShipCode = igoShipCode;
		this.igoShipContent = igoShipContent;
		this.igoShipTime = igoShipTime;
		this.igoStatus = igoStatus;
		this.igoTotalIntegral = igoTotalIntegral;
		this.igoTransFee = igoTransFee;
		this.tblIntegralGoodscarts = tblIntegralGoodscarts;
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
	@JoinColumn(name = "igo_addr_id")
	public TblAddress getTblAddress() {
		return this.tblAddress;
	}

	public void setTblAddress(TblAddress tblAddress) {
		this.tblAddress = tblAddress;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "igo_user_id")
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

	@Column(name = "igo_msg")
	public String getIgoMsg() {
		return this.igoMsg;
	}

	public void setIgoMsg(String igoMsg) {
		this.igoMsg = igoMsg;
	}

	@Column(name = "igo_order_sn")
	public String getIgoOrderSn() {
		return this.igoOrderSn;
	}

	public void setIgoOrderSn(String igoOrderSn) {
		this.igoOrderSn = igoOrderSn;
	}

	@Column(name = "igo_pay_msg")
	public String getIgoPayMsg() {
		return this.igoPayMsg;
	}

	public void setIgoPayMsg(String igoPayMsg) {
		this.igoPayMsg = igoPayMsg;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "igo_pay_time", length = 19)
	public Date getIgoPayTime() {
		return this.igoPayTime;
	}

	public void setIgoPayTime(Date igoPayTime) {
		this.igoPayTime = igoPayTime;
	}

	@Column(name = "igo_payment")
	public String getIgoPayment() {
		return this.igoPayment;
	}

	public void setIgoPayment(String igoPayment) {
		this.igoPayment = igoPayment;
	}

	@Column(name = "igo_ship_code")
	public String getIgoShipCode() {
		return this.igoShipCode;
	}

	public void setIgoShipCode(String igoShipCode) {
		this.igoShipCode = igoShipCode;
	}

	@Column(name = "igo_ship_content")
	public String getIgoShipContent() {
		return this.igoShipContent;
	}

	public void setIgoShipContent(String igoShipContent) {
		this.igoShipContent = igoShipContent;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "igo_ship_time", length = 10)
	public Date getIgoShipTime() {
		return this.igoShipTime;
	}

	public void setIgoShipTime(Date igoShipTime) {
		this.igoShipTime = igoShipTime;
	}

	@Column(name = "igo_status", nullable = false)
	public int getIgoStatus() {
		return this.igoStatus;
	}

	public void setIgoStatus(int igoStatus) {
		this.igoStatus = igoStatus;
	}

	@Column(name = "igo_total_integral", nullable = false)
	public int getIgoTotalIntegral() {
		return this.igoTotalIntegral;
	}

	public void setIgoTotalIntegral(int igoTotalIntegral) {
		this.igoTotalIntegral = igoTotalIntegral;
	}

	@Column(name = "igo_trans_fee", precision = 12)
	public BigDecimal getIgoTransFee() {
		return this.igoTransFee;
	}

	public void setIgoTransFee(BigDecimal igoTransFee) {
		this.igoTransFee = igoTransFee;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblIntegralGoodsorder")
	public Set<TblIntegralGoodscart> getTblIntegralGoodscarts() {
		return this.tblIntegralGoodscarts;
	}

	public void setTblIntegralGoodscarts(Set<TblIntegralGoodscart> tblIntegralGoodscarts) {
		this.tblIntegralGoodscarts = tblIntegralGoodscarts;
	}

}