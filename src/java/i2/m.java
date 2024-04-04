package i2;

import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

public class m {
   private static final Pattern a = Pattern.compile("\\$\\{(.*?)\\}");

   @EnsuresNonNullIf(
      expression = {"#1"},
      result = false
   )
   public static boolean a(String var0) {
      return var0 == null || var0.trim().isEmpty();
   }
}
