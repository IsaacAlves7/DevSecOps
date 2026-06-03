package kafka.com.in.jwt;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import kafka.com.in.entity.JpaDaoRepository;
import kafka.com.in.entity.KafkaMessengerUser;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    JpaDaoRepository userRepository; 

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // fetch user from DB
        KafkaMessengerUser user = userRepository.getByUserName(username)
        		 .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));

        return new User(
                user.getUserName(),
                user.getUserPassword(),
                new ArrayList<>() 
        );

    }
}

