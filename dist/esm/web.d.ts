import { WebPlugin } from '@capacitor/core';
import { AwakeWxMiniPluginPlugin, AwakeOptions } from './definitions';
export declare class AwakeWxMiniPluginWeb extends WebPlugin implements AwakeWxMiniPluginPlugin {
    constructor();
    awake(options: AwakeOptions): Promise<any>;
}
declare const AwakeWxMiniPlugin: AwakeWxMiniPluginWeb;
export { AwakeWxMiniPlugin };
