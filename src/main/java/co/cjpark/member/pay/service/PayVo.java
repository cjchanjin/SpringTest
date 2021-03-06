package co.cjpark.member.pay.service;

public class PayVo {
	private String imp_uid;
	private String merchant_uid;
	private String apply_num;
	private int paid_amount;
	private String buyer_name;
	
	public PayVo() {
		// TODO Auto-generated constructor stub
	}

	public String getImp_uid() {
		return imp_uid;
	}

	public void setImp_uid(String imp_uid) {
		this.imp_uid = imp_uid;
	}

	public String getMerchant_uid() {
		return merchant_uid;
	}

	public void setMerchant_uid(String merchant_uid) {
		this.merchant_uid = merchant_uid;
	}

	public int getPaid_amount() {
		return paid_amount;
	}

	public void setPaid_amount(int paid_amount) {
		this.paid_amount = paid_amount;
	}

	public String getBuyer_name() {
		return buyer_name;
	}

	public void setBuyer_name(String buyer_name) {
		this.buyer_name = buyer_name;
	}

	
	public String getApply_num() {
		return apply_num;
	}

	public void setApply_num(String apply_num) {
		this.apply_num = apply_num;
	}

	@Override
	public String toString() {
		return "PayVo [imp_uid=" + imp_uid + ", merchant_uid=" + merchant_uid + ", apply_num=" + apply_num
				+ ", paid_amount=" + paid_amount + ", buyer_name=" + buyer_name + "]";
	}

}
