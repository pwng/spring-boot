package com.ngpanwei.user.datastore;

import com.ngpanwei.scorecard.model.ScorecardGroup;
import com.ngpanwei.user.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by pwng on 11/01/2017.
 */
public interface UserDataStore extends
        PagingAndSortingRepository<User,Long> {

    List<User> findByName(String name);

    List<User> findByEmail(String email);

}
