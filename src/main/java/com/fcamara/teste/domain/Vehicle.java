package com.fcamara.teste.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //*** para gerar ID automaticos
	private Integer id;

	private Long logic;
	private String serial;
	private Integer sam;
	private String ptid;
	private Integer plat;
	private String version;
	private Integer mxr;
	private Long mxf;
	private String verfm;
	
	public Vehicle() {
	}

	public Vehicle(Integer id, Long logic, String serial, Integer sam, String ptid, Integer plat, String version,
			Integer mxr, Long mxf, String verfm) {
		super();
		this.id = id;
		this.logic = logic;
		this.serial = serial;
		this.sam = sam;
		this.ptid = ptid;
		this.plat = plat;
		this.version = version;
		this.mxr = mxr;
		this.mxf = mxf;
		this.verfm = verfm;
	}

	public Long getLogic() {
		return logic;
	}
	public void setLogic(Long logic) {
		this.logic = logic;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public Integer getSam() {
		return sam;
	}
	public void setSam(Integer sam) {
		this.sam = sam;
	}
	public String getPtid() {
		return ptid;
	}
	public void setPtid(String ptid) {
		this.ptid = ptid;
	}
	public Integer getPlat() {
		return plat;
	}
	public void setPlat(Integer plat) {
		this.plat = plat;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Integer getMxr() {
		return mxr;
	}
	public void setMxr(Integer mxr) {
		this.mxr = mxr;
	}
	public Long getMxf() {
		return mxf;
	}
	public void setMxf(Long mxf) {
		this.mxf = mxf;
	}
	public String getVerfm() {
		return verfm;
	}
	public void setVerfm(String verfm) {
		this.verfm = verfm;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(logic, mxf, mxr, plat, ptid, sam, serial, verfm, version);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(logic, other.logic) && Objects.equals(mxf, other.mxf) && Objects.equals(mxr, other.mxr)
				&& Objects.equals(plat, other.plat) && Objects.equals(ptid, other.ptid)
				&& Objects.equals(sam, other.sam) && Objects.equals(serial, other.serial)
				&& Objects.equals(verfm, other.verfm) && Objects.equals(version, other.version);
	}
	
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", logic=" + logic + ", serial=" + serial + ", sam=" + sam + ", ptid=" + ptid
				+ ", plat=" + plat + ", version=" + version + ", mxr=" + mxr + ", mxf=" + mxf + ", verfm=" + verfm
				+ "]";
	}
	
}
