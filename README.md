Steps to reproduce:
-------------------------

1. Create an app with react-native init
2. Create a UI Native component(ImageView) for Android and implement as in `CustomImage.java`
3. From JS, using send props to this component using `Image.resolveAssetSource(require('imagename'))`
4. Run the app in debug mode and see the marker.png is shown correct
5. Run android bundler for release mode and create a signed apk and upload it to either emulator or physical device. See marker.png is not show because URI is not formed correctly.

Note: To see what props are sent to native component, I also print out props in a Text component. URI is formed without file extension or full path. Therefore ImageView cannot find the resource.

|DEBUG|RELEASE|
|-----|-------|
|https://raw.githubusercontent.com/aliustaoglu/react-native-bug-resolve-asset-source/master/screenshots/imagesource-debug.png|https://raw.githubusercontent.com/aliustaoglu/react-native-bug-resolve-asset-source/master/screenshots/imagesource-release.png|