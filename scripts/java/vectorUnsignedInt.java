/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class vectorUnsignedInt {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected vectorUnsignedInt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(vectorUnsignedInt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      openbabelJNI.delete_vectorUnsignedInt(swigCPtr);
    }
    swigCPtr = 0;
  }

  public vectorUnsignedInt() {
    this(openbabelJNI.new_vectorUnsignedInt__SWIG_0(), true);
  }

  public vectorUnsignedInt(long n) {
    this(openbabelJNI.new_vectorUnsignedInt__SWIG_1(n), true);
  }

  public long size() {
    return openbabelJNI.vectorUnsignedInt_size(swigCPtr, this);
  }

  public long capacity() {
    return openbabelJNI.vectorUnsignedInt_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    openbabelJNI.vectorUnsignedInt_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return openbabelJNI.vectorUnsignedInt_isEmpty(swigCPtr, this);
  }

  public void clear() {
    openbabelJNI.vectorUnsignedInt_clear(swigCPtr, this);
  }

  public void add(long x) {
    openbabelJNI.vectorUnsignedInt_add(swigCPtr, this, x);
  }

  public long get(int i) {
    return openbabelJNI.vectorUnsignedInt_get(swigCPtr, this, i);
  }

  public void set(int i, long x) {
    openbabelJNI.vectorUnsignedInt_set(swigCPtr, this, i, x);
  }

}
