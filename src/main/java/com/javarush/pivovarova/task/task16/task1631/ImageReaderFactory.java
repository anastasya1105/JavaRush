package com.javarush.pivovarova.task.task16.task1631;

import com.javarush.pivovarova.task.task16.task1631.common.*;

import static com.javarush.pivovarova.task.task16.task1631.common.ImageTypes.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes types) {
        if (types == null) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        if (types == JPG) {
            return new JpgReader();
        }
        if (types == BMP) {
            return new BmpReader();
        }
        else  {
            return new PngReader();
        }
    }
}
