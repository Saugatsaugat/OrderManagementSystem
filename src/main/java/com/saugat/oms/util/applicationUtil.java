package com.saugat.oms.util;

import com.saugat.oms.entity.User;

public class applicationUtil {
    public static String getCurrentUserEmail(){
        // TODO
        User currentUser = new User();
        return currentUser.getEmail();
    }
}
