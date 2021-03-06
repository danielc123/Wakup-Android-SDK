package com.yellowpineapple.wakup.sdk.communications;

import android.net.Uri;

import com.yellowpineapple.wakup.sdk.utils.Ln;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class RESTRequest extends DefaultRequest {

    List<String> segmentParams = new ArrayList<String>();
	
	protected String baseURL = null;
	protected String resourceName = null;
	protected String methodName = null;
	
	public RESTRequest() {
		this.httpMethod = HttpMethod.GET;
	}

    public void addSegmentParams(String[] segments) {
        for (String segment : segments) { addSegmentParam(segment); }
    }
	public void addSegmentParam(String param) {
		segmentParams.add(param);
	}
	
	protected void serializeSegments(List<String> segments, Uri.Builder b) {
		for (String segment : segments) {
			b.appendPath(segment);
		}
	}
	
	protected void serializeParams(List<RequestParam> params, Uri.Builder b) {
		if (this.httpMethod == HttpMethod.GET) {
			for (RequestParam param : params) {
				b.appendQueryParameter(param.getKey(), param.getValue().toString());
			}
		}
	}
	
	@Override
	public String getURL() {
		String url = "";
		if (this.getBaseURL() != null) {
			Uri.Builder b = Uri.parse(this.getBaseURL()).buildUpon();
			if (this.getResourceName() != null) {
				b.appendPath(this.getResourceName());
			}
			if (this.getMethodName() != null) {
				b.appendPath(this.getMethodName());
			}
			this.serializeSegments(segmentParams, b);
			this.serializeParams(getParams(), b);
			url = b.build().toString(); 
		}
		
		return url;
	}

	public String getBaseURL() {
		return baseURL;
	}

	public String getResourceName() {
		return resourceName;
	}
	
	public String getMethodName() {
		return methodName;
	}
	
	protected JSONObject serializeBodyParams(List<RequestParam> params) {
		JSONObject json = new JSONObject();
		for (RequestParam param : params) {
			try {
				switch (param.getParamType()) {
				case SIMPLE:
					if (param.getValue() != null) {
						if (param.getValue() instanceof Map) {
							json.put(param.getKey(), new JSONObject((Map<?, ?>) param.getValue()));
						} else {
							json.put(param.getKey(), param.getValue());
						}
					}
					break;
				case ARRAY:
					if (param.getArrayValue() != null) {
						JSONArray array = new JSONArray(param.getArrayValue());
						json.put(param.getKey(), array);
					}
				default:
					break;
				}
			} catch (JSONException e) {
				Ln.e(e, "Error while trying to serialize params");
			}
		}
		return json;
	}
	
	@Override
	public String getBodyContent() {
		String body = serializeBodyParams(getParams()).toString();
		return body;
	}

}
