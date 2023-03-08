package com.example.demo.Repository;




import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.Entity.DonationEntity;


@Repository
public interface DonationRepo extends JpaRepository<DonationEntity,Integer>{

//	@Modifying
//	@Transactional
//	@Query(value = "DELETE FROM donor_details where donid = :i", nativeQuery = true)
//	BigInteger deleteByDonorId(@Param("i") BigInteger i);

}
