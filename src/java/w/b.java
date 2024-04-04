package w;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;

public interface b extends MenuItem {
   b a(androidx.core.view.b var1);

   androidx.core.view.b b();

   boolean collapseActionView();

   boolean expandActionView();

   View getActionView();

   int getAlphabeticModifiers();

   CharSequence getContentDescription();

   ColorStateList getIconTintList();

   PorterDuff.Mode getIconTintMode();

   int getNumericModifiers();

   CharSequence getTooltipText();

   boolean isActionViewExpanded();

   MenuItem setActionView(int var1);

   MenuItem setActionView(View var1);

   MenuItem setAlphabeticShortcut(char var1, int var2);

   b setContentDescription(CharSequence var1);

   MenuItem setIconTintList(ColorStateList var1);

   MenuItem setIconTintMode(PorterDuff.Mode var1);

   MenuItem setNumericShortcut(char var1, int var2);

   MenuItem setShortcut(char var1, char var2, int var3, int var4);

   void setShowAsAction(int var1);

   MenuItem setShowAsActionFlags(int var1);

   b setTooltipText(CharSequence var1);
}
