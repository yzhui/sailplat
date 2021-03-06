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
 * TblGoodsbrand generated by hbm2java
 */
@Entity
@Table(name = "tbl_goodsbrand", catalog = "sailplat")
public class TblGoodsbrand implements java.io.Serializable {

	private Long id;
	private TblAccessory tblAccessory;
	private TblBrandcategory tblBrandcategory;
	private TblUser tblUser;
	private Date addTime;
	private boolean deleteStatus;
	private boolean audit;
	private String name;
	private boolean recommend;
	private int sequence;
	private String remark;
	private Integer userStatus;
	private Boolean weixinShopRecommend;
	private Date weixinShopRecommendTime;
	private String firstWord;
	private Set<TblGoods> tblGoodses = new HashSet<TblGoods>(0);
	private Set<TblGoodstypeBrand> tblGoodstypeBrands = new HashSet<TblGoodstypeBrand>(0);

	public TblGoodsbrand() {
	}

	public TblGoodsbrand(boolean deleteStatus, boolean audit, boolean recommend, int sequence) {
		this.deleteStatus = deleteStatus;
		this.audit = audit;
		this.recommend = recommend;
		this.sequence = sequence;
	}

	public TblGoodsbrand(TblAccessory tblAccessory, TblBrandcategory tblBrandcategory, TblUser tblUser, Date addTime,
			boolean deleteStatus, boolean audit, String name, boolean recommend, int sequence, String remark,
			Integer userStatus, Boolean weixinShopRecommend, Date weixinShopRecommendTime, String firstWord,
			Set<TblGoods> tblGoodses, Set<TblGoodstypeBrand> tblGoodstypeBrands) {
		this.tblAccessory = tblAccessory;
		this.tblBrandcategory = tblBrandcategory;
		this.tblUser = tblUser;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.audit = audit;
		this.name = name;
		this.recommend = recommend;
		this.sequence = sequence;
		this.remark = remark;
		this.userStatus = userStatus;
		this.weixinShopRecommend = weixinShopRecommend;
		this.weixinShopRecommendTime = weixinShopRecommendTime;
		this.firstWord = firstWord;
		this.tblGoodses = tblGoodses;
		this.tblGoodstypeBrands = tblGoodstypeBrands;
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
	@JoinColumn(name = "brandLogo_id")
	public TblAccessory getTblAccessory() {
		return this.tblAccessory;
	}

	public void setTblAccessory(TblAccessory tblAccessory) {
		this.tblAccessory = tblAccessory;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id")
	public TblBrandcategory getTblBrandcategory() {
		return this.tblBrandcategory;
	}

	public void setTblBrandcategory(TblBrandcategory tblBrandcategory) {
		this.tblBrandcategory = tblBrandcategory;
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

	@Column(name = "audit", nullable = false)
	public boolean isAudit() {
		return this.audit;
	}

	public void setAudit(boolean audit) {
		this.audit = audit;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "recommend", nullable = false)
	public boolean isRecommend() {
		return this.recommend;
	}

	public void setRecommend(boolean recommend) {
		this.recommend = recommend;
	}

	@Column(name = "sequence", nullable = false)
	public int getSequence() {
		return this.sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	@Column(name = "remark")
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "userStatus")
	public Integer getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	@Column(name = "weixin_shop_recommend")
	public Boolean getWeixinShopRecommend() {
		return this.weixinShopRecommend;
	}

	public void setWeixinShopRecommend(Boolean weixinShopRecommend) {
		this.weixinShopRecommend = weixinShopRecommend;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "weixin_shop_recommendTime", length = 10)
	public Date getWeixinShopRecommendTime() {
		return this.weixinShopRecommendTime;
	}

	public void setWeixinShopRecommendTime(Date weixinShopRecommendTime) {
		this.weixinShopRecommendTime = weixinShopRecommendTime;
	}

	@Column(name = "first_word")
	public String getFirstWord() {
		return this.firstWord;
	}

	public void setFirstWord(String firstWord) {
		this.firstWord = firstWord;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblGoodsbrand")
	public Set<TblGoods> getTblGoodses() {
		return this.tblGoodses;
	}

	public void setTblGoodses(Set<TblGoods> tblGoodses) {
		this.tblGoodses = tblGoodses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblGoodsbrand")
	public Set<TblGoodstypeBrand> getTblGoodstypeBrands() {
		return this.tblGoodstypeBrands;
	}

	public void setTblGoodstypeBrands(Set<TblGoodstypeBrand> tblGoodstypeBrands) {
		this.tblGoodstypeBrands = tblGoodstypeBrands;
	}

}
