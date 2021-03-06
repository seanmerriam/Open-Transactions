/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.6
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.wrapper.core.jni;

public class Acct extends Displayable {
  private long swigCPtr;

  protected Acct(long cPtr, boolean cMemoryOwn) {
    super(otapiJNI.Acct_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Acct obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_Acct(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setGui_label(String value) {
    otapiJNI.Acct_gui_label_set(swigCPtr, this, value);
  }

  public String getGui_label() {
    return otapiJNI.Acct_gui_label_get(swigCPtr, this);
  }

  public void setAcct_id(String value) {
    otapiJNI.Acct_acct_id_set(swigCPtr, this, value);
  }

  public String getAcct_id() {
    return otapiJNI.Acct_acct_id_get(swigCPtr, this);
  }

  public void setServer_id(String value) {
    otapiJNI.Acct_server_id_set(swigCPtr, this, value);
  }

  public String getServer_id() {
    return otapiJNI.Acct_server_id_get(swigCPtr, this);
  }

  public static Acct ot_dynamic_cast(Storable pObject) {
    long cPtr = otapiJNI.Acct_ot_dynamic_cast(Storable.getCPtr(pObject), pObject);
    return (cPtr == 0) ? null : new Acct(cPtr, false);
  }

}
