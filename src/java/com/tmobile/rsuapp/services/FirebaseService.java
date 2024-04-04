package com.tmobile.rsuapp.services;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.n0;
import d5.b;
import h6.a;

public class FirebaseService extends FirebaseMessagingService {
   private static final String t = "FirebaseService";
   private b s;

   public void onCreate() {
      a.b(t).a("onCreate");
      this.s = new b(this);
   }

   public void p() {
      a.b(t).a("onDeletedMessages");
      this.s.h();
   }

   public void q(n0 var1) {
      a.b(t).a("onMessageReceived");
      this.s.e(var1.u());
   }

   public void s(String var1) {
      a.b(t).a("onNewToken");
      this.s.f(var1);
   }

   public void t(String var1, Exception var2) {
      a.b(t).k("onSendError");
      this.s.g(var1, var2);
   }
}
