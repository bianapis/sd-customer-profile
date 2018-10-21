/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerProfileApiService {

	CustomerProfileAlertRecordResponse recordAlerts(String crReferenceId, String bqReferenceId, CustomerProfileAlertRecordRequest request);
	
	CustomerProfileStateRecordResponse recordStates(String crReferenceId, String bqReferenceId, CustomerProfileStateRecordRequest request);
	
	CustomerProfileRatingRecordResponse recordRatings(String crReferenceId, String bqReferenceId, CustomerProfileRatingRecordRequest request);
	
	CustomerProfileRefreshResponse requestPut(String crReferenceId, CustomerProfileRequestRequest request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	CustomerProfileResponse retrieve(String crReferenceId);
	
	CustomerProfileAlertResponse retrieveAlerts(String crReferenceId, String bqReferenceId);
	
	CustomerProfileRatingResponse retrieveRatings(String crReferenceId, String bqReferenceId);
	
	CustomerProfileStateResponse retrieveStates(String crReferenceId, String bqReferenceId);
	
}
