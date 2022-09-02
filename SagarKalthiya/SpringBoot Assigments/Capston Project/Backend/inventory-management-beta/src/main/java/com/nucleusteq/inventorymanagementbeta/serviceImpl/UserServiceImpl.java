package com.nucleusteq.inventorymanagementbeta.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nucleusteq.inventorymanagementbeta.domain.UsersEntitiy;
import com.nucleusteq.inventorymanagementbeta.dto.UsersDto;
import com.nucleusteq.inventorymanagementbeta.dto.mapper.UsersMapper;
import com.nucleusteq.inventorymanagementbeta.repository.UsersRepository;
import com.nucleusteq.inventorymanagementbeta.service.UsersService;

/**
 * @author NucleusTeq Device
 */
@Service
public class UserServiceImpl implements UsersService {
    /**
     * user repository autowired.
     */
    @Autowired
    private UsersRepository userRepository;
    /**
     * user mapper is used for getting usr respons.
     */
    @Autowired
    private UsersMapper usersMapper;
    /**
     * user registration method.
     */
    @Override
    public final void userRegistration(final UsersDto usersDto) {
        // TODO Auto-generated method stub
        UsersEntitiy user = usersMapper.userDtoToUser(usersDto);
       // user.setUpdatedAt(LocalDateTime.now());
       // user.setCreatedAt(LocalDateTime.now());
        userRepository.save(user);
    }
}
