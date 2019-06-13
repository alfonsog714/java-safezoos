package local.alfonso.safezoos.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "userroles")
public class UserRoles extends Auditable implements Serializable
{
    private User user;

    private Role role;
}
