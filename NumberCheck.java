package com.example.calsys.testmob;

import android.widget.EditText;

public class NumberCheck {

    public static String username = "";


    public static boolean isValidMobile(EditText editText) {
        String num = editText.getText().toString();

        boolean check = false;
        if (num.length() == 10) {
            editText.setError(null);
            check = true;
        } else {
            check = false;
            editText.setError("Not Valid Number");
        }
        return check;
    }




}
