package fyi.library.multifonttextclock;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextClock;


public class MultiFontTextClock extends TextClock {

    private static final String LOG_TAG = "MultiFontTextClock";

    public MultiFontTextClock(Context context) {
        super(context);
    }

    public MultiFontTextClock(Context context, AttributeSet attrs) {
        super(context, attrs);
        initializeCustomTypeface(attrs, context);
    }

    public MultiFontTextClock(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initializeCustomTypeface(attrs, context);
    }

    private void initializeCustomTypeface(AttributeSet attrs, Context context) {
        if (attrs != null) {

            TypedArray attributesArray = context.obtainStyledAttributes(attrs,
                    R.styleable.MultiFontTextClock);
            int fontID = attributesArray.getInt(R.styleable.MultiFontTextClock_typeface_from_list, -1);
            String[] fontStringArray = context.getResources().getStringArray(R.array.customFonts);

            //if a typeface is selected for the TextClock and if the font names are declared in the
            // string array customFonts then load that typeface from cache
            if ((fontID != -1) && (fontStringArray.length != 0)) {
                try {
                    Typeface myTypeface = FontLoader.getTypeface(context, fontStringArray[fontID]);
                    setTypeface(myTypeface);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                Log.e(LOG_TAG, "Either of the string array CustomFonts or" +
                        " attribute typeface_from_list is not present" + fontID);
            }
            attributesArray.recycle();
        }

    }

}
