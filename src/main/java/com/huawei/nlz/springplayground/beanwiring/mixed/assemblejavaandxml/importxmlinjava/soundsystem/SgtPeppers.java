package com.huawei.nlz.springplayground.beanwiring.mixed.assemblejavaandxml.importxmlinjava.soundsystem;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SgtPeppers implements CompactDisc {

    @Override
    public void play() {
        if (log.isInfoEnabled()) {
            log.info("sgtPeppers play.");
        }
    }

}
