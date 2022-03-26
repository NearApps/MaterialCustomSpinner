package com.near.library.materialcustomspinner.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.inputmethod.InputMethodManager;

import com.near.library.materialcustomspinner.MultipleSpinner;

import java.text.Normalizer;

public class SpinnerUtils {

    private static final String TAG = SpinnerUtils.class.getSimpleName();

    public static class variables{
        public static int color_primary = Color.GRAY;
    }

    public static class funciones{
        public static String removeDiacriticalMarks(String string) {
            return Normalizer.normalize(string, Normalizer.Form.NFD)
                    .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        }
        public static void hideSoftKeyboard(Context mContext) {
            if (mContext instanceof Activity) {
                Activity activity = (Activity) mContext;
                InputMethodManager inputMethodManager = (InputMethodManager) mContext.getSystemService(Context.INPUT_METHOD_SERVICE);
                if (inputMethodManager != null && activity.getCurrentFocus() != null)
                    inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
            }
        }
    }

}
