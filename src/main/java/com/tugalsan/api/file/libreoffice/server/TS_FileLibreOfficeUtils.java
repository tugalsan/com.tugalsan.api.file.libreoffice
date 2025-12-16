package com.tugalsan.api.file.libreoffice.server;

import module com.tugalsan.api.function;
import module com.tugalsan.api.union;
import java.nio.file.Path;
import org.jodconverter.local.*;

import module com.tugalsan.api.log;

public class TS_FileLibreOfficeUtils {

    private TS_FileLibreOfficeUtils() {

    }

    final private static TS_Log d = TS_Log.of(TS_FileLibreOfficeUtils.class);

    public static TGS_UnionExcuseVoid convert(Path input, Path output) {
        return TGS_FuncMTCUtils.call(() -> {
            JodConverter.convert(input.toFile()).to(output.toFile()).execute();
            return TGS_UnionExcuseVoid.ofVoid();
        }, e -> TGS_UnionExcuseVoid.ofExcuse(e));
    }
}
