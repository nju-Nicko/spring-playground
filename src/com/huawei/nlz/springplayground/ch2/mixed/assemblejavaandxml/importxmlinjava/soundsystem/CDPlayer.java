package com.huawei.nlz.springplayground.ch2.mixed.assemblejavaandxml.importxmlinjava.soundsystem;

public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;

    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }

    @Override
    public void play() {
        cd.play();
    }

}
