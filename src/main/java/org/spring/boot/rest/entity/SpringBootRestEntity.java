package org.spring.boot.rest.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Employee")
@Table(name = "TB_EMPLOYEE")
public class SpringBootRestEntity implements Serializable {

	private static final long serialVersionUID = 745377985536737107L;

	@Id
	@Column(name = "EMP_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;

	@Column(name = "EMP_NAME")
	private String empName;

	@Column(name = "EMP_ADDRESS")
	private String empAddress;

	@Column(name = "EMP_DOB")
	private Date empDOB;

	@Column(name = "EMP_MAIL")
	private String empMail;

	@Column(name = "EMP_MOBILE")
	private long empMobile;

	@Column(name = "EMP_SALARY")
	private long empSalary;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public Date getEmpDOB() {
		return empDOB;
	}

	public void setEmpDOB(Date empDOB) {
		this.empDOB = empDOB;
	}

	public String getEmpMail() {
		return empMail;
	}

	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}

	public long getEmpMobile() {
		return empMobile;
	}

	public void setEmpMobile(long empMobile) {
		this.empMobile = empMobile;
	}

	public long getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(long empSalary) {
		this.empSalary = empSalary;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "SpringBootRestEntity [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress
				+ ", empDOB=" + empDOB + ", empMail=" + empMail + ", empMobile=" + empMobile + ", empSalary="
				+ empSalary + "]";
	}

}