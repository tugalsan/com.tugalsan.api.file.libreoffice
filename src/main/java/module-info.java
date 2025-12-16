module com.tugalsan.api.file.libreoffice {
    requires com.tugalsan.api.log;
    requires com.tugalsan.api.function;
    requires com.tugalsan.api.union;
    requires jodconverter.core;
    requires jodconverter.local;
    requires jodconverter.local.lo;
//    requires juh;
//    requires jurt;
//    requires ridl;
//    requires unoil;
    exports com.tugalsan.api.file.libreoffice.server;
}
