// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_dnn.*;

//Slicing

@Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class _Range extends Range {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _Range(Pointer p) { super(p); }

    public _Range(@Const @ByRef Range r) { super((Pointer)null); allocate(r); }
    private native void allocate(@Const @ByRef Range r);
    public _Range(int start_, int size_/*=1*/) { super((Pointer)null); allocate(start_, size_); }
    private native void allocate(int start_, int size_/*=1*/);
    public _Range(int start_) { super((Pointer)null); allocate(start_); }
    private native void allocate(int start_);
}