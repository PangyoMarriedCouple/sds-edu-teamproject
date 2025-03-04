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
		
//		//================ GH 더미 데이터 생성 ================
//		GuestHouse gh1 = new GuestHouse();
//		gh1.setName("산들바람");
//		gh1.setCapacity(10);
//		gh1.setLocation("경기도");
//		gh1.setPrice(100000);
//		guestHouseRepository.save(gh1);
//		
//		GuestHouse gh2 = new GuestHouse();
//		gh2.setName("파라다이스");
//		gh2.setCapacity(15);
//		gh2.setLocation("강원도");
//		gh2.setPrice(150000);
//		guestHouseRepository.save(gh2);
//		
//		GuestHouse gh3 = new GuestHouse();
//		gh3.setName("꽃과동산");
//		gh3.setCapacity(20);
//		gh3.setLocation("경상도");
//		gh3.setPrice(170000);
//		guestHouseRepository.save(gh3);
//		
//		GuestHouse gh4 = new GuestHouse();
//		gh4.setName("행복한 게스트하우스");
//		gh4.setCapacity(20);
//		gh4.setLocation("경기도");
//		gh4.setPrice(120000);
//		guestHouseRepository.save(gh4);
//		
//		GuestHouse gh5 = new GuestHouse();
//		gh5.setName("최고의 게스트하우스");
//		gh5.setCapacity(10);
//		gh5.setLocation("경기도");
//		gh5.setPrice(150000);
//		guestHouseRepository.save(gh5);
//		
////		//================ GH repo 테스트 ================ 
//		GuestHouse randomGuestHouse = guestHouseRepository.findRandomGuestHouse();
//		System.out.println("1. RANDOM GUEST HOUSE CHOSEN : " + randomGuestHouse);		
//		
//		Optional<GuestHouse> gh = guestHouseRepository.findByName("최고의 게스트하우스");
//		System.out.println("2. FIND GUEST HOUSE BY NAME : " + gh);
//		
//		GuestHouse guestHouse = guestHouseRepository.findRandomGuestHouseByLocation("경기도");
//		System.out.println("3. FIND RANDOM GUEST HOUSE BY LOCATION" + guestHouse);
//		
//		//================= USER 더미 데이터 생성 ================= 
//		User u1 = new User();
//		u1.setUserName("AAA");
//		u1.setNumCoupon(0);
//		u1.setGameCount(0);
//		u1.setPhoneNum("01012345678");
//		u1.setSex("M");
//		userRepository.save(u1);
//		
//		User u2 = new User();
//		u2.setUserName("BBB");
//		u2.setNumCoupon(0);
//		u2.setGameCount(0);
//		u2.setPhoneNum("01012345678");
//		u2.setSex("M");
//		userRepository.save(u2);
//		
//		User u3 = new User();
//		u3.setUserName("CCC");
//		u3.setNumCoupon(0);
//		u3.setGameCount(0);
//		u3.setPhoneNum("01012345678");
//		u3.setSex("F");
//		userRepository.save(u3);
//		User u4 = new User();
//		u4.setUserName("DDD");
//		u4.setNumCoupon(0);
//		u4.setGameCount(0);
//		u4.setPhoneNum("01012345678");
//		u4.setSex("F");
//		userRepository.save(u4);
		
		
		
		//================= Ranking 더미 데이터 생성 by Siwon =================
//		User u1 = userRepository.findById(1L).orElseThrow();
//		User u2 = userRepository.findById(2L).orElseThrow();
//		User u3 = userRepository.findById(3L).orElseThrow();
//		User u4 = userRepository.findById(4L).orElseThrow();
//		
//		GuestHouse g1 = guestHouseRepository.findById(2L).orElseThrow();
//		GuestHouse g2 = guestHouseRepository.findById(3L).orElseThrow();
//		GuestHouse g3 = guestHouseRepository.findById(4L).orElseThrow();
//		GuestHouse g4 = guestHouseRepository.findById(5L).orElseThrow();
//		
//		Ranking r1 = new Ranking();
//		r1.setUser(u3);
//		r1.setGuesthouse(g1);
//		r1.setDuration(Duration.ofHours(12));
//		r1.setDiscountRate(0.1f);
//		rankingRepository.save(r1);
//
//		Ranking r2 = new Ranking();
//		r2.setUser(u2);
//		r2.setGuesthouse(g2);
//		r2.setDuration(Duration.ofHours(72));
//		r2.setDiscountRate(0.15f);
//		rankingRepository.save(r2);
//
//		Ranking r3 = new Ranking();
//		r3.setUser(u3);
//		r3.setGuesthouse(g3);
//		r3.setDuration(Duration.ofHours(24));
//		r3.setDiscountRate(0.05f);
//		rankingRepository.save(r3);
//
//		Ranking r4 = new Ranking();
//		r4.setUser(u4);
//		r4.setGuesthouse(g4);
//		r4.setDuration(Duration.ofHours(96));
//		r4.setDiscountRate(0.2f);
//		rankingRepository.save(r4);
//		

        // 저장된 Ranking 데이터 확인
//        rankingRepository.findAll().forEach(System.out::println);				
//		System.out.println("============== TEST TOP3 =============");
//		List<Object[]> userAndRank =  guestHouseRepository.findTop3UsersByGuestHouseId(2L);
//		
//		for(Object[] row : userAndRank) {
//			for(Object col : row) {
//				System.out.println(col+" ");
//			}
//			System.out.println("\n");
//		}
		
		
		// ==== 쿠폰 테스팅 코드 시작 ===== 
		
	    // 테스트를 위한 사용자와 게스트하우스 생성
//	    User testUser = new User();
//	    testUser.setUserName("TestUser");
//	    testUser.setPhoneNum("01099999999");
//	    testUser.setSex("M");
//	    userRepository.save(testUser);
////
//	    GuestHouse testGH = new GuestHouse();
//	    testGH.setName("TestGuestHouse");
//	    testGH.setCapacity(10);
//	    testGH.setLocation("서울");
//	    testGH.setPrice(100000);
//	    guestHouseRepository.save(testGH);
//
//	    // 쿠폰 발급 테스트
//	    System.out.println("===== 쿠폰 발급 테스트 =====");
//	    Coupon coupon1 = new Coupon();
//	    coupon1.setUser(testUser);
//	    coupon1.setGuesthouse(testGH);
//	    coupon1.setDiscountRate(0.1f);
//	    couponRepository.save(coupon1);
//
//	    Coupon coupon2 = new Coupon();
//	    coupon2.setUser(testUser);
//	    coupon2.setGuesthouse(testGH);
//	    coupon2.setDiscountRate(0.15f);
//	    couponRepository.save(coupon2);

	    // 유저의 쿠폰 갯수 확인
//	    System.out.println("===== 유저의 쿠폰 갯수 확인 =====");
//	    Integer couponCount = userRepository.countCouponsByUserName(testUser.getUserName());
//	    System.out.println("TestUser의 쿠폰 갯수: " + couponCount);

	    // 유저의 쿠폰 목록 확인
//	    System.out.println("===== 유저의 쿠폰 목록 확인 =====");
//	    List<Coupon> userCoupons = userRepository.findCouponsByUserName(testUser.getUserName());
//	    for (Coupon coupon : userCoupons) {
//	        System.out.println("쿠폰 ID: " + coupon.getCouponId() + 
//	                           ", 게스트하우스: " + coupon.getGuesthouse().getName() + 
//	                           ", 할인율: " + coupon.getDiscountRate());
//	    }

	    // User 엔티티의 numCoupon 필드 업데이트
//	    testUser.setNumCoupon(couponCount);
//	    userRepository.save(testUser);
//
//	    System.out.println("Updated TestUser's numCoupon: " + testUser.getNumCoupon());
//		
		// ==== 쿠폰 테스팅 코드 끝 =====
		
		// 쿠폰 서비스 테스팅
		User u1 = userRepository.findUserByName("TestUser");
		GuestHouse g1 = guestHouseRepository.findByName("TestGuestHouse");
	    Coupon c1 = new Coupon();
	    c1.setUser(u1);
	    c1.setGuesthouse(g1);
	    c1.setDiscountRate(0.1f);
	    couponRepository.save(c1);
	    
	    List<Coupon> result1 = couponRepository.findAllByUserUserId(u1.getUserId());
	    System.out.println("TestUser에게 쿠폰은" + result1.size() + "개");
	    Long result2 = couponRepository.countByUserUserId(u1.getUserId());
	    System.out.println("TestUser에게 쿠폰은" + result2 + "개");
		
		
	}

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectApplication.class, args);
	}

}
