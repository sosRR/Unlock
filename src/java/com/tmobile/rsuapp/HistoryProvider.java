package com.tmobile.rsuapp;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

public class HistoryProvider extends ContentProvider {
   private static final String n = "HistoryProvider";
   public static final Uri o = Uri.parse("content://com.tmobile.rsuapp.provider/history");
   private static final UriMatcher p;
   private a m;

   static {
      UriMatcher var0 = new UriMatcher(-1);
      p = var0;
      var0.addURI("com.tmobile.rsuapp.provider", "history", 1);
      var0.addURI("com.tmobile.rsuapp.provider", "history/#", 2);
   }

   private void a(String[] var1) {
      synchronized(this){}
      if (var1 != null) {
         try {
            HashSet var2 = new HashSet(Arrays.asList(var1));
            HashSet var6 = new HashSet(Arrays.asList(HistoryProvider.a.n));
            if (!var6.containsAll(var2)) {
               IllegalArgumentException var7 = new IllegalArgumentException("Unknown columns in projection");
               throw var7;
            }
         } finally {
            ;
         }
      }

   }

   public int delete(Uri var1, String var2, String[] var3) {
      synchronized(this){}

      try {
         h6.a.b(n).a("Deleting history records not supported");
      } finally {
         ;
      }

      return 0;
   }

   public String getType(Uri var1) {
      synchronized(this){}
      boolean var5 = false;

      int var2;
      try {
         var5 = true;
         var2 = p.match(var1);
         var5 = false;
      } finally {
         if (var5) {
            ;
         }
      }

      if (var2 != 1) {
         return var2 != 2 ? null : "vnd.android.cursor.item/history";
      } else {
         return "vnd.android.cursor.dir/history";
      }
   }

   public Uri insert(Uri var1, ContentValues var2) {
      synchronized(this){}

      Throwable var10000;
      label195: {
         SQLiteDatabase var5;
         boolean var10001;
         label190: {
            try {
               var5 = this.m.getWritableDatabase();
               if (p.match(var1) == 1) {
                  break label190;
               }
            } catch (Throwable var26) {
               var10000 = var26;
               var10001 = false;
               break label195;
            }

            try {
               StringBuilder var30 = new StringBuilder();
               var30.append("Bad URI: ");
               var30.append(var1);
               IllegalArgumentException var29 = new IllegalArgumentException(var30.toString());
               throw var29;
            } catch (Throwable var25) {
               var10000 = var25;
               var10001 = false;
               break label195;
            }
         }

         long var3;
         if (var5 != null) {
            try {
               var3 = var5.insert("history", (String)null, var2);
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break label195;
            }
         } else {
            var3 = 0L;
         }

         try {
            this.getContext().getContentResolver().notifyChange(var1, (ContentObserver)null);
            StringBuilder var28 = new StringBuilder();
            var28.append(o);
            var28.append("/");
            var28.append(var3);
            var1 = Uri.parse(var28.toString());
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            break label195;
         }

         return var1;
      }

      Throwable var27 = var10000;
      throw var27;
   }

   public boolean onCreate() {
      synchronized(this){}

      try {
         h6.a.b(n).a("onCreate");
         a var1 = new a(this.getContext());
         this.m = var1;
      } finally {
         ;
      }

      return true;
   }

   public Cursor query(Uri var1, String[] var2, String var3, String[] var4, String var5) {
      synchronized(this){}

      Throwable var10000;
      label292: {
         int var6;
         SQLiteQueryBuilder var8;
         boolean var10001;
         try {
            this.a(var2);
            var8 = new SQLiteQueryBuilder();
            var8.setTables("history");
            var6 = p.match(var1);
         } catch (Throwable var39) {
            var10000 = var39;
            var10001 = false;
            break label292;
         }

         String var44;
         if (var6 != 1) {
            if (var6 != 2) {
               try {
                  StringBuilder var41 = new StringBuilder();
                  var41.append("URI not recognized: ");
                  var41.append(var1);
                  IllegalArgumentException var43 = new IllegalArgumentException(var41.toString());
                  throw var43;
               } catch (Throwable var35) {
                  var10000 = var35;
                  var10001 = false;
                  break label292;
               }
            }

            try {
               StringBuilder var7 = new StringBuilder();
               var7.append("_id=");
               var7.append(var1.getLastPathSegment());
               var8.appendWhere(var7.toString());
            } catch (Throwable var37) {
               var10000 = var37;
               var10001 = false;
               break label292;
            }

            var44 = var5;
         } else {
            label294: {
               var44 = var5;

               try {
                  if (!TextUtils.isEmpty(var5)) {
                     break label294;
                  }
               } catch (Throwable var38) {
                  var10000 = var38;
                  var10001 = false;
                  break label292;
               }

               var44 = "_ID ASC";
            }
         }

         Cursor var42;
         try {
            var42 = var8.query(this.m.getReadableDatabase(), var2, var3, var4, (String)null, (String)null, var44);
            var42.setNotificationUri(this.getContext().getContentResolver(), var1);
         } catch (Throwable var36) {
            var10000 = var36;
            var10001 = false;
            break label292;
         }

         return var42;
      }

      Throwable var40 = var10000;
      throw var40;
   }

   public int update(Uri var1, ContentValues var2, String var3, String[] var4) {
      h6.a.b(n).a("Modifying history records not supported");
      return 0;
   }

   private static class a extends SQLiteOpenHelper {
      private static final String m = "HistoryProvider$a";
      public static final String[] n = new String[]{"_id", "action", "status", "stamp", "until", "result"};

      public a(Context var1) {
         super(var1, "historytable.db", (SQLiteDatabase.CursorFactory)null, 1);
      }

      public void onCreate(SQLiteDatabase var1) {
         h6.a.b(m).a("Crating database for provider: create table history(_id integer primary key autoincrement, action text not null, status integer, stamp integer, until integer, result text not null);");
         var1.execSQL("create table history(_id integer primary key autoincrement, action text not null, status integer, stamp integer, until integer, result text not null);");
      }

      public void onUpgrade(SQLiteDatabase var1, int var2, int var3) {
         h6.b var5 = h6.a.b(m);
         StringBuilder var4 = new StringBuilder();
         var4.append("Upgrading database from version ");
         var4.append(var2);
         var4.append(" to ");
         var4.append(var3);
         var4.append(", which will destroy all old data");
         var5.k(var4.toString());
         var1.execSQL("DROP TABLE IF EXISTS history");
         this.onCreate(var1);
      }
   }
}
