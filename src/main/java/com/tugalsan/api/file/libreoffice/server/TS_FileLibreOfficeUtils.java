package com.tugalsan.api.file.libreoffice.server;

import com.tugalsan.api.log.server.TS_Log;
import java.util.function.Supplier;

public class TS_FileLibreOfficeUtils {

    private TS_FileLibreOfficeUtils() {

    }

    final private static Supplier<TS_Log> d = StableValue.supplier(() -> TS_Log.of(TS_FileLibreOfficeUtils.class));

}
