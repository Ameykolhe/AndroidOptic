package com.example.mandar.androidoptic;

import android.content.Context;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.hardware.Camera;

import java.io.IOException;

public class CameraPreview extends SurfaceView implements SurfaceHolder.Callback {
    private SurfaceHolder mHolder;
    private Camera mCamera;
    public CameraPreview(Context context, Camera camera)
    {
        super(context);
        mCamera = camera;
        mHolder = getHolder();
        mHolder.addCallback(this);
        mHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
    }
    public void surfaceCreated(SurfaceHolder holder)
    {
        try {
            mCamera.setPreviewDisplay(holder);
            mCamera.startPreview();
        }
        catch(Exception e)
        {

        }
    }
    public void surfaceDestroyed(SurfaceHolder holder)
    {

    }
    public void surfaceChanged(SurfaceHolder holder, int format, int w, int h)
    {

    }
}
