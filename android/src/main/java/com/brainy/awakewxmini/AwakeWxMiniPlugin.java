package com.brainy.awakewxmini;

import com.getcapacitor.JSObject;
import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

@NativePlugin()
public class AwakeWxMiniPlugin extends Plugin {
    public static final int MINIPTOGRAM_TYPE_RELEASE = 0;//正式版
    public static final int MINIPROGRAM_TYPE_TEST = 1;//开发版
    public static final int MINIPROGRAM_TYPE_PREVIEW = 2;//体验版

    @PluginMethod()
    public void awake(PluginCall call) {
        String appId = call.getString("appId", "");//应用id
        String miniId = call.getString("miniId", "");//小程序id
        String path = call.getString("path", "");//打开小程序页面地址
        int miniprogramType = call.getInt("type", 0);//类型
        if (appId == "") {
            call.error("appId is required");
            return;
        }
        if (miniId == "") {
            call.error("miniId is required");
            return;
        }
        IWXAPI api = WXAPIFactory.createWXAPI(getContext(), appId);
        WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
        req.userName = miniId;
        req.path = path;
        req.miniprogramType = miniprogramType;
        api.sendReq(req);
    }

    public void onResp(BaseResp resp) {
        if (resp.getType() == ConstantsAPI.COMMAND_LAUNCH_WX_MINIPROGRAM) {
            WXLaunchMiniProgram.Resp launchMiniProResp = (WXLaunchMiniProgram.Resp) resp;
            String extraData =launchMiniProResp.extMsg;
            JSObject res = new JSObject();
            res.put("data",extraData);
            notifyListeners("launchResponse",res);
        }
    }
}
