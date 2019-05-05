// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Used to instantiate and run functions in a distributed system.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DistributedFunctionLibraryRuntime extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DistributedFunctionLibraryRuntime(Pointer p) { super(p); }


  // The _target attr in attrs determines where the function is instantiated.
  public native @ByVal Status Instantiate(
        @StdString BytePointer function_name, @Const @ByRef FunctionLibraryDefinition lib_def,
        @ByVal AttrSlice attrs,
        @Const @ByRef FunctionLibraryRuntime.InstantiateOptions options,
        @Cast("tensorflow::FunctionLibraryRuntime::LocalHandle*") LongPointer handle);
  public native @ByVal Status Instantiate(
        @StdString String function_name, @Const @ByRef FunctionLibraryDefinition lib_def,
        @ByVal AttrSlice attrs,
        @Const @ByRef FunctionLibraryRuntime.InstantiateOptions options,
        @Cast("tensorflow::FunctionLibraryRuntime::LocalHandle*") LongBuffer handle);
  public native @ByVal Status Instantiate(
        @StdString BytePointer function_name, @Const @ByRef FunctionLibraryDefinition lib_def,
        @ByVal AttrSlice attrs,
        @Const @ByRef FunctionLibraryRuntime.InstantiateOptions options,
        @Cast("tensorflow::FunctionLibraryRuntime::LocalHandle*") long... handle);
  public native @ByVal Status Instantiate(
        @StdString String function_name, @Const @ByRef FunctionLibraryDefinition lib_def,
        @ByVal AttrSlice attrs,
        @Const @ByRef FunctionLibraryRuntime.InstantiateOptions options,
        @Cast("tensorflow::FunctionLibraryRuntime::LocalHandle*") LongPointer handle);
  public native @ByVal Status Instantiate(
        @StdString BytePointer function_name, @Const @ByRef FunctionLibraryDefinition lib_def,
        @ByVal AttrSlice attrs,
        @Const @ByRef FunctionLibraryRuntime.InstantiateOptions options,
        @Cast("tensorflow::FunctionLibraryRuntime::LocalHandle*") LongBuffer handle);
  public native @ByVal Status Instantiate(
        @StdString String function_name, @Const @ByRef FunctionLibraryDefinition lib_def,
        @ByVal AttrSlice attrs,
        @Const @ByRef FunctionLibraryRuntime.InstantiateOptions options,
        @Cast("tensorflow::FunctionLibraryRuntime::LocalHandle*") long... handle);

  // opts.runner isn't used for execution.
  public native void Run(@Const @ByRef FunctionLibraryRuntime.Options opts,
                     @Cast("tensorflow::FunctionLibraryRuntime::LocalHandle") long handle,
                     @ByVal TensorVector args, TensorVector rets,
                     @ByVal @Cast("tensorflow::FunctionLibraryRuntime::DoneCallback*") Pointer done);
}