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
 * TblGoodsclass generated by hbm2java
 */
@Entity
@Table(name = "tbl_goodsclass", catalog = "sailplat")
public class TblGoodsclass implements java.io.Serializable {

	private Long id;
	private TblAccessory tblAccessory;
	private TblGoodsclass tblGoodsclass;
	private TblGoodstype tblGoodstype;
	private Date addTime;
	private boolean deleteStatus;
	private String className;
	private boolean display;
	private int level;
	private boolean recommend;
	private int sequence;
	private String seoDescription;
	private String seoKeywords;
	private String iconSys;
	private Integer iconType;
	private Set<TblGoodsclassstaple> tblGoodsclassstaples = new HashSet<TblGoodsclassstaple>(0);
	private Set<TblGoods> tblGoodses = new HashSet<TblGoods>(0);
	private Set<TblGoodsclassArticleClass> tblGoodsclassArticleClasses = new HashSet<TblGoodsclassArticleClass>(0);
	private Set<TblHomepageGoodsclass> tblHomepageGoodsclasses = new HashSet<TblHomepageGoodsclass>(0);
	private Set<TblGoodsclassArticle> tblGoodsclassArticles = new HashSet<TblGoodsclassArticle>(0);
	private Set<TblHomepageGoodsclassLog> tblHomepageGoodsclassLogs = new HashSet<TblHomepageGoodsclassLog>(0);
	private Set<TblDistrictsGoodsclass> tblDistrictsGoodsclasses = new HashSet<TblDistrictsGoodsclass>(0);
	private Set<TblGoodsclass> tblGoodsclasses = new HashSet<TblGoodsclass>(0);

	public TblGoodsclass() {
	}

	public TblGoodsclass(boolean deleteStatus, boolean display, int level, boolean recommend, int sequence) {
		this.deleteStatus = deleteStatus;
		this.display = display;
		this.level = level;
		this.recommend = recommend;
		this.sequence = sequence;
	}

	public TblGoodsclass(TblAccessory tblAccessory, TblGoodsclass tblGoodsclass, TblGoodstype tblGoodstype,
			Date addTime, boolean deleteStatus, String className, boolean display, int level, boolean recommend,
			int sequence, String seoDescription, String seoKeywords, String iconSys, Integer iconType,
			Set<TblGoodsclassstaple> tblGoodsclassstaples, Set<TblGoods> tblGoodses,
			Set<TblGoodsclassArticleClass> tblGoodsclassArticleClasses,
			Set<TblHomepageGoodsclass> tblHomepageGoodsclasses, Set<TblGoodsclassArticle> tblGoodsclassArticles,
			Set<TblHomepageGoodsclassLog> tblHomepageGoodsclassLogs,
			Set<TblDistrictsGoodsclass> tblDistrictsGoodsclasses, Set<TblGoodsclass> tblGoodsclasses) {
		this.tblAccessory = tblAccessory;
		this.tblGoodsclass = tblGoodsclass;
		this.tblGoodstype = tblGoodstype;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.className = className;
		this.display = display;
		this.level = level;
		this.recommend = recommend;
		this.sequence = sequence;
		this.seoDescription = seoDescription;
		this.seoKeywords = seoKeywords;
		this.iconSys = iconSys;
		this.iconType = iconType;
		this.tblGoodsclassstaples = tblGoodsclassstaples;
		this.tblGoodses = tblGoodses;
		this.tblGoodsclassArticleClasses = tblGoodsclassArticleClasses;
		this.tblHomepageGoodsclasses = tblHomepageGoodsclasses;
		this.tblGoodsclassArticles = tblGoodsclassArticles;
		this.tblHomepageGoodsclassLogs = tblHomepageGoodsclassLogs;
		this.tblDistrictsGoodsclasses = tblDistrictsGoodsclasses;
		this.tblGoodsclasses = tblGoodsclasses;
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
	@JoinColumn(name = "icon_acc_id")
	public TblAccessory getTblAccessory() {
		return this.tblAccessory;
	}

	public void setTblAccessory(TblAccessory tblAccessory) {
		this.tblAccessory = tblAccessory;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id")
	public TblGoodsclass getTblGoodsclass() {
		return this.tblGoodsclass;
	}

	public void setTblGoodsclass(TblGoodsclass tblGoodsclass) {
		this.tblGoodsclass = tblGoodsclass;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "goodstype_id")
	public TblGoodstype getTblGoodstype() {
		return this.tblGoodstype;
	}

	public void setTblGoodstype(TblGoodstype tblGoodstype) {
		this.tblGoodstype = tblGoodstype;
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

	@Column(name = "className")
	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Column(name = "display", nullable = false)
	public boolean isDisplay() {
		return this.display;
	}

	public void setDisplay(boolean display) {
		this.display = display;
	}

	@Column(name = "level", nullable = false)
	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
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

	@Column(name = "seo_description")
	public String getSeoDescription() {
		return this.seoDescription;
	}

	public void setSeoDescription(String seoDescription) {
		this.seoDescription = seoDescription;
	}

	@Column(name = "seo_keywords")
	public String getSeoKeywords() {
		return this.seoKeywords;
	}

	public void setSeoKeywords(String seoKeywords) {
		this.seoKeywords = seoKeywords;
	}

	@Column(name = "icon_sys")
	public String getIconSys() {
		return this.iconSys;
	}

	public void setIconSys(String iconSys) {
		this.iconSys = iconSys;
	}

	@Column(name = "icon_type")
	public Integer getIconType() {
		return this.iconType;
	}

	public void setIconType(Integer iconType) {
		this.iconType = iconType;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblGoodsclass")
	public Set<TblGoodsclassstaple> getTblGoodsclassstaples() {
		return this.tblGoodsclassstaples;
	}

	public void setTblGoodsclassstaples(Set<TblGoodsclassstaple> tblGoodsclassstaples) {
		this.tblGoodsclassstaples = tblGoodsclassstaples;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblGoodsclass")
	public Set<TblGoods> getTblGoodses() {
		return this.tblGoodses;
	}

	public void setTblGoodses(Set<TblGoods> tblGoodses) {
		this.tblGoodses = tblGoodses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblGoodsclass")
	public Set<TblGoodsclassArticleClass> getTblGoodsclassArticleClasses() {
		return this.tblGoodsclassArticleClasses;
	}

	public void setTblGoodsclassArticleClasses(Set<TblGoodsclassArticleClass> tblGoodsclassArticleClasses) {
		this.tblGoodsclassArticleClasses = tblGoodsclassArticleClasses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblGoodsclass")
	public Set<TblHomepageGoodsclass> getTblHomepageGoodsclasses() {
		return this.tblHomepageGoodsclasses;
	}

	public void setTblHomepageGoodsclasses(Set<TblHomepageGoodsclass> tblHomepageGoodsclasses) {
		this.tblHomepageGoodsclasses = tblHomepageGoodsclasses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblGoodsclass")
	public Set<TblGoodsclassArticle> getTblGoodsclassArticles() {
		return this.tblGoodsclassArticles;
	}

	public void setTblGoodsclassArticles(Set<TblGoodsclassArticle> tblGoodsclassArticles) {
		this.tblGoodsclassArticles = tblGoodsclassArticles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblGoodsclass")
	public Set<TblHomepageGoodsclassLog> getTblHomepageGoodsclassLogs() {
		return this.tblHomepageGoodsclassLogs;
	}

	public void setTblHomepageGoodsclassLogs(Set<TblHomepageGoodsclassLog> tblHomepageGoodsclassLogs) {
		this.tblHomepageGoodsclassLogs = tblHomepageGoodsclassLogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblGoodsclass")
	public Set<TblDistrictsGoodsclass> getTblDistrictsGoodsclasses() {
		return this.tblDistrictsGoodsclasses;
	}

	public void setTblDistrictsGoodsclasses(Set<TblDistrictsGoodsclass> tblDistrictsGoodsclasses) {
		this.tblDistrictsGoodsclasses = tblDistrictsGoodsclasses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblGoodsclass")
	public Set<TblGoodsclass> getTblGoodsclasses() {
		return this.tblGoodsclasses;
	}

	public void setTblGoodsclasses(Set<TblGoodsclass> tblGoodsclasses) {
		this.tblGoodsclasses = tblGoodsclasses;
	}

}