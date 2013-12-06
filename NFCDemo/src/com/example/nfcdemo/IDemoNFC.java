
package com.example.nfcdemo;

import android.content.Context;
import android.content.Intent;


public interface IDemoNFC {
  /** A constant for the name field in a list activity. */
  String NAME = "name";
  /** A constant for the description field in a list activity. */
  String DESC = "desc";

  /**
   * Returns the demo name.
   * 
   * @return the demo name
   */
  String getName();

  /**
   * Returns the demo description.
   * 
   * @return the demo description
   */
  String getDesc();

  /**
   * Executes the nfc demo.
   * 
   * @param context the context
   * @return the built intent
   */
  Intent execute(Context context);

}
