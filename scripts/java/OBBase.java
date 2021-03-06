/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class OBBase {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OBBase(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OBBase obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      openbabelJNI.delete_OBBase(swigCPtr);
    }
    swigCPtr = 0;
  }

  public boolean Clear() {
    return openbabelJNI.OBBase_Clear(swigCPtr, this);
  }

  public OBBase DoTransformations(SWIGTYPE_p_std__mapTstd__string_std__string_t arg0) {
    long cPtr = openbabelJNI.OBBase_DoTransformations(swigCPtr, this, SWIGTYPE_p_std__mapTstd__string_std__string_t.getCPtr(arg0));
    return (cPtr == 0) ? null : new OBBase(cPtr, false);
  }

  public static String ClassDescription() {
    return openbabelJNI.OBBase_ClassDescription();
  }

  public boolean HasData(String arg0) {
    return openbabelJNI.OBBase_HasData__SWIG_0(swigCPtr, this, arg0);
  }

  public boolean HasData(long type) {
    return openbabelJNI.OBBase_HasData__SWIG_2(swigCPtr, this, type);
  }

  public void DeleteData(long type) {
    openbabelJNI.OBBase_DeleteData__SWIG_0(swigCPtr, this, type);
  }

  public void DeleteData(OBGenericData arg0) {
    openbabelJNI.OBBase_DeleteData__SWIG_1(swigCPtr, this, OBGenericData.getCPtr(arg0), arg0);
  }

  public void DeleteData(vectorData arg0) {
    openbabelJNI.OBBase_DeleteData__SWIG_2(swigCPtr, this, vectorData.getCPtr(arg0), arg0);
  }

  public boolean DeleteData(String s) {
    return openbabelJNI.OBBase_DeleteData__SWIG_3(swigCPtr, this, s);
  }

  public void SetData(OBGenericData d) {
    openbabelJNI.OBBase_SetData(swigCPtr, this, OBGenericData.getCPtr(d), d);
  }

  public long DataSize() {
    return openbabelJNI.OBBase_DataSize(swigCPtr, this);
  }

  public OBGenericData GetData(long type) {
    long cPtr = openbabelJNI.OBBase_GetData__SWIG_0(swigCPtr, this, type);
    return (cPtr == 0) ? null : new OBGenericData(cPtr, false);
  }

  public OBGenericData GetData(String arg0) {
    long cPtr = openbabelJNI.OBBase_GetData__SWIG_1(swigCPtr, this, arg0);
    return (cPtr == 0) ? null : new OBGenericData(cPtr, false);
  }

  public vectorData GetData() {
    return new vectorData(openbabelJNI.OBBase_GetData__SWIG_3(swigCPtr, this), false);
  }

  public vectorData GetData(DataOrigin source) {
    return new vectorData(openbabelJNI.OBBase_GetData__SWIG_4(swigCPtr, this, source.swigValue()), true);
  }

  public SWIGTYPE_p_std__vectorTOpenBabel__OBGenericData_p_t__iterator BeginData() {
    return new SWIGTYPE_p_std__vectorTOpenBabel__OBGenericData_p_t__iterator(openbabelJNI.OBBase_BeginData(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__vectorTOpenBabel__OBGenericData_p_t__iterator EndData() {
    return new SWIGTYPE_p_std__vectorTOpenBabel__OBGenericData_p_t__iterator(openbabelJNI.OBBase_EndData(swigCPtr, this), true);
  }

  public OBBase() {
    this(openbabelJNI.new_OBBase(), true);
  }

}
