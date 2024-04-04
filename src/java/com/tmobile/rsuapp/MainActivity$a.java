package com.tmobile.rsuapp;

import android.view.View;

class MainActivity$a implements View.OnFocusChangeListener {
   final MainActivity a;

   MainActivity$a(MainActivity var1) {
      this.a = var1;
   }

   public void onFocusChange(View var1, boolean var2) {
      ((View)var1.getFocusables(17).get(0)).requestFocus();
   }
}
