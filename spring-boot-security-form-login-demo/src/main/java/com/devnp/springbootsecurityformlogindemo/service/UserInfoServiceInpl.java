/**
 * 
 */
package com.devnp.springbootsecurityformlogindemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.devnp.springbootsecurityformlogindemo.repository.UserInfoRepository;

/**
 * @author duliu
 *
 */
@Service
public class UserInfoServiceInpl implements UserInfoService {

	@Autowired
	private UserInfoRepository userInfoRepository;


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return userInfoRepository.findByUserName(username);
	}

}
