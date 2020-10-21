package com.laptrinhjavaweb.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass //khai báo  để các java class table kế thừa được các 
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
	
	@Id // khai báo id /// có 2 chức năng 1- PRIMAKEY 2-NOT NULL giống trong db
	@GeneratedValue(strategy = GenerationType.IDENTITY)// Đĩnh nghĩa để id tự tăng giá trị lên ko cần set giá trị vào
	private Long id; // ko có hàm setter vì id tự tăng (chỉ có hàm getter)
	
	@Column(name = "") // khai báo tên column trong db
	@CreatedBy
	private String createdBy;
	
	@Column(name = "")
	@CreatedDate
	private Date createdDate;
	
	@Column(name = "")
	@LastModifiedBy
	private String modifiedBy;
	
	@Column(name = "")
	@LastModifiedDate
	private Date modeifiedDate;
	
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	public Date getModeifiedDate() {
		return modeifiedDate;
	}
	public void setModeifiedDate(Date modeifiedDate) {
		this.modeifiedDate = modeifiedDate;
	}
	  
	public Long getId() {
		return id;
	}
}
