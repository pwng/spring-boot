package com.ngpanwei.scorecard;

import com.ngpanwei.user.datastore.UserDataStore;
import com.ngpanwei.user.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by pwng on 11/01/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTests {
    @Autowired
    UserDataStore userDataStore ;
    @Test
    public void should_find_user() {
        userDataStore.save(new User("pwng","pwng@thoughtworks.com"));
        List<User> userList ;
        userList = userDataStore.findByName("pwng") ;
        assert userList.get(0) != null ;

        userList = userDataStore.findByEmail("pwng@thoughtworks.com") ;
        assert userList.get(0) != null ;
        System.out.println(userList.get(0).toString()) ;


    }
}
