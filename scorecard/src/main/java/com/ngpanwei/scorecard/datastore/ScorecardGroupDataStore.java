package com.ngpanwei.scorecard.datastore;

import com.ngpanwei.scorecard.model.ScorecardGroup;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by pwng on 11/01/2017.
 */
@Repository
public interface ScorecardGroupDataStore extends
        PagingAndSortingRepository<ScorecardGroup,Long> {

    List<ScorecardGroup> findByName(String name);
}


