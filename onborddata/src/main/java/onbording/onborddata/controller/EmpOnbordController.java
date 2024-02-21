package onbording.onborddata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import onbording.onborddata.service.EmpOnbordService;

@RestController
@RequestMapping("emp")

public class EmpOnbordController {
	@Autowired
	public EmpOnbordService es;

	@Scheduled(cron = "*/50 * * * * *")
	public void save() throws Exception {
		es.save();
		

	}
}
