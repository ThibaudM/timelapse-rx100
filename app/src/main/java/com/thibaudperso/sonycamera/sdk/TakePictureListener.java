package com.thibaudperso.sonycamera.sdk;

/**
 * 
 * @author Thibaud Michel
 *
 */
public interface TakePictureListener {

	void onResult(String url);
	void onError(CameraAPI.ResponseCode responseCode, String responseMsg);
	
}
