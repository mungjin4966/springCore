package com.lacred.chap02.section02.xmlconfig;

public interface MemberDAO {

	MemberDTO selectMemeber(int sequence);
	
	boolean insertMember(MemberDTO newMember);
}
