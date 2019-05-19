package com.reactnativebugresolveassetsource;

import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.image.ReactImageView;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class CustomImage extends SimpleViewManager<ImageView> {

    ThemedReactContext context;

    @Nonnull
    @Override
    public String getName() {
        return "CustomImage";
    }

    @Nonnull
    @Override
    protected ImageView createViewInstance(@Nonnull ThemedReactContext reactContext) {
        context = reactContext;
        return new ImageView(reactContext);
    }

    @ReactProp(name = "src")
    public void setSrc(ImageView view, @Nullable ReadableMap map) {
        Glide.with(context).load(Uri.parse(map.getString("uri"))).into(view);

    }

}
