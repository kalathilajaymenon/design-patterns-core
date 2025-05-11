package org.rackbox.patterns.struct.proxy;

/**
 * RealImage class that implements the Image interface.
 * This class represents a real image that is loaded from disk.
 */
public class RealImage implements Image {

    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + filename);
    }
}
