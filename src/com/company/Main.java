package com.company;

import com.company.Cryptor.Cryptor;
import com.company.Plugins.BasePlugin;
import com.company.Plugins.PluginLoader;

public class Main {

    public static void main(String[] args) {
        String classPath = "C:\\Users\\Sergei-Pc\\Documents\\ClassLoader\\out\\production\\ClassLoader\\com\\company\\Plugins\\";

        PluginLoader pluginLoader = new PluginLoader(classPath);
        BasePlugin basePlugin2 = (BasePlugin) pluginLoader.load("Plugin2.class");
        basePlugin2.printPluginName();

        Cryptor.crypt(classPath+"Plugin1.class",classPath+"Plugin1Crypted.class");
        BasePlugin basePlugin1CryptTest=(BasePlugin)pluginLoader.load("Plugin1Crypted.class",true);
        basePlugin1CryptTest.printPluginName();
        basePlugin1CryptTest.printPluginName();
    }
}
