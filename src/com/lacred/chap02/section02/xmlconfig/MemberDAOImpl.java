package com.lacred.chap02.section02.xmlconfig;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

// 보통 각 계층에 interface로 추상화를 해두고 impl을 붙인 구현체 class를 만든다
@Component(value="memberDAO")
public class MemberDAOImpl implements MemberDAO{
	// 행위의 강제화로 메소드 명과 반환 타입 및 인자를 통일하여만든다.
	// 또한 이후 코드 변경시 유지보수에 용이하며 결합도를 낮추는 효과가 있다.
	
	private final Map<Integer, MemberDTO> memberMap;
	
	public MemberDAOImpl() {
		memberMap = new HashMap<>();
		
		memberMap.put(1, new MemberDTO(1,"user1", "pass1", "lacred"));
		memberMap.put(2, new MemberDTO(2,"user2","pass2","mac"));
	}
	
	@Override
	public MemberDTO selectMemeber(int sequence) {
		return memberMap.get(sequence);
	}

	@Override
	public boolean insertMember(MemberDTO newMember) {
		int before = memberMap.size();
		
		memberMap.put(newMember.getSequence(), newMember);
		
		int after = memberMap.size();
		
		return (after > before) ? true: false;
	}
	
}
