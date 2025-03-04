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
import com.spring.jpa.dto.UserLoginReq;
import com.spring.jpa.dto.UserReq;
import com.spring.jpa.entity.Coupon;
import com.spring.jpa.repository.GuestHouseRepository;
import com.spring.jpa.repository.RankingRepository;
import com.spring.jpa.repository.UserRepository;
<<<<<<< HEAD
import com.spring.jpa.service.CouponService;
=======
<<<<<<< HEAD
import com.spring.jpa.service.UserService;
=======
import com.spring.jpa.service.CouponService;
>>>>>>> 19946745be27b1bcde2be0d5237d1dd023edc32c
>>>>>>> 6d02233e73005cfeb6817c7012d2c7617c0e6624
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
	
<<<<<<< HEAD
	private CouponService couponService;
=======
<<<<<<< HEAD
	@Autowired
	private UserService userService;
=======
	private CouponService couponService;
>>>>>>> 19946745be27b1bcde2be0d5237d1dd023edc32c
>>>>>>> 6d02233e73005cfeb6817c7012d2c7617c0e6624
	
	@Transactional
	@Override
	public void run(String... args) throws Exception {
		

<<<<<<< HEAD
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

		// RankingRepository 기능 4번 단위 테스트
		// List<Ranking> rTop3Ranking = rankingRepository.findTop3UsersByGuestHouseId(5L);
		// for (Ranking col : rTop3Ranking) {
		// 	System.out.println(col + " ");
		// }
		// System.out.println("\n");
		
		
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
<<<<<<< HEAD
=======
<<<<<<< HEAD
		// ==== 쿠폰 테스팅 코드 끝 ===== 
	//	System.out.println("findUserBy Name test" + userRepository.findUserByName("AAA") );
=======
>>>>>>> 6d02233e73005cfeb6817c7012d2c7617c0e6624
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
		
<<<<<<< HEAD
=======
>>>>>>> 19946745be27b1bcde2be0d5237d1dd023edc32c
=======
		// ==== 쿠폰 테스팅 코드 끝 ===== 
		System.out.println("findUserBy Name test" + userRepository.findUserByName("AAA") );
>>>>>>> a2bb16c7c00b4348b7292dd23cad49e1b74e0836
>>>>>>> 6d02233e73005cfeb6817c7012d2c7617c0e6624
		
		//UserService 테스트하기.
		
		//addUser 테스트하기.
		
		//userReq만들기 
	//	UserReq userReq = new UserReq("Siwon", "010-xxx-xxx", "F", "");
	//	userService.addUser(userReq);
//		userService.findUser("yujin");
//		userService.findUser("sohee");
		
		//Login 테스트하기
//		UserLoginReq userLoginReq = new UserLoginReq("yujin", "12345");
//		userService.logInUser(userLoginReq);
	}

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectApplication.class, args);
	}

}
