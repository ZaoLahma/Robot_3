package com.github.zaolahma;

import com.github.zaolahma.core.scheduler.Scheduler;
import com.github.zaolahma.core.config.Config;
import com.github.zaolahma.driver.camera.Camera;
import com.github.zaolahma.driver.mcu.Mcu;

public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Config config = new Config();
        Mcu mcu = new Mcu();
        Camera camera = new Camera();
        Scheduler scheduler = new Scheduler();
    }
}
