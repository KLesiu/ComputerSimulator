package org.example.File.ImageFile;

public class GifImageFile extends AbstractImageFile {
    public GifImageFile(String name, int size){
        super(name,size);
    }
    public void showAnimation(){
        System.out.println("Showing funny GIF");
    }
}
