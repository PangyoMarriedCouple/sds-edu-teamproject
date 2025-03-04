package com.spring.jpa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.spring.jpa.dto.GuestHouseRes;
import com.spring.jpa.entity.GuestHouse;
import com.spring.jpa.exception.GuestHouseSearchException;
import com.spring.jpa.repository.GuestHouseRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GuestHouseService {
	final GuestHouseRepository guestHouseRepository;
	
	@Transactional
	public GuestHouseRes findGuestHouseByName(String name) throws GuestHouseSearchException{
		GuestHouse gh = guestHouseRepository.findByName(name)
						.orElseThrow(()-> new GuestHouseSearchException("No Such Guest House"));
		
		return new GuestHouseRes(gh);
	}
	
	@Transactional
	public String getRandomGuestHouse() {
		// GuestHouse 목록이 비어있다는 exception은 없음.
		GuestHouse randomGuestHouse = guestHouseRepository.findRandomGuestHouse();
		
		String randomGuestHouseName = randomGuestHouse.getName();
		
		return randomGuestHouseName;
	}
	
	// 하나의 게스트 하우스를 임의로 선택하여 해당 게스트 하우스 이름으로 애너그램 30개 생성 
	public List<String> generateAnagrams(){
		
		String randomGuestHouseName = getRandomGuestHouse();
		List<String> anagrams = getShuffledNamesExceptionFirstAndLastChar(30, randomGuestHouseName);
		
		return anagrams;
	}
	
	// 주어진 이름으로 애너그램 n번 생성
	public List<String> getShuffledNames(Integer times, String originalName){
		
		List<String> shuffledNames = new ArrayList<>(); 
		
		originalName = originalName.replaceAll("\\s", "");
        shuffledNames.add(originalName);
        
        Random random = new Random();
        
        for(int i=0; i<times-1; i++) {
        	String shuffled;
            do {
                char[] chars = originalName.toCharArray();
                for (int j = chars.length - 1; j > 0; j--) {
                    int index = random.nextInt(j + 1);
                    char temp = chars[index];
                    chars[index] = chars[j];
                    chars[j] = temp;
                }
                shuffled = new String(chars);
            } while (shuffled.equals(originalName));
            		
            shuffledNames.add(shuffled);
        }
        
        return shuffledNames;
	}
	
	//getShuffledNames와 동일하게 작동하지만, 주어진 이름의 첫번째와 마지막 character를 제외하고 셔플링 진행.
	public List<String> getShuffledNamesExceptionFirstAndLastChar(Integer times, String originalName) {
	    List<String> shuffledNames = new ArrayList<>(); 
	    
	    originalName = originalName.replaceAll("\\s", "");
	    shuffledNames.add(originalName);
	    
	    Random random = new Random();
	    
	    for(int i = 0; i < times - 1; i++) {
	        String shuffled;
	        do {
	            if (originalName.length() <= 3) {
	                // 3글자 이하인 경우 원래 이름을 그대로 사용
	                shuffled = originalName;
	            } else {
	                char firstChar = originalName.charAt(0);
	                char lastChar = originalName.charAt(originalName.length() - 1);
	                String middlePart = originalName.substring(1, originalName.length() - 1);
	                
	                char[] middleChars = middlePart.toCharArray();
	                for (int j = middleChars.length - 1; j > 0; j--) {
	                    int index = random.nextInt(j + 1);
	                    char temp = middleChars[index];
	                    middleChars[index] = middleChars[j];
	                    middleChars[j] = temp;
	                }
	                
	                shuffled = firstChar + new String(middleChars) + lastChar;
	            }
	        } while (shuffled.equals(originalName));
	        
	        shuffledNames.add(shuffled);
	    }
	    
	    return shuffledNames;
	}
	
	public boolean checkAnswer(String answer, String originalName) {
        return answer.equals(originalName);
    }
}
