# ShapeView
省去繁杂shape文件维护
## Attrs
|name|type|note|
|:----|:------|
|shape_solid|背景色|
|shape_radius|四角弧度|
|shape_topLeftRadius|左上角弧度|
|shape_topRightRadius|右上角弧度|
|shape_bottomRightRadius|右下角弧度|
|shape_bottomLeftRadius|左下角弧度|
|shape_strokeWidth|描边宽度|
|shape_strokeColor|描边颜色|

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
