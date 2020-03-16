declare module "@capacitor/core" {
    interface PluginRegistry {
        AwakeWxMiniPlugin: AwakeWxMiniPluginPlugin;
    }
}
declare interface AwakeOptions {
    appId: string;
    miniId: string;
    path: string;
    type: string;
}
export interface AwakeWxMiniPluginPlugin {
    awake(options: AwakeOptions): Promise<any>;
}
export {};
