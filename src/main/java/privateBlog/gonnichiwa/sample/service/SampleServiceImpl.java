package privateBlog.gonnichiwa.sample.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import privateBlog.gonnichiwa.sample.dao.SampleDAO;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="sampleDAO")
	private SampleDAO sDAO;
	
	@Override
	public List<Map<String, Object>> selectMenuList(Map<String, Object> map) {
		return sDAO.selectMenuList(map);
	}

}
