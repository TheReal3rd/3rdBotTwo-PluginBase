package me.third.right.pluginBase;


import me.third.right.thirdBot.command.Cmd;
import me.third.right.thirdBot.command.CmdInfo;
import me.third.right.thirdBot.utils.enums.Authority;
import org.javacord.api.event.message.MessageCreateEvent;

@CmdInfo(name = "sample", description = "Sample command", authority = Authority.ADMIN)
public class SampleCommand extends Cmd {

    @Override
    public void onMessage(MessageCreateEvent messageCreateEvent, String[] strings) {
        messageCreateEvent.getChannel().sendMessage("Plugin Working.");
    }
}
