package com.sabekur2017.instaclonetest.service;

import com.sabekur2017.instaclonetest.dtos.UserDto;
import com.sabekur2017.instaclonetest.exceptions.ResourceAlreadyExistsException;
import com.sabekur2017.instaclonetest.model.User;
import com.sabekur2017.instaclonetest.repositories.UserRepository;
import com.sun.jdi.request.DuplicateRequestException;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService implements UserDetailsService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserByName(String userName){

        return userRepository.findByusername(userName);
    }

    public void addUser(UserDto userDto) {
        checkUserInList(userDto);
        var userEntity = new User();
        BeanUtils.copyProperties(userDto,userEntity);
        userRepository.save(userEntity);


    }



    private void checkUserInList(UserDto userDto) {

        var username = userRepository.findByusername(userDto.getUsername());

        var userEmail = userRepository.findByuserEmail(userDto.getUserEmail());

        if (username != null) {
            throw new ResourceAlreadyExistsException("UserName Already exists");
        }
        if(userEmail != null) {
            throw new DuplicateRequestException("Email Already Used");
        }

    }

    public void updateuserProfilePicture(User u) {

        var user = userRepository.findByusername(u.getUsername());
        BeanUtils.copyProperties(u,user);
        userRepository.save(user);


    }



    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        var userFromDb = userRepository.findByUsername(s)
                .orElseThrow(() -> new UsernameNotFoundException("No user found with this email address."));
        List<GrantedAuthority> authorities = new java.util.ArrayList<>(Collections.emptyList());

        authorities.add((GrantedAuthority) () -> userFromDb.getRole().name());

        return new org.springframework.security.core.userdetails.User(userFromDb.getUsername(), userFromDb.getPassword(), authorities);
    }
}
