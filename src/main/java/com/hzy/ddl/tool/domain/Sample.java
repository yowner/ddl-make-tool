package com.hzy.ddl.tool.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
* 类描述：样例Sample
* 创建者： zhiyongh
* 项目名称： tool
* 创建时间： 2012-9-4 上午05:15:33
* 版本号： v1.0
*/
@Entity
@Table(name = "TEST_SAMPLE")
public class Sample implements Serializable {

	private static final long serialVersionUID = -4484250396042594494L;

	/**
	*序列id
	*/
	private Long id;

	/**
	*姓
	*/
	private String firstName;

	/**
	*名
	*/
	private String lastName;

	/**
	*备注
	*/
	private String memo;
	
	/**
	*备注2
	*/
	private String memo2;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SAMPLE_ID")
	@SequenceGenerator(name = "SEQ_SAMPLE_ID", allocationSize = 1, initialValue = 1, sequenceName = "SEQ_SAMPLE_ID")
	@Column(name = "ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="FIRST_NAME", length=30)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name="LAST_NAME", length=50)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name="MEMO", length=30)
	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	@Lob
	public String getMemo2() {
		return memo2;
	}

	public void setMemo2(String memo2) {
		this.memo2 = memo2;
	}

}
