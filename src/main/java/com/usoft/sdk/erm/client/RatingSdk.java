package com.usoft.sdk.erm.client;

import com.usoft.erm.external.open.api.protobuf.GetRatingEntReq;
import com.usoft.erm.external.open.api.protobuf.GetRatingEntResp;
import com.usoft.sdk.erm.utils.HttpUtil;
import com.usoft.sdk.erm.utils.ProtoBufUtil;

import java.util.Map;

/**
 * @author: wangcanyi
 * @date: 2019-12-19 14:28
 **/
public class RatingSdk extends BaseSdk {
	public RatingSdk(String baseUrl, String secretId, String secretKey) {
		super(baseUrl, secretId, secretKey);
	}

	public RatingSdk(String baseUrl, String secretId, String secretKey, int timeout) {
		super(baseUrl, secretId, secretKey, timeout);
	}

	/**
	 * 查询企业评级
	 *
	 * @param req
	 * @return
	 */
	public GetRatingEntResp getRatingEnt(GetRatingEntReq.Builder req) throws Exception {
		String url = baseUrl + "/api/open/erm/rating/ent/get";
		Map<String, String> params = genSignToMap(req);
		String respJson = HttpUtil.doGet(url, params, timeout);
		GetRatingEntResp.Builder resp = ProtoBufUtil.toProtoBuf(GetRatingEntResp.newBuilder(), respJson);
		return resp.build();
	}

//	/**
//	 * Json Post 例子
//	 *
//	 * @param req
//	 * @return
//	 */
//	public BatchUpdateOrderResp batchUpdateOrder(BatchUpdateOrderReq.Builder req) throws Exception {
//		String url = baseUrl + "/openapi/trade/order/batch/update";
//		String paramJson = genSignToJson(req);
//		String respJson = HttpUtil.doPost(url, paramJson, timeout);
//		BatchUpdateOrderResp.Builder resp = ProtoBufUtil.toProtoBuf(BatchUpdateOrderResp.newBuilder(), respJson);
//		return resp.build();
//	}
}
