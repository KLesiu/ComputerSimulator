package org.example.Drive;

import org.example.File.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
