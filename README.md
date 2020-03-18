# capacitor-plugin-awake-wxmini

capacitor-plugin-awake-wxmini可以让用户在App中唤起微信小程序，并在操作完成后返回到App中的一个插件。

### 支持平台
* Android

### 使用方法
```markdown
npm install capacitor-plugin-awake-wxmini --save

/* 在android的MainActivity.java中添加插件 */

// 引入插件
import com.brainy.awakewxmini.AwakeWxMiniPlugin;
// 添加插件
add(AwakeWxMiniPlugin.class);

```

### API

### awake

```
awake(options:AwakeOptions):void
```
App中调用改方法唤起微信小程序。

options:AwakeOptions

return:void

### addListener

```
addListener(eventName: string, listenerFunc: Function):PluginListenerHandle 
```

eventName:string = "launchResponse"

listenerFunc Function

returns: PluginListenerHandle

### Interface Used

#### AwakeOptions

```javascript

interface AwakeOptions {
    appId: string;
    // 应用id
    miniId:string;
    // 微信小程序原始Id
    path:string;
    // 小程序打开路径，不填则为小程序默认打开路径，可通过路径传参。如："/path?a=1&b=2"
    type:number;
    // 小程序打开类型，0：正式版，1：开发版，2:体验版
}

```

### Example

```markdown
    import { Plugins } from '@capacitor/core';

    Plugins.AwakeWxMiniPlugin.addListener("launchResponse", (res) => {
        console.log(res)
    })

    Plugins.AwakeWxMiniPlugin.awake({
        appId: "",
        miniId: "",
        path: "",
        type: 0
    })
```
