package onbording.onborddata.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpOnborEntity {
	@Id
	private Integer eid;
	private String ename;
	private Integer eage;
	private String equalification;

}
