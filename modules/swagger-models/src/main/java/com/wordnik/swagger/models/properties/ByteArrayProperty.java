package com.wordnik.swagger.models.properties;

import com.wordnik.swagger.models.Xml;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.*;

public class ByteArrayProperty extends AbstractProperty implements Property {

  protected byte[] _default;

  public ByteArrayProperty() {
    super.type = "byte-array";
  }



  public ByteArrayProperty _default(byte[] _default) {
 //   this._default = _default;
    return this;
  }


  public byte[] getDefault() {
    return _default;
  }
  public void setDefault(byte[] _default) {
    //this._default = _default;
  }

  //TODO: implement additional formats
  public static boolean isType(String type, String format) {
    if("string".equals(type) &&  "byte".equals(format))
      return true;
    else return false;
  }
}