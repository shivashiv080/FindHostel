package com.vitaltechlabs.findhostels.serverapis;


import java.util.Map;

/**
 * Created by RuchiTiwari on 1/14/2017.
 */
public class ApiRequestHelper
{


	public static ApiRequest getAllStates()
	{
		Map<String, String> params = ApiParameters.getStatesList();

		ApiRequest request = new ApiRequest(ApiRequestReferralCode.GET_STATES, ApiConstants.allStatesurl);
		request.setParams(params);

		return request;
	}

	//Get Cities List based on States
	public static ApiRequest getCities(String stateId)
	{
		Map<String, String> params = ApiParameters.getCitiesList(stateId);

		ApiRequest request = new ApiRequest(ApiRequestReferralCode.GET_CITIES, ApiConstants.citiesurl);
		request.setParams(params);

		return request;
	}
///


///////////


}
