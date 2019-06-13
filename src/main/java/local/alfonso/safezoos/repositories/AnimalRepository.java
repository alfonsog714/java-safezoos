package local.alfonso.safezoos.repositories;

import local.alfonso.safezoos.models.Animal;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
//    SELECT a.zooid, z.zooname, count(a.animalid) as countanimals
//    FROM zooanimals a
//    INNER JOIN zoo z
//    ON a.zooid = z.zooid
//    GROUP BY a.zooid, z.zooname

//    @Query(value = "SELECT a.zooid, z.zooname, count(a.animalid) as countanimals FROM zooanimals a INNER JOIN zoo z ON a.zooid = z.zooid GROUP BY a.zooid, z.zooname")
//    ArrayList<CountAnimalsInZoo> getCountAnimalsInZoo();

//    DELETE
//    FROM zooanimals
//    WHERE zooid =

//    @Modifying
//    @Query(value = "DELETE FROM zooanimals WHERE zooid = :zooid", nativeQuery = true)
//    void deleteZooFromZooanimals(long zooid);
}
