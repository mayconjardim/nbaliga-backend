package com.nbaligabackend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nbaligabackend.dto.RoleDTO;
import com.nbaligabackend.dto.UserDTO;
import com.nbaligabackend.dto.UserInsertDTO;
import com.nbaligabackend.entities.Role;
import com.nbaligabackend.entities.User;
import com.nbaligabackend.repositories.RoleRepository;
import com.nbaligabackend.repositories.UserRepository;
import com.nbaligabackend.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Transactional(readOnly = true)
	public Page<UserDTO> findAllPaged(Pageable pageable) {
		Page<User> list = userRepository.findAll(pageable);
		return list.map(x -> new UserDTO(x));
	}

	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		User entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new UserDTO(entity);
	}
	
	@Transactional
	public UserDTO insert(UserInsertDTO dto) {
		User entity = new User();
		copyDtoToEntity(dto, entity);
		entity.setPassword(dto.getPassword());
		entity = userRepository.save(entity);
		return new UserDTO(entity);
	}
	

	public void copyDtoToEntity(UserDTO dto, User entity) {

		entity.setName(dto.getName());

		entity.getRoles().clear();
		for (RoleDTO roleDto : dto.getRoles()) {
			Role role = roleRepository.getReferenceById(roleDto.getId());
			entity.getRoles().add(role);
		}

	}

}
