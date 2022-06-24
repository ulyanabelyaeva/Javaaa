package com.Task7;

public class AdapterPNGtoSVG extends PNGImage implements SVGImageInterface{
    @Override
    public void getImageCat() {
        getPngImageCat();
    }

    @Override
    public void getImageDog() {
        getPngImageDog();
    }
}
