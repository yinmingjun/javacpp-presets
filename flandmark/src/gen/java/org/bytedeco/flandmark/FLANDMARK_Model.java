// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flandmark;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.flandmark.global.flandmark.*;


@Properties(inherit = org.bytedeco.flandmark.presets.flandmark.class)
public class FLANDMARK_Model extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FLANDMARK_Model() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FLANDMARK_Model(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FLANDMARK_Model(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FLANDMARK_Model position(long position) {
        return (FLANDMARK_Model)super.position(position);
    }

    public native DoublePointer W(); public native FLANDMARK_Model W(DoublePointer W);
    public native int W_ROWS(); public native FLANDMARK_Model W_ROWS(int W_ROWS);
    public native int W_COLS(); public native FLANDMARK_Model W_COLS(int W_COLS);
    public native @ByRef FLANDMARK_Data data(); public native FLANDMARK_Model data(FLANDMARK_Data data);
    public native @Cast("uint8_t*") BytePointer normalizedImageFrame(); public native FLANDMARK_Model normalizedImageFrame(BytePointer normalizedImageFrame);
    public native DoublePointer bb(); public native FLANDMARK_Model bb(DoublePointer bb);
    public native FloatPointer sf(); public native FLANDMARK_Model sf(FloatPointer sf);
}