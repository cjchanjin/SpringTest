package co.cjpark.member.search.service;

public class SearchFilterVo {
	private String helperWorkArea;
	private int helperStartTime;
	private int helperEndTime;
	private String certifiNo;
	
	public String getHelperWorkArea() {
		return helperWorkArea;
	}
	public void setHelperWorkArea(String helperWorkArea) {
		this.helperWorkArea = helperWorkArea;
	}
	public int getHelperStartTime() {
		return helperStartTime;
	}
	public void setHelperStartTime(int helperStartTime) {
		this.helperStartTime = helperStartTime;
	}
	public int getHelperEndTime() {
		return helperEndTime;
	}
	public void setHelperEndTime(int helperEndTime) {
		this.helperEndTime = helperEndTime;
	}
	public String getCertifiNo() {
		return certifiNo;
	}
	public void setCertifiNo(String certifiNo) {
		this.certifiNo = certifiNo;
	}
	@Override
	public String toString() {
		return "CheckResultVo [helperWorkArea=" + helperWorkArea + ", helperStartTime=" + helperStartTime
				+ ", helperEndTime=" + helperEndTime + ", certifiNo=" + certifiNo + "]";
	}
	
}
