package x5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import w5.o;
import w5.p;
import w5.q;
import w5.r;
import w5.s;
import w5.t;
import w5.u;
import w5.v;
import w5.w;

public final class c implements b6.b, b {
   public static final a b = new a((e)null);
   private static final Map c;
   private static final HashMap d;
   private static final HashMap e;
   private static final HashMap f;
   private static final Map g;
   private final Class a;

   static {
      int var0 = 0;
      List var2 = n5.g.c(w5.a.class, w5.l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, w5.b.class, w5.c.class, w5.d.class, w5.e.class, w5.f.class, w5.g.class, w5.h.class, w5.i.class, w5.j.class, w5.k.class, w5.m.class, w5.n.class, o.class);
      ArrayList var1 = new ArrayList(n5.g.f(var2, 10));

      Iterator var3;
      for(var3 = var2.iterator(); var3.hasNext(); ++var0) {
         Object var8 = var3.next();
         if (var0 < 0) {
            n5.g.e();
         }

         var1.add(m5.m.a((Class)var8, var0));
      }

      c = n5.w.g(var1);
      HashMap var9 = new HashMap();
      var9.put("boolean", "kotlin.Boolean");
      var9.put("char", "kotlin.Char");
      var9.put("byte", "kotlin.Byte");
      var9.put("short", "kotlin.Short");
      var9.put("int", "kotlin.Int");
      var9.put("float", "kotlin.Float");
      var9.put("long", "kotlin.Long");
      var9.put("double", "kotlin.Double");
      d = var9;
      HashMap var11 = new HashMap();
      var11.put("java.lang.Boolean", "kotlin.Boolean");
      var11.put("java.lang.Character", "kotlin.Char");
      var11.put("java.lang.Byte", "kotlin.Byte");
      var11.put("java.lang.Short", "kotlin.Short");
      var11.put("java.lang.Integer", "kotlin.Int");
      var11.put("java.lang.Float", "kotlin.Float");
      var11.put("java.lang.Long", "kotlin.Long");
      var11.put("java.lang.Double", "kotlin.Double");
      e = var11;
      HashMap var6 = new HashMap();
      var6.put("java.lang.Object", "kotlin.Any");
      var6.put("java.lang.String", "kotlin.String");
      var6.put("java.lang.CharSequence", "kotlin.CharSequence");
      var6.put("java.lang.Throwable", "kotlin.Throwable");
      var6.put("java.lang.Cloneable", "kotlin.Cloneable");
      var6.put("java.lang.Number", "kotlin.Number");
      var6.put("java.lang.Comparable", "kotlin.Comparable");
      var6.put("java.lang.Enum", "kotlin.Enum");
      var6.put("java.lang.annotation.Annotation", "kotlin.Annotation");
      var6.put("java.lang.Iterable", "kotlin.collections.Iterable");
      var6.put("java.util.Iterator", "kotlin.collections.Iterator");
      var6.put("java.util.Collection", "kotlin.collections.Collection");
      var6.put("java.util.List", "kotlin.collections.List");
      var6.put("java.util.Set", "kotlin.collections.Set");
      var6.put("java.util.ListIterator", "kotlin.collections.ListIterator");
      var6.put("java.util.Map", "kotlin.collections.Map");
      var6.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
      var6.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
      var6.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
      var6.putAll(var9);
      var6.putAll(var11);
      Collection var10 = var9.values();
      x5.g.d(var10, "primitiveFqNames.values");
      Iterator var12 = var10.iterator();

      StringBuilder var4;
      String var13;
      while(var12.hasNext()) {
         var13 = (String)var12.next();
         var4 = new StringBuilder();
         var4.append("kotlin.jvm.internal.");
         x5.g.d(var13, "kotlinName");
         var4.append(d6.c.u(var13, '.', (String)null, 2, (Object)null));
         var4.append("CompanionObject");
         String var16 = var4.toString();
         StringBuilder var5 = new StringBuilder();
         var5.append(var13);
         var5.append(".Companion");
         m5.i var14 = m5.m.a(var16, var5.toString());
         var6.put(var14.c(), var14.d());
      }

      var12 = c.entrySet().iterator();

      while(var12.hasNext()) {
         Map.Entry var17 = (Map.Entry)var12.next();
         Class var18 = (Class)var17.getKey();
         var0 = ((Number)var17.getValue()).intValue();
         var13 = var18.getName();
         var4 = new StringBuilder();
         var4.append("kotlin.Function");
         var4.append(var0);
         var6.put(var13, var4.toString());
      }

      f = var6;
      LinkedHashMap var15 = new LinkedHashMap(n5.w.a(var6.size()));
      var3 = var6.entrySet().iterator();

      while(var3.hasNext()) {
         Map.Entry var7 = (Map.Entry)var3.next();
         var15.put(var7.getKey(), d6.c.u((String)var7.getValue(), '.', (String)null, 2, (Object)null));
      }

      g = var15;
   }

   public c(Class var1) {
      x5.g.e(var1, "jClass");
      super();
      this.a = var1;
   }

   public Class a() {
      return this.a;
   }

   public boolean equals(Object var1) {
      boolean var2;
      if (var1 instanceof c && x5.g.a(v5.a.b(this), v5.a.b((b6.b)var1))) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public int hashCode() {
      return v5.a.b(this).hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.a().toString());
      var1.append(" (Kotlin reflection is not available)");
      return var1.toString();
   }

   public static final class a {
      private a() {
      }

      // $FF: synthetic method
      public a(e var1) {
         this();
      }
   }
}
