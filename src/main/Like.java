package main;

public class Like {
	private int id; // 좋아요 번호
	private int parentId; //원글 번호
	private int MemberId; // 체크 유저 번호
	private String regDate;
	
	public Like() {
		
	}
	
	public Like(int parentId, int memberId) {
		this.parentId = parentId;
		this.MemberId = memberId;
	}
	
	
	public Like(int parentId, int memberId, String regDate) {
		this.parentId = parentId;
		this.MemberId = memberId;
		this.regDate = regDate;
	}
	
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getMemberId() {
		return MemberId;
	}
	public void setMemberId(int memberId) {
		MemberId = memberId;
	}
	
}
