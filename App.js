/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, { Component } from 'react'
import { Platform, StyleSheet, Text, View, requireNativeComponent, Image } from 'react-native'

const CustomImage = requireNativeComponent('CustomImage')
const img = require('./images/marker.png')

export default class App extends Component {
  render() {
    const imgProps = Image.resolveAssetSource(img);
    return (
      <View>
        <Text>{JSON.stringify(imgProps, null, 4)}</Text>
        <CustomImage style={{ width: imgProps.width, height: imgProps.height }} src={imgProps} />
      </View>
    )
  }
}
