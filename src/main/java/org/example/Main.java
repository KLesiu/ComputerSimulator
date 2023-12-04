package org.example;

import org.example.Drive.Drive;
import org.example.Drive.HDDDrive;
import org.example.File.File;
import org.example.File.ImageFile.GifImageFile;
import org.example.File.ImageFile.JPGImageFile;
import org.example.File.MusicFile.MP3MusicFile;


public class Main {
    public static void main(String[] args) {

        GifImageFile gifOne = new GifImageFile("name1.gif", 100);
        JPGImageFile jpgOne = new JPGImageFile("name1.jpg", 200, 80);
        MP3MusicFile mp3One = new MP3MusicFile("file.mp3", 4000, "Enej", "Skrzydlate Ręce", 100);;

        Drive drive = new HDDDrive();
        drive.addFile(gifOne);
        drive.addFile(jpgOne);
        drive.addFile(mp3One);

        drive.listFiles();

        File file = drive.findFile("file.mp3");
        System.out.println(file.getSize());

    }
}