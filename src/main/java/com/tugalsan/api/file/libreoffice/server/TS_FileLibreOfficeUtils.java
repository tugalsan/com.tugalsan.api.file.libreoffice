package com.tugalsan.api.file.libreoffice.server;

import com.tugalsan.api.log.server.TS_Log;

public class TS_FileLibreOfficeUtils {

    private TS_FileLibreOfficeUtils() {

    }

    
    private static TS_Log d() {
        return d.orElse(TS_Log.of(TS_FileLibreOfficeUtils.class));
    }
    final private static StableValue<TS_Log> d = StableValue.of();

   
}
