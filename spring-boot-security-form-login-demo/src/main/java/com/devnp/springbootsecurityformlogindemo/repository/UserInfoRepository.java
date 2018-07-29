/**
 * 
 */
package com.devnp.springbootsecurityformlogindemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devnp.springbootsecurityformlogindemo.entity.UserInfo;

/**
 * @author duliu
 *
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

	UserInfo findByUserName(String userName);
}
