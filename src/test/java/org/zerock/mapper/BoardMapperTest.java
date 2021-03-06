package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {
	
	@Setter(onMethod_= {@Autowired})
	private BoardMapper mapper;
	
	@Test
	public void getList() {
		Criteria cri = new Criteria(1);
		log.info(mapper.list(cri));
	}

	@Test
	public void getTotal() {
		Criteria cri = new Criteria();
		log.info(mapper.getTotal(cri));
	}
}
