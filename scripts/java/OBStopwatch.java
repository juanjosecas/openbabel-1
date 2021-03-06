/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class OBStopwatch {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OBStopwatch(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OBStopwatch obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      openbabelJNI.delete_OBStopwatch(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void Start() {
    openbabelJNI.OBStopwatch_Start(swigCPtr, this);
  }

  public double Lap() {
    return openbabelJNI.OBStopwatch_Lap(swigCPtr, this);
  }

  public double Elapsed() {
    return openbabelJNI.OBStopwatch_Elapsed(swigCPtr, this);
  }

  public OBStopwatch() {
    this(openbabelJNI.new_OBStopwatch(), true);
  }

}
