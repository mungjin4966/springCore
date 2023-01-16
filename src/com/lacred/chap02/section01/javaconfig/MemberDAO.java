package com.lacred.chap02.section01.javaconfig;

public interface MemberDAO {

	MemberDTO selectMemeber(int sequence);
	
	boolean insertMember(MemberDTO newMember);
}
