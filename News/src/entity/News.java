package entity;

public class News {
	private Integer nid;
	private Integer tnid;
	
	private String ntitle;
	private String ncreateDate;
	public Integer getNid() {
		return nid;
	}
	public void setNid(Integer nid) {
		this.nid = nid;
	}
	public Integer getTnid() {
		return tnid;
	}
	public void setTnid(Integer tnid) {
		this.tnid = tnid;
	}
	public String getNtitle() {
		return ntitle;
	}
	public void setNtitle(String ntitle) {
		this.ntitle = ntitle;
	}
	public String getNcreateDate() {
		return ncreateDate;
	}
	public void setNcreateDate(String ncreateDate) {
		this.ncreateDate = ncreateDate;
	}
	@Override
	public String toString() {
		return "News [nid=" + nid + ", tnid=" + tnid + ", ntitle=" + ntitle + ", ncreateDate=" + ncreateDate + "]";
	}
	
	
}
