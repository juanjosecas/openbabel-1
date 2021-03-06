/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class OBConformerData extends OBGenericData {
  private long swigCPtr;

  protected OBConformerData(long cPtr, boolean cMemoryOwn) {
    super(openbabelJNI.SWIGOBConformerDataUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OBConformerData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      openbabelJNI.delete_OBConformerData(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public OBConformerData() {
    this(openbabelJNI.new_OBConformerData__SWIG_0(), true);
  }

  public OBConformerData(OBConformerData arg0) {
    this(openbabelJNI.new_OBConformerData__SWIG_1(OBConformerData.getCPtr(arg0), arg0), true);
  }

  public OBGenericData Clone(OBBase arg0) {
    long cPtr = openbabelJNI.OBConformerData_Clone(swigCPtr, this, OBBase.getCPtr(arg0), arg0);
    return (cPtr == 0) ? null : new OBGenericData(cPtr, false);
  }

  public void SetDimension(SWIGTYPE_p_std__vectorTunsigned_short_t vd) {
    openbabelJNI.OBConformerData_SetDimension(swigCPtr, this, SWIGTYPE_p_std__vectorTunsigned_short_t.getCPtr(vd));
  }

  public void SetEnergies(vectorDouble ve) {
    openbabelJNI.OBConformerData_SetEnergies(swigCPtr, this, vectorDouble.getCPtr(ve), ve);
  }

  public void SetForces(SWIGTYPE_p_std__vectorTstd__vectorTOpenBabel__vector3_t_t vf) {
    openbabelJNI.OBConformerData_SetForces(swigCPtr, this, SWIGTYPE_p_std__vectorTstd__vectorTOpenBabel__vector3_t_t.getCPtr(vf));
  }

  public void SetVelocities(SWIGTYPE_p_std__vectorTstd__vectorTOpenBabel__vector3_t_t vv) {
    openbabelJNI.OBConformerData_SetVelocities(swigCPtr, this, SWIGTYPE_p_std__vectorTstd__vectorTOpenBabel__vector3_t_t.getCPtr(vv));
  }

  public void SetDisplacements(SWIGTYPE_p_std__vectorTstd__vectorTOpenBabel__vector3_t_t vd) {
    openbabelJNI.OBConformerData_SetDisplacements(swigCPtr, this, SWIGTYPE_p_std__vectorTstd__vectorTOpenBabel__vector3_t_t.getCPtr(vd));
  }

  public void SetData(vectorString vdat) {
    openbabelJNI.OBConformerData_SetData(swigCPtr, this, vectorString.getCPtr(vdat), vdat);
  }

  public SWIGTYPE_p_std__vectorTunsigned_short_t GetDimension() {
    return new SWIGTYPE_p_std__vectorTunsigned_short_t(openbabelJNI.OBConformerData_GetDimension(swigCPtr, this), true);
  }

  public vectorDouble GetEnergies() {
    return new vectorDouble(openbabelJNI.OBConformerData_GetEnergies(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__vectorTstd__vectorTOpenBabel__vector3_t_t GetForces() {
    return new SWIGTYPE_p_std__vectorTstd__vectorTOpenBabel__vector3_t_t(openbabelJNI.OBConformerData_GetForces(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__vectorTstd__vectorTOpenBabel__vector3_t_t GetVelocities() {
    return new SWIGTYPE_p_std__vectorTstd__vectorTOpenBabel__vector3_t_t(openbabelJNI.OBConformerData_GetVelocities(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__vectorTstd__vectorTOpenBabel__vector3_t_t GetDisplacements() {
    return new SWIGTYPE_p_std__vectorTstd__vectorTOpenBabel__vector3_t_t(openbabelJNI.OBConformerData_GetDisplacements(swigCPtr, this), true);
  }

  public vectorString GetData() {
    return new vectorString(openbabelJNI.OBConformerData_GetData(swigCPtr, this), true);
  }

}
