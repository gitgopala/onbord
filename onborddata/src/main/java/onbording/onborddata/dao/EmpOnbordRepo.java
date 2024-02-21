package onbording.onborddata.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import onbording.onborddata.entity.EmpOnborEntity;
@Repository
public interface EmpOnbordRepo extends JpaRepository<EmpOnborEntity, Integer> {

}
