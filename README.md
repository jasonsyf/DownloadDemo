# DownloadDemo
基于rxjava,retrofit的apk下载安装demo（适配android7.0）
## 封装了一个 [library][1]
[1]: https://github.com/jasonsyf/LoadApkAndInstallLib       "library" 
### 项目Gradle 添加   
```allprojects {
    repositories {
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```
### app Gradle添加
```compile 'com.github.jasonsyf:LoadApkAndInstallLib:v0.2.2'```
