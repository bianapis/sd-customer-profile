/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Monitor;

@BianRestController
public class CustomerProfileApiController {

	@Autowired
	CustomerProfileApiService service;
	
	@BQ("alerts")
	@Monitor.Record
	public BianResponse<CustomerProfileAlertRecordResponse> recordAlerts(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerProfileAlertRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.recordAlerts(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("states")
	@Monitor.Record
	public BianResponse<CustomerProfileStateRecordResponse> recordStates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerProfileStateRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.recordStates(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("ratings")
	@Monitor.Record
	public BianResponse<CustomerProfileRatingRecordResponse> recordRatings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerProfileRatingRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.recordRatings(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Monitor.RequestPut
	public BianResponse<CustomerProfileRefreshResponse> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerProfileRequestRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Monitor.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Monitor.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Monitor.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Monitor.Retrieve
	public BianResponse<CustomerProfileResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("alerts")
	@Monitor.Retrieve
	public BianResponse<CustomerProfileAlertResponse> retrieveAlerts(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAlerts(crReferenceId, bqReferenceId));
	}
	
	@BQ("ratings")
	@Monitor.Retrieve
	public BianResponse<CustomerProfileRatingResponse> retrieveRatings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRatings(crReferenceId, bqReferenceId));
	}
	
	@BQ("states")
	@Monitor.Retrieve
	public BianResponse<CustomerProfileStateResponse> retrieveStates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStates(crReferenceId, bqReferenceId));
	}
	
}
