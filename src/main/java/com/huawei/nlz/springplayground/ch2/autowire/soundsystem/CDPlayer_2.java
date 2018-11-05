package com.huawei.nlz.springplayground.ch2.autowire.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cdPlayer_2")
public class CDPlayer_2 implements MediaPlayer {

    private CompactDisc cd;

    // @Autowired
    /*
     * @Autowired注解作用在setter上实现自动装配。
     */
    /*public void setCd(CompactDisc cd){
        System.out.println("enter CDPlayer_2's setter.");
        this.cd = cd;
        System.out.println("leave CDPlayer_2's setter.");
    }*/

    @Autowired
    /*
     * @Autowired注解作用在普通方法上实现自动装配。
     */
    public void amethod(CompactDisc cd){
        System.out.println("enter CDPlayer_2's amethod.");
        this.cd = cd;
        System.out.println("leave CDPlayer_2's amethod.");
    }

    @Autowired(required=false)
    /*
     * @Autowired注解根据类型注入依赖，这里我多写了一个基本类型参数intVal，然而Spring上下文里没有int型bean，这时Spring会抛出异常。
     * 设置@Autowired的required为false，表示如果在上下文里没有这个类型的bean就不进行装配。这里没有int型bean，就不会调用bmethod方法。
     * 如果多个bean满足依赖，Spring也会抛出异常。
     */
    public void bmethod(CompactDisc cd, int intVal){
        System.out.println("enter CDPlayer_2's bmethod.");
        System.out.println("leave CDPlayer_2's bmethod.");
    }

    @Override
    public void play() {
        cd.play();
    }

}