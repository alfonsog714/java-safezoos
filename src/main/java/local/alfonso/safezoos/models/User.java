package local.alfonso.safezoos.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User extends Auditable
{
}
