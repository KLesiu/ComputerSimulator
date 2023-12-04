package org.example.File.ImageFile;

import org.example.File.AbstractFile;
import org.example.File.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
        super(name,size);
    }


    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
