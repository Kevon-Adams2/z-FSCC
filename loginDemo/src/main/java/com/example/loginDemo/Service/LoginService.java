package com.example.loginDemo.Service;

import java.util.List;
// import java.util.Optional;

// import com.example.loginDemo.Entity.LoginDto;
import com.example.loginDemo.Entity.LoginEntity;
// import com.example.loginDemo.Exception.EntityNotFoundException;
import com.example.loginDemo.Exception.UserNotFoundException;

public interface LoginService {
    
    // LoginEntity getLogin(Long id) /*throws Exception*/;

    // Optional<LoginEntity> getCredentials(String username);

    // boolean doesUserExist(String username);

    // LoginEntity saveLogin(LoginEntity login);

    public void saveUser(LoginEntity loginEntity);

    public List<LoginEntity> getAllUsers();

    // void createNewUser(LoginDto userInput);

    // LoginEntity getUser(String username);

    public LoginEntity getUserByNameAndPassword(String name, String password) throws UserNotFoundException;

    // Optional<LoginEntity> findById(Long id);

    // public LoginDto checkLogin(String email);

	// public String saveUser(LoginDto loginDto);

    // public static LoginDto loginDTOconvertor(LoginEntity loginEntity) {
	// 	return new LoginDto(loginEntity.getEmail(), loginEntity.getPassword(), loginEntity.getRole());
	// }
	// public static LoginEntity loginEntityConvertor(LoginDto loginDTO) {
	// 	return new LoginEntity(loginDTO.getEmail(), loginDTO.getPassword(), loginDTO.getRole());
	// }
}
