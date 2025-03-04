package com.spring.jpa;

import java.time.Duration;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.jpa.entity.GuestHouse;
import com.spring.jpa.entity.Ranking;
import com.spring.jpa.entity.User;
import com.spring.jpa.entity.Coupon;
import com.spring.jpa.repository.GuestHouseRepository;
import com.spring.jpa.repository.RankingRepository;
import com.spring.jpa.repository.UserRepository;
import com.spring.jpa.service.CouponService;
import com.spring.jpa.repository.CouponRepository;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class MiniProjectApplication implements CommandLineRunner{
	
	@Autowired
	private GuestHouseRepository guestHouseRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RankingRepository rankingRepository;
	
	@Autowired
	private CouponRepository couponRepository;
	
	private CouponService couponService;
	
	@Transactional
	@Override
	public void run(String... args) throws Exception {
		

		// ==== 쿠폰 테스팅 코드 끝 ===== 
		System.out.println("findUserBy Name test" + userRepository.findUserByName("AAA") );
		
	}

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectApplication.class, args);
	}

}
