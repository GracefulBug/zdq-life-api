package zdq.user.service;

import zdq.user.entity.UserAddress;

import java.util.List;

public interface UserService {

    /**
     * 根据用户
     * @param userId
     * @return
     */
    List<UserAddress> findByUserId(String userId);
}
