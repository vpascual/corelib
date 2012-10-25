package eu.europeana.corelib.db.service;
import java.net.UnknownHostException;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import com.mongodb.Mongo;
import com.mongodb.MongoException;

import eu.europeana.corelib.db.exception.DatabaseException;
import eu.europeana.corelib.db.logging.api.ApiLogger;
import eu.europeana.corelib.db.logging.api.LogTypeImpl;
import eu.europeana.corelib.db.logging.api.enums.RecordType;
public class ApiLoggerTest {
	ApiLogger log;
	@Test
	public void testLogging(){
		try {
			
			String apiKey="test_key";
			String requestedUri = "test_uri";
			RecordType rType = RecordType.SEARCH;
			String profile = "minimal";
			Mongo mongo = new Mongo("localhost",27017);
			log = new ApiLogger(mongo);
			log.saveApiRequest(apiKey, requestedUri, rType, profile);
			List<LogTypeImpl> lType = log.getRequests(apiKey);
			Assert.assertEquals(1,lType.size());
			Assert.assertEquals(apiKey,lType.get(0).getApiKey());
			Assert.assertEquals(requestedUri,lType.get(0).getRequestedUri());
			Assert.assertEquals(rType,lType.get(0).getRecordType());
			Assert.assertEquals(profile,lType.get(0).getProfile());
			
			Assert.assertEquals(1, log.getRequestNumber(apiKey));
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MongoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@After
	public void cleanup(){
		log.clearLogs();
	}
}