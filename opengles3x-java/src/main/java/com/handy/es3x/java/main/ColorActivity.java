package com.handy.es3x.java.main;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.opengl.GLSurfaceView;

import com.handy.es3x.java.renderer.ColorRenderer;
import com.onzhou.opengles.base.AbsGLSurfaceActivity;

/**
 * @anchor: andy
 * @date: 2018-11-02
 * @description:
 */
public class ColorActivity extends AbsGLSurfaceActivity {

    public static void intentStart(Context context) {
        Intent intent = new Intent(context, ColorActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected GLSurfaceView.Renderer bindRenderer() {
        return new ColorRenderer(Color.BLUE);
    }

}