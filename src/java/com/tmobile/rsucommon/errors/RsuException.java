package com.tmobile.rsucommon.errors;

public class RsuException extends Exception {
   private static final String TAG = "RsuException";
   private int mErrorCode;
   private int mSleReturnCode;
   private int mSleVendorCode;

   protected RsuException(int var1, int var2, int var3, String var4) {
      super(var4);
      this.mErrorCode = var2;
      this.mSleVendorCode = var1;
      this.mSleReturnCode = var3;
   }

   public int getErrorCode() {
      return this.mErrorCode;
   }

   public int getSleReturnCode() {
      return this.mSleReturnCode;
   }

   public int getSleVendorCode() {
      return this.mSleVendorCode;
   }
}
