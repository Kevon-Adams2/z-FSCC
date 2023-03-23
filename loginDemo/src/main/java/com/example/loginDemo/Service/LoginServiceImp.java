package com.example.loginDemo.Service;

// import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

// import com.example.loginDemo.Entity.LoginDto;
import com.example.loginDemo.Entity.LoginEntity;
import com.example.loginDemo.Repository.LoginRepository;

// import com.example.loginDemo.Exception.EntityNotFoundException;
// import jakarta.persistence.EntityNotFoundException;
// import jakarta.validation.valueextraction.Unwrapping.Unwrap;

@Service
public class LoginServiceImp implements LoginService {

    @Autowired
    private LoginRepository loginRepository;
    // private BCryptPasswordEncoder bCryptPasswordEncoder;

    // @Override
    // public LoginEntity getLogin(Long id) /*throws Exception*/ {
    //     Optional<LoginEntity> login = loginRepository.findById(id);
    //     return unwrapLoginId(login, id);
    // }
    
    // check
    // @Override
    // public boolean doesUserExist(String username) {
    //     return loginRepository.existsByUsername(username);
    // }

    // @Override
    // public Optional<LoginEntity> getCredentials(String username) {
    //     return loginRepository.findByUsername(username);
    // }

    // @Override
    // public void createNewUser(LoginDto userInput) {
    //     String
    // }



    // @Override
    // public LoginEntity getUser(String username) {
    //     Optional<LoginEntity> login = loginRepository.findByUsername(username);
    //     return unwrapUser(login, username);
    // }

    // private LoginEntity unwrapUser(Optional<LoginEntity> login, String username) {
    //     return null;
    // }

    // @Override
    // public LoginEntity saveLogin(LoginEntity login) {
    //     login.setPassword(bCryptPasswordEncoder.encode(login.getPassword()));
    //     return loginRepository.save(login);
    // }
    
    
    
    // @Override
    // public List<LoginEntity> getAllLogins() {
    //     throw new UnsupportedOperationException("Unimplemented method 'getAllLogins'");
    // }
    
    
    // static LoginEntity unwrapLoginId(Optional<LoginEntity> entity, Long id) {
    //     if (entity.isPresent()) return entity.get();
    //     else throw new EntityNotFoundException(id, LoginEntity.class);
    // }
    
    // private Optional<LoginEntity> unwrapLoginUsername(Optional<LoginEntity> entity, String Username) {
    //     if (entity.isPresent()) return entity.get();
    //     else throw new EntityNotFoundException(Username, LoginEntity.class);
    // }

    @Override
    public Optional<LoginEntity> findById(Long id) {
        return loginRepository.findById(id);
    }
    

}
