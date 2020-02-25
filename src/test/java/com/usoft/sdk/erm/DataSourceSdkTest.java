package com.usoft.sdk.erm;

import com.usoft.erm.external.open.api.protobuf.*;
import com.usoft.sdk.erm.client.DataSourceSdk;
import com.usoft.sdk.erm.utils.ProtoBufUtil;
import org.junit.jupiter.api.Test;

/**
 * @author: linjh
 * @date: 2019-12-23 9:25
 **/
public class DataSourceSdkTest {
    /**
     * 测试地址
     */
    private DataSourceSdk dataSourceSdk = new DataSourceSdk("https://ermrest.uuzcc.cn", "10042875", "c49f7be6a861461ab951e55030055a5c");

    /**
     * 正式地址
     */
//	private DataSourceSdk dataSourceSdk = new DataSourceSdk("http://api-product.usoftchina.com");
    @Test
    public void getErpReportByCode() throws Exception {
        GetErpReportByCodeReq.Builder req = GetErpReportByCodeReq.newBuilder();
        req.setEnuu(10000666);
        GetErpReportByCodeResp resp = dataSourceSdk.getErpReportByCode(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void getB2bReportByCode() throws Exception {
        GetB2bReportByCodeReq.Builder req = GetB2bReportByCodeReq.newBuilder();
        req.setEnuu(10000666);
        GetB2bReportByCodeResp resp = dataSourceSdk.getB2bReportByCode(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }

    @Test
    public void getCrawlerReportByCode() throws Exception {
        GetCrawlerReportByCodeReq.Builder req = GetCrawlerReportByCodeReq.newBuilder();
        req.setEnuu(10030538);
        GetCrawlerReportByCodeResp resp = dataSourceSdk.getCrawlerReportByCode(req);
        System.out.println(ProtoBufUtil.toJSON(resp));
    }
}
