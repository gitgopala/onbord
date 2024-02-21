package onbording.onborddata.service;

public interface EmpOnbordService {

	public abstract void save() throws Exception;
	public abstract boolean getById(Integer eid);
	public abstract void delete(Integer eid);
}
