package com.tmobile.rsuapp.services;

import androidx.lifecycle.v;
import x0.u;

class SimLockService$a$a implements v {
   final SimLockService$a a;

   SimLockService$a$a(SimLockService$a var1) {
      this.a = var1;
   }

   public void b(u var1) {
      if (var1 != null && var1.b().d()) {
         int var2 = var1.a().h("key_result_code", 0);
         this.a.o.a(var2, var1.a());
         x0.v.f(this.a.m).g(this.a.n.a()).k(this);
      }

   }
}
