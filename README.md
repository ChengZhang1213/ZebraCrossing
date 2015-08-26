# ZebraCrossing
## Descirbe
二维码扫描，基于ZXing
## Note
本工程基于精简版的zxing工程，参照微信，修改了扫描框，并解决竖屏扫描时，二维码拉伸问题。
如果需要修改界面，需要修改ViewfinderView.java中onDraw()方法；拉伸的问题修改位置位于
CameraConfigurationManager.java中initFromCameraParameters()方法。



