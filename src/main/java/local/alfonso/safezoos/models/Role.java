package local.alfonso.safezoos.models;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long roleid;

    @Column(nullable = false, unique = true)
    private String rolename;
}
