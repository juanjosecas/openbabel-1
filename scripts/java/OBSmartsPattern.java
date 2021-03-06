/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class OBSmartsPattern {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected OBSmartsPattern(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OBSmartsPattern obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      openbabelJNI.delete_OBSmartsPattern(swigCPtr);
    }
    swigCPtr = 0;
  }

  public OBSmartsPattern() {
    this(openbabelJNI.new_OBSmartsPattern__SWIG_0(), true);
  }

  public OBSmartsPattern(OBSmartsPattern cp) {
    this(openbabelJNI.new_OBSmartsPattern__SWIG_1(OBSmartsPattern.getCPtr(cp), cp), true);
  }

  public boolean Init(String pattern) {
    return openbabelJNI.OBSmartsPattern_Init__SWIG_0(swigCPtr, this, pattern);
  }

  public String GetSMARTS() {
    return openbabelJNI.OBSmartsPattern_GetSMARTS__SWIG_0(swigCPtr, this);
  }

  public boolean Empty() {
    return openbabelJNI.OBSmartsPattern_Empty(swigCPtr, this);
  }

  public boolean IsValid() {
    return openbabelJNI.OBSmartsPattern_IsValid(swigCPtr, this);
  }

  public long NumAtoms() {
    return openbabelJNI.OBSmartsPattern_NumAtoms(swigCPtr, this);
  }

  public long NumBonds() {
    return openbabelJNI.OBSmartsPattern_NumBonds(swigCPtr, this);
  }

  public void GetBond(SWIGTYPE_p_int src, SWIGTYPE_p_int dst, SWIGTYPE_p_int ord, int idx) {
    openbabelJNI.OBSmartsPattern_GetBond(swigCPtr, this, SWIGTYPE_p_int.getCPtr(src), SWIGTYPE_p_int.getCPtr(dst), SWIGTYPE_p_int.getCPtr(ord), idx);
  }

  public int GetAtomicNum(int idx) {
    return openbabelJNI.OBSmartsPattern_GetAtomicNum(swigCPtr, this, idx);
  }

  public int GetCharge(int idx) {
    return openbabelJNI.OBSmartsPattern_GetCharge(swigCPtr, this, idx);
  }

  public int GetVectorBinding(int idx) {
    return openbabelJNI.OBSmartsPattern_GetVectorBinding(swigCPtr, this, idx);
  }

  public boolean Match(OBMol mol, boolean single) {
    return openbabelJNI.OBSmartsPattern_Match__SWIG_0(swigCPtr, this, OBMol.getCPtr(mol), mol, single);
  }

  public boolean Match(OBMol mol) {
    return openbabelJNI.OBSmartsPattern_Match__SWIG_1(swigCPtr, this, OBMol.getCPtr(mol), mol);
  }

  public boolean RestrictedMatch(OBMol mol, SWIGTYPE_p_std__vectorTstd__pairTint_int_t_t pairs, boolean single) {
    return openbabelJNI.OBSmartsPattern_RestrictedMatch__SWIG_0(swigCPtr, this, OBMol.getCPtr(mol), mol, SWIGTYPE_p_std__vectorTstd__pairTint_int_t_t.getCPtr(pairs), single);
  }

  public boolean RestrictedMatch(OBMol mol, SWIGTYPE_p_std__vectorTstd__pairTint_int_t_t pairs) {
    return openbabelJNI.OBSmartsPattern_RestrictedMatch__SWIG_1(swigCPtr, this, OBMol.getCPtr(mol), mol, SWIGTYPE_p_std__vectorTstd__pairTint_int_t_t.getCPtr(pairs));
  }

  public boolean RestrictedMatch(OBMol mol, OBBitVec bv, boolean single) {
    return openbabelJNI.OBSmartsPattern_RestrictedMatch__SWIG_2(swigCPtr, this, OBMol.getCPtr(mol), mol, OBBitVec.getCPtr(bv), bv, single);
  }

  public boolean RestrictedMatch(OBMol mol, OBBitVec bv) {
    return openbabelJNI.OBSmartsPattern_RestrictedMatch__SWIG_3(swigCPtr, this, OBMol.getCPtr(mol), mol, OBBitVec.getCPtr(bv), bv);
  }

  public long NumMatches() {
    return openbabelJNI.OBSmartsPattern_NumMatches(swigCPtr, this);
  }

  public vvInt GetMapList() {
    return new vvInt(openbabelJNI.OBSmartsPattern_GetMapList(swigCPtr, this), false);
  }

  public SWIGTYPE_p_std__vectorTstd__vectorTint_t_t__iterator BeginMList() {
    return new SWIGTYPE_p_std__vectorTstd__vectorTint_t_t__iterator(openbabelJNI.OBSmartsPattern_BeginMList(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__vectorTstd__vectorTint_t_t__iterator EndMList() {
    return new SWIGTYPE_p_std__vectorTstd__vectorTint_t_t__iterator(openbabelJNI.OBSmartsPattern_EndMList(swigCPtr, this), true);
  }

  public vvInt GetUMapList() {
    return new vvInt(openbabelJNI.OBSmartsPattern_GetUMapList(swigCPtr, this), false);
  }

  public void WriteMapList(SWIGTYPE_p_std__ostream arg0) {
    openbabelJNI.OBSmartsPattern_WriteMapList(swigCPtr, this, SWIGTYPE_p_std__ostream.getCPtr(arg0));
  }

}
