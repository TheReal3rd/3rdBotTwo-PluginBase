package me.third.right.pluginBase;

import me.third.right.thirdBot.command.Cmd;
import me.third.right.thirdBot.plugins.PluginBase;
import me.third.right.thirdBot.plugins.PluginInfo;

@PluginInfo(name = "PluginBase", description = "Sample Plugin", author = "ThirdRight")
public class Main extends PluginBase {

    @Override
    public Cmd[] regCommands() {
        return new Cmd[] {new SampleCommand()};
    }
}
