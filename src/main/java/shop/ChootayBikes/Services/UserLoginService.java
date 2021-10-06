package shop.ChootayBikes.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import shop.ChootayBikes.Model.MyUserDetails;
import shop.ChootayBikes.Model.UserLogin;
import shop.ChootayBikes.Repositories.UserLoginRepository;

import java.util.Optional;

@Service
public class UserLoginService implements UserDetailsService {

    @Autowired
    UserLoginRepository userLoginRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserLogin> userLogin = userLoginRepository.findByUserName(username);
        userLogin.orElseThrow(() -> new UsernameNotFoundException(" ********************not found : " + username));
        return userLogin.map(MyUserDetails::new).get();
    }
}
