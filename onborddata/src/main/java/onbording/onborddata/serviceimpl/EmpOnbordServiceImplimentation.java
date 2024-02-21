package onbording.onborddata.serviceimpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import onbording.onborddata.dao.EmpOnbordRepo;
import onbording.onborddata.entity.EmpOnborEntity;
import onbording.onborddata.service.EmpOnbordService;

@Service
@Slf4j
public class EmpOnbordServiceImplimentation implements EmpOnbordService {
	@Autowired
	public EmpOnbordRepo empOnbordRepo;

	@Override
	public void save() throws Exception {
		String path = "C:\\Users\\ADMIN\\Desktop\\file";
		File f = new File(path);
		if (f != null) {
			File[] listFiles = f.listFiles();
			for (File file : listFiles) {
				String name = file.getName();
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				String readLine = bufferedReader.readLine();
				String[] split = readLine.split(",");

				if (getById(Integer.parseInt(split[0]))) {
					delete(Integer.parseInt(split[0]));
					Thread.sleep(2000);
					EmpOnborEntity empOnborEntity1 = new EmpOnborEntity();
					empOnborEntity1.setEid(Integer.parseInt(split[0]));
					empOnborEntity1.setEname(split[1]);
					empOnborEntity1.setEage(Integer.parseInt(split[2]));
					empOnborEntity1.setEqualification(split[3]);
					empOnbordRepo.save(empOnborEntity1);

				} else {
					EmpOnborEntity empOnborEntity1 = new EmpOnborEntity();
					empOnborEntity1.setEid(Integer.parseInt(split[0]));
					empOnborEntity1.setEname(split[1]);
					empOnborEntity1.setEage(Integer.parseInt(split[2]));
					empOnborEntity1.setEqualification(split[3]);
					empOnbordRepo.save(empOnborEntity1);
				}

			}
		}

	}

	@Override
	public boolean getById(Integer eid) {
		boolean flag = false;
		Optional<EmpOnborEntity> findById = empOnbordRepo.findById(eid);
		if (findById.isPresent()) {
			flag = true;
			return flag;
		}

		return flag;
	}

	@Override
	public void delete(Integer eid) {
		empOnbordRepo.deleteById(eid);
		
	}

}
