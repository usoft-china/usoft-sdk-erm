package com.usoft.sdk.erm.client;

import com.usoft.erm.external.open.api.protobuf.*;
import com.usoft.sdk.erm.utils.HttpUtil;
import com.usoft.sdk.erm.utils.ProtoBufUtil;

import java.util.Map;

/**
 * @author: linjh
 * @date: 2019-12-23 9:17
 **/
public class DataSourceSdk extends BaseSdk {
    public DataSourceSdk(String baseUrl, String secretId, String secretKey) {
        super(baseUrl, secretId, secretKey);
    }

    public DataSourceSdk(String baseUrl, String secretId, String secretKey, int timeout) {
        super(baseUrl, secretId, secretKey, timeout);
    }

    /**
     * 查询erp报告
     *
     * @param req
     * @return
     */
    public GetErpReportByCodeResp getErpReportByCode(GetErpReportByCodeReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/erp/ent/get";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetErpReportByCodeResp.Builder resp = ProtoBufUtil.toProtoBuf(GetErpReportByCodeResp.newBuilder(), respJson);
        return resp.build();
    }

    /**
     * 查询b2b报告
     *
     * @param req
     * @return
     */
    public GetB2bReportByCodeResp getB2bReportByCode(GetB2bReportByCodeReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/b2b/ent/get";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetB2bReportByCodeResp.Builder resp = ProtoBufUtil.toProtoBuf(GetB2bReportByCodeResp.newBuilder(),respJson);
        return resp.build();
    }

    /**
     * 查询工商和信用报告
     *
     * @param req
     * @return
     */
    public GetCrawlerReportByCodeResp getCrawlerReportByCode(GetCrawlerReportByCodeReq.Builder req) throws Exception {
        String url = baseUrl + "/api/open/crawler/ent/get";
        Map<String, String> params = genSignToMap(req);
        String respJson = HttpUtil.doGet(url, params, timeout);
        GetCrawlerReportByCodeResp.Builder resp = ProtoBufUtil.toProtoBuf(GetCrawlerReportByCodeResp.newBuilder(),respJson);
        return resp.build();
    }
}
