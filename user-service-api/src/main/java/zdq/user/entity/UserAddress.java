package zdq.user.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserAddress implements Serializable {

    private Integer id;

    private String userAddress;

    private String userId;

    private String phoneNum;

    private Boolean isDefault;
}
