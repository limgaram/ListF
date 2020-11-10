package main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MemberDao {
	private ArrayList<Member> members;
	private int no = 6;

	public MemberDao() {
		members = new ArrayList<>();
		Member m1 = new Member(1, "aaa", "aa1", "a", Util.getCurrentDate());
		Member m2 = new Member(2, "bbb", "bb1", "b", Util.getCurrentDate());
		Member m3 = new Member(3, "ccc", "cc1", "c", Util.getCurrentDate());
		Member m4 = new Member(4, "ddd", "dd1", "d", Util.getCurrentDate());
		Member m5 = new Member(5, "eee", "ee1", "e", Util.getCurrentDate());

		members.add(m1);
		members.add(m2);
		members.add(m3);
		members.add(m4);
		members.add(m5);
	}

	public void insertMember(Member m) {
		m.setId(no);
		no++;
		m.setRegDate(Util.getCurrentDate());

		members.add(m);
	}

	public Member getMemberById(int id) {
		for (int i = 0; i < members.size(); i++) {
			Member m = members.get(i);
			if (m.getId() == id) {
				return m;
			}
		}

		return null;
	}

	public Member getMemberByLoginIdAndLoginPw(String id, String pw) {

		for (int i = 0; i < members.size(); i++) {
			Member m = members.get(i);
			if (m.getLoginId().equals(id) && m.getLoginPw().equals(pw)) {
				return m;
			}
		}

		return null;

	}
}