package com.lec.spring.withbuddy_project.repository;

import com.lec.spring.withbuddy_project.domain.MypagePet;
import com.lec.spring.withbuddy_project.domain.User;
import com.lec.spring.withbuddy_project.domain.dto.BuddyDto;
import com.lec.spring.withbuddy_project.domain.dto.UserDto;

import java.util.List;

public interface UserRepository {
    int save(User user);

    User findByUsername(String userId); // userId= username으로 유저의 정보를 찾음

    User findById(Long id);

    List<UserDto> findAllUser(Long id);   // 모든 유저를 찾음

    List<UserDto> findAllWithoutId(Long id,Long addressId); // 나빼고 모든 유저를 찾음

    List<User> findDmListByLoginUserId(Long loginId); // 로그인한 사람의 dmList를 찾음

    BuddyDto findUserById(Long id,Long code);  // id를 통해 유저의 정보를 찾음

    User findByEmail(String email);

    int buddy(MypagePet mypagePet);

    // 12/24 update
    void update(User user);

    MypagePet findBuddy(Long id);

    String findByAuthorityName(Long id);

}
