package com.learning.company;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.learning.company.dao.ICompanyDao;
import com.learning.company.entity.CompanyEntity;

@SpringBootTest
@RunWith(SpringRunner.class)
class CompanyApplicationTests {

    @Autowired
    private ICompanyDao companyDao;

    @Test
    public void testSave() {
    	CompanyEntity c = new CompanyEntity();
    	
    	c.setName("ABC");
    	c.setCeo("Jack Beck");
    	c.setTurnover("Jack turnover");
    	c.setBriefwriteup("jack brief");

    	companyDao.save(c);
    }

}
