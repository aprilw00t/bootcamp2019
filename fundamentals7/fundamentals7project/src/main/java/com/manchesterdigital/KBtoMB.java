package com.manchesterdigital;

public class KBtoMB {
    static String KBtoMBConverter(int KB){int mb = KB/1024;
    int kb = KB % 1024;
    return Integer.toString(mb) + "MB, " + Integer.toString(kb) + "KB";}


}
