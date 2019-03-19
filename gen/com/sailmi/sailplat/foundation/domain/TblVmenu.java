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
 * TblVmenu generated by hbm2java
 */
@Entity
@Table(name = "tbl_vmenu", catalog = "sailplat")
public class TblVmenu implements java.io.Serializable {

	private Long id;
	private TblStore tblStore;
	private TblVmenu tblVmenu;
	private Date addTime;
	private boolean deleteStatus;
	private String menuKey;
	private String menuName;
	private String menuType;
	private String menuUrl;
	private Integer menuSequence;
	private String menuKeyContent;
	private String menuCat;
	private Set<TblVmenu> tblVmenus = new HashSet<TblVmenu>(0);

	public TblVmenu() {
	}

	public TblVmenu(boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public TblVmenu(TblStore tblStore, TblVmenu tblVmenu, Date addTime, boolean deleteStatus, String menuKey,
			String menuName, String menuType, String menuUrl, Integer menuSequence, String menuKeyContent,
			String menuCat, Set<TblVmenu> tblVmenus) {
		this.tblStore = tblStore;
		this.tblVmenu = tblVmenu;
		this.addTime = addTime;
		this.deleteStatus = deleteStatus;
		this.menuKey = menuKey;
		this.menuName = menuName;
		this.menuType = menuType;
		this.menuUrl = menuUrl;
		this.menuSequence = menuSequence;
		this.menuKeyContent = menuKeyContent;
		this.menuCat = menuCat;
		this.tblVmenus = tblVmenus;
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
	@JoinColumn(name = "store_id")
	public TblStore getTblStore() {
		return this.tblStore;
	}

	public void setTblStore(TblStore tblStore) {
		this.tblStore = tblStore;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_id")
	public TblVmenu getTblVmenu() {
		return this.tblVmenu;
	}

	public void setTblVmenu(TblVmenu tblVmenu) {
		this.tblVmenu = tblVmenu;
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

	@Column(name = "menu_key")
	public String getMenuKey() {
		return this.menuKey;
	}

	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}

	@Column(name = "menu_name")
	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	@Column(name = "menu_type")
	public String getMenuType() {
		return this.menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	@Column(name = "menu_url")
	public String getMenuUrl() {
		return this.menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	@Column(name = "menu_sequence")
	public Integer getMenuSequence() {
		return this.menuSequence;
	}

	public void setMenuSequence(Integer menuSequence) {
		this.menuSequence = menuSequence;
	}

	@Column(name = "menu_key_content")
	public String getMenuKeyContent() {
		return this.menuKeyContent;
	}

	public void setMenuKeyContent(String menuKeyContent) {
		this.menuKeyContent = menuKeyContent;
	}

	@Column(name = "menu_cat")
	public String getMenuCat() {
		return this.menuCat;
	}

	public void setMenuCat(String menuCat) {
		this.menuCat = menuCat;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblVmenu")
	public Set<TblVmenu> getTblVmenus() {
		return this.tblVmenus;
	}

	public void setTblVmenus(Set<TblVmenu> tblVmenus) {
		this.tblVmenus = tblVmenus;
	}

}