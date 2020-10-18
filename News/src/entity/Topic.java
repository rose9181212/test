package entity;
/**
 * 实体类：主题表
 * @author 123
 *
 */
public class Topic {
	private Integer tid;
	private String tname;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	@Override
	public String toString() {
		return "Topic [tid=" + tid + ", tname=" + tname + "]";
	}
	
	
}
