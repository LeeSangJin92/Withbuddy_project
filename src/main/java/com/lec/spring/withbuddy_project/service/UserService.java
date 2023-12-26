package com.lec.spring.withbuddy_project.service;

import com.lec.spring.withbuddy_project.domain.Authority;
import com.lec.spring.withbuddy_project.domain.MypagePet;
import com.lec.spring.withbuddy_project.domain.User;
import com.lec.spring.withbuddy_project.domain.dto.BuddyDto;
import com.lec.spring.withbuddy_project.domain.dto.UserDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface UserService {
    User findByUsername(String userId);
    default boolean isExist(String username) {
        return false;
    }

    default boolean isExistEmail(String email) {
        return false;
    }


    List<UserDto> findWithoutMe(Long id,Long addressId);

    User findById(Long id);

    BuddyDto findBuddyProfile(Long id,Long code);


    List<User> findDm(Long loginId);


    // 신규 회원 등록
    int register(User user);

    void buddyregister(MypagePet mypagePet, Map<String, MultipartFile> file);

    default boolean findBuddy(Long id){
        return true;
    };

    List<Authority> selectAuthoritiesById(Long id);
    User findUsernameByEmail(String email);


    // 비밀번호 찾기 12/24

    String generateNewPassword();

    void updatePassword(User user,String newPassword);

    // 주소 넣기
    //    void address(User user);
    void address(User user);

}
