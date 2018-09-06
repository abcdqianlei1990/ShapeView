# ShapeView
省去繁杂shape文件维护
## Attrs
|name|type|note|
|:----|:------|:------|
|autoCounting|boolean|if need auto counting|
|countingStart|int|counting down from ${countingStart}|

## How to do
### step 1.Add it in your root build.gradle at the end of repositories:
```groovy
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
### step 2. Add the dependency
```groovy
	dependencies {
          ...
	        compile 'com.github.abcdqianlei1990:TimerButton:1.1'
	}
```
