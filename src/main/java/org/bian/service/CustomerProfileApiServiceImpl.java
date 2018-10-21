/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerProfileApiServiceImpl implements CustomerProfileApiService {

	public CustomerProfileAlertRecordResponse recordAlerts(String crReferenceId, String bqReferenceId, CustomerProfileAlertRecordRequest request){
		return JsonReader.read("record-CustomerProfileAlertRecordResponse.json",new TypeReference<CustomerProfileAlertRecordResponse>(){});
	}
	
	public CustomerProfileStateRecordResponse recordStates(String crReferenceId, String bqReferenceId, CustomerProfileStateRecordRequest request){
		return JsonReader.read("record-CustomerProfileStateRecordResponse.json",new TypeReference<CustomerProfileStateRecordResponse>(){});
	}
	
	public CustomerProfileRatingRecordResponse recordRatings(String crReferenceId, String bqReferenceId, CustomerProfileRatingRecordRequest request){
		return JsonReader.read("record-CustomerProfileRatingRecordResponse.json",new TypeReference<CustomerProfileRatingRecordResponse>(){});
	}
	
	public CustomerProfileRefreshResponse requestPut(String crReferenceId, CustomerProfileRequestRequest request){
		return JsonReader.read("requestPut-CustomerProfileRefreshResponse.json",new TypeReference<CustomerProfileRefreshResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CustomerProfileResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CustomerProfileResponse.json",new TypeReference<CustomerProfileResponse>(){});
	}
	
	public CustomerProfileAlertResponse retrieveAlerts(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerProfileAlertResponse.json",new TypeReference<CustomerProfileAlertResponse>(){});
	}
	
	public CustomerProfileRatingResponse retrieveRatings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerProfileRatingResponse.json",new TypeReference<CustomerProfileRatingResponse>(){});
	}
	
	public CustomerProfileStateResponse retrieveStates(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerProfileStateResponse.json",new TypeReference<CustomerProfileStateResponse>(){});
	}
	
}
