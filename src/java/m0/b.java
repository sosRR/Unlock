package m0;

public class b {
   public static String a(String var0) {
      StringBuilder var1 = new StringBuilder();
      var1.append("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
      var1.append(var0);
      var1.append("')");
      return var1.toString();
   }
}
