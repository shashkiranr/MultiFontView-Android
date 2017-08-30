package fyi.library.multifontswitch;


import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;

/*
This font loader class is obtained from Future Studio - "Custom Fonts on Android — Extending TextView"
for more info please visit https://futurestud.io
*
* */
public class FontLoader {
    private static HashMap<String, Typeface> fontMapCache = new HashMap<>();

    public static Typeface getTypeface(Context context, String fontname) {
        Typeface typeface = fontMapCache.get(fontname);

        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + fontname);
            } catch (Exception e) {
                return null;
            }

            fontMapCache.put(fontname, typeface);
        }

        return typeface;
    }
}
