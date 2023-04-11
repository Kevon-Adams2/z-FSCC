package com.example.loginDemo.Service;

import java.util.ArrayList;
import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

// import com.example.loginDemo.Entity.LoginDto;
import com.example.loginDemo.Entity.LoginEntity;
// import com.example.loginDemo.Exception.EntityNotFoundException;
// import com.example.loginDemo.Exception.InvalidLoginEntityException;
// import com.example.loginDemo.Exception.InvalidRoleException;
import com.example.loginDemo.Exception.UserNotFoundException;
import com.example.loginDemo.Repository.LoginRepository;

// import com.example.loginDemo.Exception.EntityNotFoundException;
// import jakarta.persistence.EntityNotFoundException;
// import jakarta.validation.valueextraction.Unwrapping.Unwrap;

@Service
public class LoginServiceImp implements LoginService {

    private LoginRepository loginRepository;

    // @Autowired
    public LoginServiceImp(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public void saveUser(LoginEntity loginEntity) {
        loginRepository.save(loginEntity);
    }

    @Override
    public LoginEntity getUserByNameAndPassword(String name, String password) throws UserNotFoundException {
        LoginEntity loginEntity = loginRepository.findByUserNameAndPassword(name, password);
        if (loginEntity == null) {
            throw new UserNotFoundException("Invalid id and password");
        }
        return loginEntity;
    }

    // @Autowired
    // BCryptPasswordEncoder encoder;

    // @Autowired
    // public LoginRepository loginRepository;


    // @Override
    // public String saveUser(LoginDto loginDto) {
    //     LoginEntity loginEntity = LoginService.loginEntityConvertor(loginDto);
    //     Optional<LoginEntity> loginInfo = loginRepository.findByEmail(loginEntity.getEmail());
    //     if (loginDto.getRole() == null || !loginDto.getRole().toLowerCase().matches("admin|user")) {
    //         throw new InvalidRoleException();
    //     }
    //     if (loginInfo.isPresent()) {
    //         throw new EntityNotFoundException(loginInfo.get().getEmail());
    //     }

    //     loginEntity.setRole(loginEntity.getRole().toLowerCase());
    //     loginEntity.setPassword(encoder.encode(loginEntity.getPassword()));
    //     loginRepository.save(loginEntity);
    //     return "User with email "+ loginDto.getEmail() +" created";
    // }

    // @Override
    // public LoginDto checkLogin(String email) {
    //    Optional<LoginEntity> loginInfo = loginRepository.findByEmail(email);
    //    if (loginInfo.isPresent()) {
    //     LoginDto loginDto = LoginService.loginDTOconvertor(loginInfo.get());
    //     return loginDto;
    //    } else throw new InvalidLoginEntityException();
    // }
    
    @Override
    public List<LoginEntity> getAllUsers() {
        List<LoginEntity> users = new ArrayList<>();
        loginRepository.findAll().forEach(user -> users.add(user));
        return users;
    }
    

}
