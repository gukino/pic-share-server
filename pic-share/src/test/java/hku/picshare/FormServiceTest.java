package hku.picshare;

import hku.picshare.entity.Form;
import hku.picshare.entity.User;
import hku.picshare.service.FormService;
import hku.picshare.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class FormServiceTest {

    @Autowired
    FormService formService;

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testQuerry() throws Exception {
        for (Form f : formService.getAllFormList()){
            System.out.println(f.toString());
        }
    }
}
