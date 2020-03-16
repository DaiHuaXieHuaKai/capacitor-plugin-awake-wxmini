
  Pod::Spec.new do |s|
    s.name = 'CapacitorPluginAwakeWxmini'
    s.version = '0.0.1'
    s.summary = 'App awake wx mini program.'
    s.license = 'MIT'
    s.homepage = 'https://github.com/DaiHuaXieHuaKai/capacitor-plugin-awake-wxmini.git'
    s.author = 'Brainy'
    s.source = { :git => 'https://github.com/DaiHuaXieHuaKai/capacitor-plugin-awake-wxmini.git', :tag => s.version.to_s }
    s.source_files = 'ios/Plugin/**/*.{swift,h,m,c,cc,mm,cpp}'
    s.ios.deployment_target  = '11.0'
    s.dependency 'Capacitor'
  end