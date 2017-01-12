package com.ngpanwei.scorecard;

import com.ngpanwei.scorecard.controller.ScorecardRestController;
import com.ngpanwei.scorecard.datastore.ScorecardGroupDataStore;
import com.ngpanwei.scorecard.model.ScorecardGroup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * Created by pwng on 10/01/2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ScorecardApplicationTests {
	@Autowired
	private ScorecardGroupDataStore scorecardGroupDataStore ;

	@Autowired
	private ScorecardRestController scorecardController ;

	@Test
	public void should_find_scorecardGroups() {
		scorecardGroupDataStore.save(new ScorecardGroup("iOS"));
		scorecardGroupDataStore.save(new ScorecardGroup("Android"));

		List<ScorecardGroup> scorecardGroupList= scorecardGroupDataStore.
				findByName("iOS") ;
		ScorecardGroup scorecardGroup = scorecardGroupList.get(0);
		assertNotNull(scorecardGroup) ;

		System.out.println(scorecardGroup.toString()) ;
	}
	@Test
	public void should_not_accept_scorecard_with_no_name() {


	}
}


