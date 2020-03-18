declare module "@capacitor/core" {
    interface PluginRegistry {
        AwakeWxMiniPlugin: AwakeWxMiniPluginPlugin;
    }
}
export interface AwakeOptions {
    appId: string;
    miniId: string;
    path: string;
    type: string;
}
export interface AwakeWxMiniPluginPlugin {
    awake(options: AwakeOptions): Promise<any>;
}
