package com.tmobile.rsuapp;

import android.view.KeyEvent;
import android.view.View;

class MainActivity$c implements View.OnKeyListener {
   final MainActivity m;

   MainActivity$c(MainActivity var1) {
      this.m = var1;
   }

   public boolean onKey(View var1, int var2, KeyEvent var3) {
      if ((var2 == 20 || var2 == 61) && var3.getAction() == 0) {
         this.m.findViewById(2131296533).requestFocus(130);
         return true;
      } else {
         return false;
      }
   }
}
