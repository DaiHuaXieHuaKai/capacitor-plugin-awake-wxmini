import { WebPlugin } from '@capacitor/core';
import { AwakeWxMiniPluginPlugin,AwakeOptions } from './definitions';

export class AwakeWxMiniPluginWeb extends WebPlugin implements AwakeWxMiniPluginPlugin {
  constructor() {
    super({
      name: 'AwakeWxMiniPlugin',
      platforms: ['web']
    });
  }

  async awake(options: AwakeOptions): Promise<any> {
    console.log('ECHO', options);
    return options;
  }
}

const AwakeWxMiniPlugin = new AwakeWxMiniPluginWeb();

export { AwakeWxMiniPlugin };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(AwakeWxMiniPlugin);
